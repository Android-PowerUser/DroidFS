package sushi.hardcore.droidfs.add_volume

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.addCallback
import sushi.hardcore.droidfs.*
import sushi.hardcore.droidfs.databinding.ActivityAddVolumeBinding
import sushi.hardcore.droidfs.explorers.ExplorerRouter

// AddVolumeActivity ist eine Aktivität, die es dem Benutzer ermöglicht, ein neues Volume hinzuzufügen oder ein vorhandenes Volume zu öffnen.
class AddVolumeActivity: BaseActivity() {

    companion object {
        const val RESULT_USER_BACK = 10
    }

    // Deklaration der Variablen
    private lateinit var binding: ActivityAddVolumeBinding
    private lateinit var explorerRouter: ExplorerRouter
    private lateinit var volumeOpener: VolumeOpener

    // onCreate-Methode wird aufgerufen, wenn die Aktivität erstellt wird
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialisierung der View-Bindung
        binding = ActivityAddVolumeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Aktivieren des Zurück-Buttons in der ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Initialisierung des ExplorerRouters und des VolumeOpeners
        explorerRouter = ExplorerRouter(this, intent)
        volumeOpener = VolumeOpener(this)
        // Laden des SelectPathFragment, wenn kein gespeicherter Zustand vorhanden ist
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(
                    R.id.fragment_container,
                    SelectPathFragment.newInstance(theme, explorerRouter.pickMode),
                )
                .commit()
        }
        // Hinzufügen eines Rückrufes für die Zurück-Taste
        onBackPressedDispatcher.addCallback(this) {
            setResult(RESULT_USER_BACK)
            isEnabled = false
            onBackPressedDispatcher.onBackPressed()
        }
    }

    // onOptionsItemSelected-Methode wird aufgerufen, wenn ein Menüelement ausgewählt wird
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            if (supportFragmentManager.backStackEntryCount > 0)
                supportFragmentManager.popBackStack()
            else {
                setResult(RESULT_USER_BACK)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    // Methode, die aufgerufen wird, wenn ein Fragment geladen wird
    fun onFragmentLoaded(selectPathFragment: Boolean) {
        title = getString(
            if (selectPathFragment) {
                R.string.add_volume
            } else {
                R.string.create_volume
            }
        )
    }

    // Methode zum Starten des Explorers
    fun startExplorer(volumeId: Int, volumeShortName: String) {
        startActivity(explorerRouter.getExplorerIntent(volumeId, volumeShortName))
        finish()
    }

    // Methode, die aufgerufen wird, wenn ein Volume hinzugefügt wurde
    fun onVolumeAdded() {
        setResult(RESULT_USER_BACK)
        finish()
    }

    // Methode zum Öffnen eines Volumes
    fun openVolume(volume: VolumeData, isVolumeKnown: Boolean) {
        volumeOpener.openVolume(volume, isVolumeKnown, object : VolumeOpener.VolumeOpenerCallbacks {
            override fun onVolumeOpened(id: Int) {
                startExplorer(id, volume.shortName)
            }
        })
    }

    // Methode zum Erstellen eines Volumes
    fun createVolume(volumePath: String, isHidden: Boolean, rememberVolume: Boolean) {
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragment_container, CreateVolumeFragment.newInstance(
                    theme,
                    volumePath,
                    isHidden,
                    rememberVolume,
                    sharedPrefs.getBoolean(Constants.PIN_PASSWORDS_KEY, false),
                    sharedPrefs.getBoolean("usf_fingerprint", false),
                )
            )
            .addToBackStack(null)
            .commit()
    }
}
