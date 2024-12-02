package sushi.hardcore.droidfs

import android.app.Service
import android.content.Intent

/**
 * ClosingService ist ein Dummy-Hintergrunddienst, der auf das Entfernen von Anwendungstasks hört, um alle noch geöffneten Volumes beim Beenden zu schließen.
 * 
 * Der Dienst sollte nur ausgeführt werden, wenn usfBackground aktiviert und usfKeepOpen deaktiviert ist.
 */
class ClosingService : Service() {
    // Methode, die aufgerufen wird, wenn der Dienst gebunden wird
    override fun onBind(intent: Intent) = null

    // Methode, die aufgerufen wird, wenn eine Anwendungstask entfernt wird
    override fun onTaskRemoved(rootIntent: Intent) {
        super.onTaskRemoved(rootIntent)
        // Schließen aller offenen Volumes
        (application as VolumeManagerApp).volumeManager.closeAll()
        // Beenden des Dienstes
        stopSelf()
    }
}
