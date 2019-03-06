

@REM Sicherstellen, dass Ausgabe-Verzeichnis fuer Compiler existiert
@if not exist classes md classes

javac -d classes -sourcepath src src/de/mide/vigenere/*.java
@REM -d          : Destination folder (Zielverzeichnis fuer class-Dateien)
@REM -sourcepath : Einstiegsverzeichnis fuer Java-Quellcode-Dateien
