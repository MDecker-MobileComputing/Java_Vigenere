package de.mide.vigenere;


/**
 * Ausführbare Klasse (siehe main-Methode) für Ver- und Entschlüsselung
 * mit der sog. Vigenere-Chiffre (symmetrisches Verschlüsselungsverfahren).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class VigenereTest {

    /**
     * Einstiegs-Methode des Programms.<br>
     * 
     * Ein String wird verschlüsselt und gleich danach wieder entschlüsselt.
     *
     * @param args  Wird nicht ausgewertet.
     */
    public static void main (String[] args) {

        // Schlüssel mit vier Bytes (also 4x8=32 Bits => sehr schwach)
        final byte[] schluesselBytes = { (byte)12, (byte)23, (byte)34, (byte)45 };


        // Verschlüsseln
        byte[] chiffreBytes = Vigenere.verschluesseln("Hallo Karlsruhe!", schluesselBytes);

        String chiffreAlsString = new String(chiffreBytes);
        System.out.println("\nChiffre: " + chiffreAlsString);


        // Schlüssel ändern => Entschlüsselung liefert nur noch Kauderwelsch
        //schluesselBytes[0] = (byte)0x23;


        // Entschlüsseln
        String klartext = Vigenere.entschluesseln(chiffreBytes, schluesselBytes);

        System.out.println("\nErgebnis Entschlüsselung: " + klartext + "\n");
    }

}