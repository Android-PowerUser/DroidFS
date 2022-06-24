package sushi.hardcore.droidfs.file_viewers

import android.annotation.SuppressLint
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import sushi.hardcore.droidfs.ConstValues
import sushi.hardcore.droidfs.R
import sushi.hardcore.droidfs.widgets.CustomAlertDialogBuilder
import java.io.ByteArrayInputStream
import java.io.File

class TextEditor: FileViewerActivity() {
    private lateinit var fileName: String
    private lateinit var editor: EditText
    private var changedSinceLastSave = false
    private var wordWrap = true
    override fun hideSystemUi() {
        //don't hide system ui
    }

    override fun getFileType(): String {
        return "text"
    }

    override fun viewFile() {
        loadWholeFile(filePath)?.let {
            fileName = File(filePath).name
            try {
                loadLayout(String(it))
            } catch (e: OutOfMemoryError){
                CustomAlertDialogBuilder(this, themeValue)
                    .setTitle(R.string.error)
                    .setMessage(R.string.outofmemoryerror_msg)
                    .setCancelable(false)
                    .setPositiveButton(R.string.ok) { _, _ -> goBackToExplorer()}
                    .show()
            }
        }
    }
    private fun loadLayout(fileContent: String){
        if (wordWrap){
            setContentView(R.layout.activity_text_editor_wrap)
        } else {
            setContentView(R.layout.activity_text_editor)
        }
        title = fileName
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        editor = findViewById(R.id.text_editor)
        editor.setText(fileContent)
        editor.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!changedSinceLastSave){
                    changedSinceLastSave = true
                    @SuppressLint("SetTextI18n")
                    title = "*$fileName"
                }
            }
        })
    }
    private fun save(): Boolean{
        var success = false
        val content = editor.text.toString().toByteArray()
        val fileHandle = encryptedVolume.openFile(filePath)
        if (fileHandle != -1L) {
            val buff = ByteArrayInputStream(content)
            var offset: Long = 0
            val ioBuffer = ByteArray(ConstValues.IO_BUFF_SIZE)
            var length: Int
            while (buff.read(ioBuffer).also { length = it } > 0) {
                val written = encryptedVolume.write(fileHandle, offset, ioBuffer, length).toLong()
                if (written == length.toLong()) {
                    offset += written
                } else {
                    break
                }
            }
            if (offset == content.size.toLong()){
                success = encryptedVolume.truncate(filePath, offset)
            }
            encryptedVolume.closeFile(fileHandle)
            buff.close()
        }
        if (success){
            Toast.makeText(this, getString(R.string.file_saved), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, getString(R.string.save_failed), Toast.LENGTH_SHORT).show()
        }
        return success
    }

    private fun checkSaveAndExit(){
        if (changedSinceLastSave){
            CustomAlertDialogBuilder(this, themeValue)
                .setTitle(R.string.warning)
                .setMessage(R.string.ask_save)
                .setPositiveButton(R.string.save) { _, _ ->
                    if (save()){
                        goBackToExplorer()
                    }
                }
                .setNegativeButton(R.string.discard){ _, _ -> goBackToExplorer()}
                .show()
        } else {
            goBackToExplorer()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.text_editor, menu)
        menu.findItem(R.id.word_wrap).isChecked = wordWrap
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                checkSaveAndExit()
            }
            R.id.menu_save -> {
                if (save()){
                    changedSinceLastSave = false
                    title = fileName
                }
            }
            R.id.word_wrap -> {
                wordWrap = !item.isChecked
                loadLayout(editor.text.toString())
                invalidateOptionsMenu()
            }
            else -> super.onOptionsItemSelected(item)
        }
        return true
    }

    override fun onBackPressed() {
        checkSaveAndExit()
    }
}
