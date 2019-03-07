#!/bin/bash

# Skript zum Erzeugen der JavaDoc-Doku unter Linux und MacOS.

# Sicherstellen dass Ausgabeverzeichnis existiert
mkdir -p javadoc
# -p: Keinen Fehler ausgeben, wenn das Verzeichnis schon existiert

javadoc  -private -doctitle "Vigenere-Chiffre" -d javadoc -sourcepath src -charset "UTF-8" -encoding "UTF-8" -docencoding "UTF-8" -subpackages de.mide.vigenere #-html5
        
