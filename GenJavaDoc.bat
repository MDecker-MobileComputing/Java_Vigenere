
@REM Skript zum Erzeugen der JavaDoc-Doku unter Windows

@REM Sicherstellen dass Ausgabeverzeichnis existiert
@if not exist javadoc md javadoc

javadoc -private -doctitle "Vigenere-Chiffre" -d javadoc -sourcepath src -charset "UTF-8" -encoding "UTF-8" -docencoding "UTF-8" -subpackages de.mide.vigenere -html5
        
