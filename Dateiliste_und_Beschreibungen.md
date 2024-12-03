# Dateiliste und Beschreibungen

Dieses Dokument bietet eine detaillierte Liste aller Dateien und Verzeichnisse im Repo und deren Funktionen und Inhalte.

## Dateien im Stammverzeichnis

### .github
- **Funktion**: Enthält GitHub-spezifische Konfigurationsdateien.
- **Inhalt**: Workflows, Issue-Vorlagen und andere GitHub-bezogene Einstellungen.

#### .github/workflows
- **Funktion**: Enthält GitHub Actions Workflow-Dateien.
- **Inhalt**: Workflow-Definitionen für CI/CD-Pipelines.

#### .github/workflows/android.yml
- **Funktion**: Definiert den CI-Workflow zum Erstellen des Android-Projekts.
- **Inhalt**: Schritte zum Einrichten des JDK, Erteilen von Berechtigungen und Erstellen mit Gradle.

### .gitignore
- **Funktion**: Gibt Dateien und Verzeichnisse an, die von Git ignoriert werden sollen.
- **Inhalt**: Muster für Dateien und Verzeichnisse, die ignoriert werden sollen, wie Build-Artefakte und temporäre Dateien.

### .gitmodules
- **Funktion**: Definiert Submodule für das Repository.
- **Inhalt**: Submodulpfade und URLs.

### app
- **Funktion**: Enthält den Hauptanwendungscode und Ressourcen.
- **Inhalt**: Quellcode, Ressourcen und Konfigurationsdateien für die Android-Anwendung.

#### app/build.gradle
- **Funktion**: Gradle-Build-Skript für das App-Modul.
- **Inhalt**: Build-Konfiguration, Abhängigkeiten und Aufgaben für das App-Modul.

#### app/CMakeLists.txt
- **Funktion**: CMake-Build-Skript für nativen Code.
- **Inhalt**: Konfiguration zum Erstellen nativer Bibliotheken.

#### app/ffmpeg
- **Funktion**: Enthält FFmpeg-bezogene Dateien.
- **Inhalt**: FFmpeg-Build-Skripte und Konfiguration.

#### app/ffmpeg/.gitignore
- **Funktion**: Gibt Dateien und Verzeichnisse an, die von Git innerhalb des FFmpeg-Verzeichnisses ignoriert werden sollen.
- **Inhalt**: Muster für Dateien und Verzeichnisse, die ignoriert werden sollen.

#### app/ffmpeg/build.sh
- **Funktion**: Shell-Skript zum Erstellen von FFmpeg für verschiedene Architekturen.
- **Inhalt**: Schritte zur Konfiguration und Kompilierung von FFmpeg.

#### app/proguard-rules.pro
- **Funktion**: ProGuard-Regeln für Code-Obfuskation und -Optimierung.
- **Inhalt**: Regeln zum Beibehalten bestimmter Klassen und Methoden.

#### app/src/main/AndroidManifest.xml
- **Funktion**: Android-Manifestdatei für das App-Modul.
- **Inhalt**: Anwendungs-Konfiguration, Berechtigungen und Komponenten.

#### app/src/main/java
- **Funktion**: Enthält Java- und Kotlin-Quellcode für das App-Modul.
- **Inhalt**: Quellcodedateien für verschiedene Funktionen und Funktionalitäten.

##### app/src/main/java/androidx/camera/video/MediaMuxer.kt
- **Funktion**: Schnittstelle für MediaMuxer.
- **Inhalt**: Methoden zur Verwaltung von MediaMuxer-Operationen.

##### app/src/main/java/sushi/hardcore/droidfs/adapters/ExplorerElementAdapter.kt
- **Funktion**: Adapter für Explorer-Elemente.
- **Inhalt**: Verwaltung der Anzeige und Interaktion von Explorer-Elementen.

##### app/src/main/java/sushi/hardcore/droidfs/BaseActivity.kt
- **Funktion**: Basisklasse für Aktivitäten.
- **Inhalt**: Gemeinsame Funktionalitäten und Einstellungen für Aktivitäten.

##### app/src/main/java/sushi/hardcore/droidfs/ClosingService.kt
- **Funktion**: Hintergrunddienst zum Schließen von Volumes.
- **Inhalt**: Schließt alle offenen Volumes beim Entfernen von Anwendungstasks.

##### app/src/main/java/sushi/hardcore/droidfs/collation/ByteString.kt
- **Funktion**: Klasse für Byte-Strings.
- **Inhalt**: Verwaltung und Vergleich von Byte-Strings.

##### app/src/main/java/sushi/hardcore/droidfs/collation/ByteStringBuilder.kt
- **Funktion**: Builder für Byte-Strings.
- **Inhalt**: Erstellung und Verwaltung von Byte-Strings.

##### app/src/main/java/sushi/hardcore/droidfs/Constants.kt
- **Funktion**: Enthält Konstanten für die Anwendung.
- **Inhalt**: Definition von Konstanten wie Datenbanknamen und Puffergrößen.

##### app/src/main/java/sushi/hardcore/droidfs/explorers/BaseExplorerActivity.kt
- **Funktion**: Basisklasse für Explorer-Aktivitäten.
- **Inhalt**: Gemeinsame Funktionalitäten und Einstellungen für Explorer-Aktivitäten.

##### app/src/main/java/sushi/hardcore/droidfs/MainActivity.kt
- **Funktion**: Hauptaktivität der Anwendung.
- **Inhalt**: Verwaltung der Hauptbenutzeroberfläche und Navigation.

### build.gradle
- **Funktion**: Gradle-Build-Skript für das Projekt.
- **Inhalt**: Build-Konfiguration, Abhängigkeiten und Aufgaben für das Projekt.

### gradle
- **Funktion**: Enthält Gradle Wrapper-Dateien.
- **Inhalt**: Wrapper-Skripte und Eigenschaften für Gradle.

### gradlew
- **Funktion**: Unix-Shell-Skript zum Ausführen des Gradle Wrappers.
- **Inhalt**: Skript zum Ausführen von Gradle-Aufgaben ohne lokale Gradle-Installation.

### gradlew.bat
- **Funktion**: Windows-Batch-Skript zum Ausführen des Gradle Wrappers.
- **Inhalt**: Skript zum Ausführen von Gradle-Aufgaben ohne lokale Gradle-Installation.

### LICENSE.txt
- **Funktion**: Lizenzdatei für das Projekt.
- **Inhalt**: Text der Projektlizenz.

### README.md
- **Funktion**: Readme-Datei für das Projekt.
- **Inhalt**: Projektbeschreibung, Funktionen und Nutzungshinweise.

### settings.gradle
- **Funktion**: Gradle-Einstellungsskript für das Projekt.
- **Inhalt**: Konfiguration für Gradle-Projekteinstellungen.

### TODO.md
- **Funktion**: Liste geplanter Funktionen und Aufgaben für das Projekt.
- **Inhalt**: Detaillierte Liste der zu implementierenden Funktionen und Aufgaben.

### BUILD.md
- **Funktion**: Build-Anweisungen für das Projekt.
- **Inhalt**: Detaillierte Schritte zum Erstellen des Projekts aus dem Quellcode.

### DONATE.txt
- **Funktion**: Spendeninformationen für das Projekt.
- **Inhalt**: Details zur finanziellen Unterstützung des Projekts.

### fastlane
- **Funktion**: Enthält Metadaten für das Fastlane-Tool.
- **Inhalt**: Metadatendateien für verschiedene Sprachen und Screenshots.

### gradle.properties
- **Funktion**: Gradle-Eigenschaftendatei.
- **Inhalt**: Konfigurationseigenschaften für den Gradle-Build.

### gradle/wrapper
- **Funktion**: Enthält Gradle Wrapper-Eigenschaften.
- **Inhalt**: Wrapper-Eigenschaften und Jar-Dateien für Gradle.

### Dateiliste_und_Beschreibungen.md
- **Funktion**: Diese Datei, die alle Dateien und Verzeichnisse im Stammverzeichnis und darüber hinaus auflistet.
- **Inhalt**: Detaillierte Liste der Dateien und Verzeichnisse, deren Funktionen und Inhalte.

### app/src/main/java/sushi/hardcore/droidfs/adapters/IconTextDialogAdapter.kt
- **Funktion**: Adapter für Dialoge mit Symbolen und Text.
- **Inhalt**: Verwaltung der Anzeige und Interaktion von Dialogen mit Symbolen und Text.

### app/src/main/java/sushi/hardcore/droidfs/adapters/OpenAsDialogAdapter.kt
- **Funktion**: Adapter für "Öffnen als"-Dialoge.
- **Inhalt**: Verwaltung der Anzeige und Interaktion von "Öffnen als"-Dialogen.

### app/src/main/java/sushi/hardcore/droidfs/adapters/SelectableAdapter.kt
- **Funktion**: Adapter für auswählbare Elemente.
- **Inhalt**: Verwaltung der Anzeige und Interaktion von auswählbaren Elementen.

### app/src/main/java/sushi/hardcore/droidfs/adapters/VolumeAdapter.kt
- **Funktion**: Adapter für Volumes.
- **Inhalt**: Verwaltung der Anzeige und Interaktion von Volumes.

### app/src/main/java/sushi/hardcore/droidfs/add_volume/Action.kt
- **Funktion**: Definiert Aktionen für das Hinzufügen von Volumes.
- **Inhalt**: Aktionen wie Öffnen, Hinzufügen und Erstellen von Volumes.

### app/src/main/java/sushi/hardcore/droidfs/add_volume/AddVolumeActivity.kt
- **Funktion**: Aktivität zum Hinzufügen von Volumes.
- **Inhalt**: Benutzeroberfläche und Logik zum Hinzufügen von Volumes.

### app/src/main/java/sushi/hardcore/droidfs/add_volume/CreateVolumeFragment.kt
- **Funktion**: Fragment zum Erstellen von Volumes.
- **Inhalt**: Benutzeroberfläche und Logik zum Erstellen von Volumes.

### app/src/main/java/sushi/hardcore/droidfs/add_volume/SelectPathFragment.kt
- **Funktion**: Fragment zum Auswählen von Pfaden.
- **Inhalt**: Benutzeroberfläche und Logik zum Auswählen von Pfaden.

### app/src/main/java/sushi/hardcore/droidfs/CameraActivity.kt
- **Funktion**: Aktivität für die Kamera.
- **Inhalt**: Benutzeroberfläche und Logik für die Kamerafunktionalität.

### app/src/main/java/sushi/hardcore/droidfs/ChangePasswordActivity.kt
- **Funktion**: Aktivität zum Ändern des Passworts.
- **Inhalt**: Benutzeroberfläche und Logik zum Ändern des Passworts.

### app/src/main/java/sushi/hardcore/droidfs/content_providers/TemporaryFileProvider.kt
- **Funktion**: ContentProvider für temporäre Dateien.
- **Inhalt**: Verwaltung und Bereitstellung von temporären Dateien.

### app/src/main/java/sushi/hardcore/droidfs/content_providers/VolumeProvider.kt
- **Funktion**: ContentProvider für Volumes.
- **Inhalt**: Verwaltung und Bereitstellung von Volumes.

### app/src/main/java/sushi/hardcore/droidfs/EncryptedFileProvider.kt
- **Funktion**: ContentProvider für verschlüsselte Dateien.
- **Inhalt**: Verwaltung und Bereitstellung von verschlüsselten Dateien.

### app/src/main/java/sushi/hardcore/droidfs/explorers/ExplorerActivityDrop.kt
- **Funktion**: Aktivität für das Explorer-Drop-Feature.
- **Inhalt**: Benutzeroberfläche und Logik für das Explorer-Drop-Feature.

### app/src/main/java/sushi/hardcore/droidfs/explorers/ExplorerActivityPick.kt
- **Funktion**: Aktivität für das Explorer-Pick-Feature.
- **Inhalt**: Benutzeroberfläche und Logik für das Explorer-Pick-Feature.

### app/src/main/java/sushi/hardcore/droidfs/explorers/ExplorerElement.kt
- **Funktion**: Klasse für Explorer-Elemente.
- **Inhalt**: Verwaltung und Darstellung von Explorer-Elementen.

### app/src/main/java/sushi/hardcore/droidfs/explorers/ExplorerRouter.kt
- **Funktion**: Router für Explorer-Funktionen.
- **Inhalt**: Verwaltung der Navigation und Logik für Explorer-Funktionen.

### app/src/main/java/sushi/hardcore/droidfs/file_operations/FileOperationService.kt
- **Funktion**: Dienst für Dateioperationen.
- **Inhalt**: Verwaltung und Ausführung von Dateioperationen.

### app/src/main/java/sushi/hardcore/droidfs/file_operations/OperationFile.kt
- **Funktion**: Klasse für Dateioperationen.
- **Inhalt**: Verwaltung und Ausführung von Dateioperationen.

### app/src/main/java/sushi/hardcore/droidfs/file_operations/TaskResult.kt
- **Funktion**: Klasse für das Ergebnis von Aufgaben.
- **Inhalt**: Verwaltung und Darstellung von Aufgabenergebnissen.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/AudioPlayer.kt
- **Funktion**: Aktivität zum Abspielen von Audiodateien.
- **Inhalt**: Benutzeroberfläche und Logik zum Abspielen von Audiodateien.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/EncryptedVolumeDataSource.kt
- **Funktion**: Datenquelle für verschlüsselte Volumes.
- **Inhalt**: Verwaltung und Bereitstellung von Daten aus verschlüsselten Volumes.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/FileViewerActivity.kt
- **Funktion**: Basisklasse für Dateibetrachter-Aktivitäten.
- **Inhalt**: Gemeinsame Funktionalitäten und Einstellungen für Dateibetrachter-Aktivitäten.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/ImageViewer.kt
- **Funktion**: Aktivität zum Anzeigen von Bildern.
- **Inhalt**: Benutzeroberfläche und Logik zum Anzeigen von Bildern.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/MediaPlayer.kt
- **Funktion**: Klasse für Media-Player-Funktionen.
- **Inhalt**: Verwaltung und Ausführung von Media-Player-Funktionen.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/PdfViewer.kt
- **Funktion**: Aktivität zum Anzeigen von PDF-Dateien.
- **Inhalt**: Benutzeroberfläche und Logik zum Anzeigen von PDF-Dateien.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/TextEditor.kt
- **Funktion**: Aktivität zum Bearbeiten von Textdateien.
- **Inhalt**: Benutzeroberfläche und Logik zum Bearbeiten von Textdateien.

### app/src/main/java/sushi/hardcore/droidfs/file_viewers/VideoPlayer.kt
- **Funktion**: Aktivität zum Abspielen von Videodateien.
- **Inhalt**: Benutzeroberfläche und Logik zum Abspielen von Videodateien.

### app/src/main/java/sushi/hardcore/droidfs/FileShare.kt
- **Funktion**: Klasse für das Teilen von Dateien.
- **Inhalt**: Verwaltung und Ausführung von Datei-Teilen-Operationen.

### app/src/main/java/sushi/hardcore/droidfs/filesystems/CryfsVolume.kt
- **Funktion**: Klasse für CryFS-Volumes.
- **Inhalt**: Verwaltung und Bereitstellung von CryFS-Volumes.

### app/src/main/java/sushi/hardcore/droidfs/filesystems/EncryptedVolume.kt
- **Funktion**: Basisklasse für verschlüsselte Volumes.
- **Inhalt**: Gemeinsame Funktionalitäten und Einstellungen für verschlüsselte Volumes.

### app/src/main/java/sushi/hardcore/droidfs/filesystems/GocryptfsVolume.kt
- **Funktion**: Klasse für Gocryptfs-Volumes.
- **Inhalt**: Verwaltung und Bereitstellung von Gocryptfs-Volumes.

### app/src/main/java/sushi/hardcore/droidfs/filesystems/Stat.kt
- **Funktion**: Klasse für Dateistatistiken.
- **Inhalt**: Verwaltung und Bereitstellung von Dateistatistiken.

### app/src/main/java/sushi/hardcore/droidfs/FileTypes.kt
- **Funktion**: Klasse für Dateitypen.
- **Inhalt**: Verwaltung und Bereitstellung von Dateitypen.

### app/src/main/java/sushi/hardcore/droidfs/FingerprintProtector.kt
- **Funktion**: Klasse für Fingerabdruckschutz.
- **Inhalt**: Verwaltung und Bereitstellung von Fingerabdruckschutzfunktionen.

### app/src/main/java/sushi/hardcore/droidfs/KeepAliveService.kt
- **Funktion**: Dienst zum Offenhalten von Volumes.
- **Inhalt**: Verwaltung und Ausführung von Diensten zum Offenhalten von Volumes.

### app/src/main/java/sushi/hardcore/droidfs/LoadingTask.kt
- **Funktion**: Klasse für Ladeaufgaben.
- **Inhalt**: Verwaltung und Ausführung von Ladeaufgaben.

### app/src/main/java/sushi/hardcore/droidfs/LogcatActivity.kt
- **Funktion**: Aktivität zum Anzeigen von Logcat-Ausgaben.
- **Inhalt**: Benutzeroberfläche und Logik zum Anzeigen von Logcat-Ausgaben.

### app/src/main/java/sushi/hardcore/droidfs/MemFile.kt
- **Funktion**: Klasse für Speicherdateien.
- **Inhalt**: Verwaltung und Bereitstellung von Speicherdateien.

### app/src/main/java/sushi/hardcore/droidfs/NotificationBroadcastReceiver.kt
- **Funktion**: BroadcastReceiver für Benachrichtigungen.
- **Inhalt**: Verwaltung und Ausführung von Benachrichtigungs-Broadcasts.

### app/src/main/java/sushi/hardcore/droidfs/SensorOrientationListener.kt
- **Funktion**: Listener für Sensororientierung.
- **Inhalt**: Verwaltung und Bereitstellung von Sensororientierungsfunktionen.

### app/src/main/java/sushi/hardcore/droidfs/SettingsActivity.kt
- **Funktion**: Aktivität für Einstellungen.
- **Inhalt**: Benutzeroberfläche und Logik für Einstellungen.

### app/src/main/java/sushi/hardcore/droidfs/Theme.kt
- **Funktion**: Klasse für Themen.
- **Inhalt**: Verwaltung und Bereitstellung von Themen.

### app/src/main/java/sushi/hardcore/droidfs/ThumbnailsLoader.kt
- **Funktion**: Klasse zum Laden von Thumbnails.
- **Inhalt**: Verwaltung und Bereitstellung von Thumbnails.

### app/src/main/java/sushi/hardcore/droidfs/util/AndroidUtils.kt
- **Funktion**: Dienstprogrammklasse für Android.
- **Inhalt**: Verschiedene Dienstprogrammfunktionen für Android.

### app/src/main/java/sushi/hardcore/droidfs/util/Compat.kt
- **Funktion**: Kompatibilitätsklasse.
- **Inhalt**: Verwaltung und Bereitstellung von Kompatibilitätsfunktionen.

### app/src/main/java/sushi/hardcore/droidfs/util/IntentUtils.kt
- **Funktion**: Dienstprogrammklasse für Intents.
- **Inhalt**: Verschiedene Dienstprogrammfunktionen für Intents.

### app/src/main/java/sushi/hardcore/droidfs/util/ObjRef.kt
- **Funktion**: Klasse für Objektverweise.
- **Inhalt**: Verwaltung und Bereitstellung von Objektverweisen.

### app/src/main/java/sushi/hardcore/droidfs/util/Observable.kt
- **Funktion**: Klasse für beobachtbare Objekte.
- **Inhalt**: Verwaltung und Bereitstellung von beobachtbaren Objekten.

### app/src/main/java/sushi/hardcore/droidfs/util/PathUtils.kt
- **Funktion**: Dienstprogrammklasse für Pfade.
- **Inhalt**: Verschiedene Dienstprogrammfunktionen für Pfade.

### app/src/main/java/sushi/hardcore/droidfs/util/RingBuffer.kt
- **Funktion**: Klasse für Ringpuffer.
- **Inhalt**: Verwaltung und Bereitstellung von Ringpuffern.

### app/src/main/java/sushi/hardcore/droidfs/util/SQLUtil.kt
- **Funktion**: Dienstprogrammklasse für SQL.
- **Inhalt**: Verschiedene Dienstprogrammfunktionen für SQL.

### app/src/main/java/sushi/hardcore/droidfs/util/UIUtils.kt
- **Funktion**: Dienstprogrammklasse für Benutzeroberflächen.
- **Inhalt**: Verschiedene Dienstprogrammfunktionen für Benutzeroberflächen.

### app/src/main/java/sushi/hardcore/droidfs/util/Version.kt
- **Funktion**: Klasse für Versionsinformationen.
- **Inhalt**: Verwaltung und Bereitstellung von Versionsinformationen.

### app/src/main/java/sushi/hardcore/droidfs/util/Wiper.kt
- **Funktion**: Klasse für Wiper-Funktionen.
- **Inhalt**: Verwaltung und Bereitstellung von Wiper-Funktionen.

### app/src/main/java/sushi/hardcore/droidfs/video_recording/AsynchronousSeekableWriter.kt
- **Funktion**: Klasse für asynchrone beschreibbare Writer.
- **Inhalt**: Verwaltung und Bereitstellung von asynchronen beschreibbaren Writern.

### app/src/main/java/sushi/hardcore/droidfs/video_recording/FFmpegMuxer.kt
- **Funktion**: Klasse für FFmpeg-Muxer.
- **Inhalt**: Verwaltung und Bereitstellung von FFmpeg-Muxern.

### app/src/main/java/sushi/hardcore/droidfs/video_recording/SeekableWriter.kt
- **Funktion**: Klasse für beschreibbare Writer.
- **Inhalt**: Verwaltung und Bereitstellung von beschreibbaren Writern.

### app/src/main/java/sushi/hardcore/droidfs/VolumeData.kt
- **Funktion**: Klasse für Volumedaten.
- **Inhalt**: Verwaltung und Bereitstellung von Volumedaten.

### app/src/main/java/sushi/hardcore/droidfs/VolumeDatabase.kt
- **Funktion**: Klasse für Volumedatenbank.
- **Inhalt**: Verwaltung und Bereitstellung von Volumedatenbanken.

### app/src/main/java/sushi/hardcore/droidfs/VolumeManager.kt
- **Funktion**: Klasse für Volumemanager.
- **Inhalt**: Verwaltung und Bereitstellung von Volumemanagern.

### app/src/main/java/sushi/hardcore/droidfs/VolumeManagerApp.kt
- **Funktion**: Klasse für Volumemanager-Anwendung.
- **Inhalt**: Verwaltung und Bereitstellung von Volumemanager-Anwendungen.

### app/src/main/java/sushi/hardcore/droidfs/VolumeOpener.kt
- **Funktion**: Klasse für Volume-Öffner.
- **Inhalt**: Verwaltung und Bereitstellung von Volume-Öffnern.

### app/src/main/java/sushi/hardcore/droidfs/widgets/CircleClipTapView.kt
- **Funktion**: Klasse für kreisförmige Clip-Tap-Ansicht.
- **Inhalt**: Verwaltung und Bereitstellung von kreisförmigen Clip-Tap-Ansichten.

### app/src/main/java/sushi/hardcore/droidfs/widgets/CustomAlertDialogBuilder.kt
- **Funktion**: Klasse für benutzerdefinierte AlertDialog-Builder.
- **Inhalt**: Verwaltung und Bereitstellung von benutzerdefinierten AlertDialog-Buildern.

### app/src/main/java/sushi/hardcore/droidfs/widgets/DoubleTapOverlay.kt
- **Funktion**: Klasse für Double-Tap-Overlay.
- **Inhalt**: Verwaltung und Bereitstellung von Double-Tap-Overlays.

### app/src/main/java/sushi/hardcore/droidfs/widgets/DoubleTapPlayerView.kt
- **Funktion**: Klasse für Double-Tap-Player-Ansicht.
- **Inhalt**: Verwaltung und Bereitstellung von Double-Tap-Player-Ansichten.

### app/src/main/java/sushi/hardcore/droidfs/widgets/EditTextDialog.kt
- **Funktion**: Klasse für EditText-Dialoge.
- **Inhalt**: Verwaltung und Bereitstellung von EditText-Dialogen.

### app/src/main/java/sushi/hardcore/droidfs/widgets/RingBufferTextView.kt
- **Funktion**: Klasse für Ringpuffer-Textansicht.
- **Inhalt**: Verwaltung und Bereitstellung von Ringpuffer-Textansichten.

### app/src/main/java/sushi/hardcore/droidfs/widgets/TakePhotoButton.kt
- **Funktion**: Klasse für Fotoaufnahme-Button.
- **Inhalt**: Verwaltung und Bereitstellung von Fotoaufnahme-Buttons.

### app/src/main/java/sushi/hardcore/droidfs/widgets/ZoomableImageView.java
- **Funktion**: Klasse für zoombare Bildansicht.
- **Inhalt**: Verwaltung und Bereitstellung von zoombaren Bildansichten.

### app/src/main/native/gocryptfs_jni.c
- **Funktion**: JNI-Implementierung für gocryptfs.
- **Inhalt**: JNI-Code für die Interaktion mit gocryptfs.

### app/src/main/native/libcryfs.c
- **Funktion**: Implementierung für libcryfs.
- **Inhalt**: Code für die Interaktion mit libcryfs.

### app/src/main/native/libmux.c
- **Funktion**: Implementierung für libmux.
- **Inhalt**: Code für die Interaktion mit libmux.

### app/src/main/native/memfile.c
- **Funktion**: Implementierung für Speicherdateien.
- **Inhalt**: Code für die Interaktion mit Speicherdateien.

### app/src/main/res/drawable
- **Funktion**: Enthält Drawable-Ressourcen.
- **Inhalt**: XML-Dateien für verschiedene Symbole und Hintergründe.

### app/src/main/res/layout
- **Funktion**: Enthält Layout-Ressourcen.
- **Inhalt**: XML-Dateien für verschiedene Layouts und Benutzeroberflächen.

### app/src/main/res/menu
- **Funktion**: Enthält Menü-Ressourcen.
- **Inhalt**: XML-Dateien für verschiedene Menüs und Navigationselemente.

### app/src/main/res/mipmap-anydpi-v26
- **Funktion**: Enthält Mipmap-Ressourcen für verschiedene Auflösungen.
- **Inhalt**: XML-Dateien für verschiedene Mipmap-Ressourcen.

### app/src/main/res/values
- **Funktion**: Enthält Werte-Ressourcen.
- **Inhalt**: XML-Dateien für verschiedene Werte und Konfigurationen.

### app/src/main/res/xml
- **Funktion**: Enthält XML-Ressourcen.
- **Inhalt**: XML-Dateien für verschiedene Konfigurationen und Einstellungen.

## Erklärungen zu Begriffen

### Wrapper
Ein Wrapper ist eine Abstraktionsschicht, die eine Schnittstelle zu einer anderen Software oder Bibliothek bereitstellt. Er vereinfacht die Nutzung der zugrunde liegenden Funktionalität, indem er eine einfachere oder benutzerfreundlichere Schnittstelle bietet.

### fastlane
Fastlane ist ein Open-Source-Toolset zur Automatisierung von Aufgaben im Zusammenhang mit der Veröffentlichung von mobilen Apps. Es hilft Entwicklern, Prozesse wie das Erstellen, Testen und Veröffentlichen von Apps zu automatisieren, um Zeit und Aufwand zu sparen.
