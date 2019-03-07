#!/bin/bash

# Sicherstellen, dass Ausgabe-Verzeichnis fuer Compiler existiert
mkdir -p classes
# -p: Keinen Fehler ausgeben, wenn das Verzeichnis schon existiert

javac -d classes -sourcepath src src/de/mide/vigenere/*.java
# -d          : Destination folder (Zielverzeichnis fuer class-Dateien)
# -sourcepath : Einstiegsverzeichnis fuer Java-Quellcode-Dateien
