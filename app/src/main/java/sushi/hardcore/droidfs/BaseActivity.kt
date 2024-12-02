package sushi.hardcore.droidfs

import android.content.SharedPreferences
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager

// BaseActivity ist eine Basisklasse für alle Aktivitäten in der Anwendung.
// Sie stellt gemeinsame Funktionalitäten und Einstellungen bereit, die von anderen Aktivitäten geerbt werden können.
open class BaseActivity: AppCompatActivity() {
    // Deklaration der Variablen
    protected lateinit var sharedPrefs: SharedPreferences
    protected var applyCustomTheme: Boolean = true
    lateinit var theme: Theme

    // onCreate-Methode wird aufgerufen, wenn die Aktivität erstellt wird
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialisierung der SharedPreferences
        sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this)
        // Initialisierung des Themas
        theme = Theme.fromSharedPrefs(sharedPrefs)
        // Anwenden des benutzerdefinierten Themas, falls aktiviert
        if (applyCustomTheme) {
            setTheme(theme.toResourceId())
        }
        // Deaktivieren von Screenshots, falls die entsprechende Einstellung aktiviert ist
        if (!sharedPrefs.getBoolean("usf_screenshot", false)) {
            window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
        }
    }
}
