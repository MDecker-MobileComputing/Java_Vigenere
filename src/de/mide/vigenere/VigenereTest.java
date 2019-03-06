package de.mide.vigenere;


/**
 * Ausf�hrbare Klasse (siehe main-Methode) f�r Ver- und Entschl�sselung
 * mit der sog. Vigenere-Chiffre (symmetrisches Verschl�sselungsverfahren).
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class VigenereTest {

    /**
     * Einstiegs-Methode des Programms.
     * <br>
     * Ein String wird verschl�sselt und gleich danach wieder entschl�sselt.
     *
     * @param args  Wird nicht ausgewertet.
     */
    public static void main (String[] args) {

        // Schl�ssel mit vier Bytes (also 4x8=32 Bits => sehr schwach)
        final byte[] schluesselBytes = { (byte)12, (byte)23, (byte)34, (byte)45 };


        // Verschl�sseln
        byte[] chiffreBytes = Vigenere.verschluesseln("Hallo Karlsruhe!", schluesselBytes);

        String chiffreAlsString = new String(chiffreBytes);
        System.out.println("\nChiffre: " + chiffreAlsString);


        // Schl�ssel �ndern
        //schluesselBytes[0] = (byte)0x23;

        // Entschl�sseln
        String klartext = Vigenere.entschluesseln(chiffreBytes, schluesselBytes);

        System.out.println("\nErgebnis Entschl�sselung: " + klartext + "\n");
    }

}