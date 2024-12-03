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
