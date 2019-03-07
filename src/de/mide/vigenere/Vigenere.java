package de.mide.vigenere;

/**
 * Diese Klasse enthält je eine Methode um einen String mit dem Vigenere-Verfahren
 * zu ent- und verschlüsseln.
 * <br><br>
 * 
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class Vigenere {

    /**
     * Methode zum Verschlüsseln eines Strings mit dem Vigenere-Verfahren.
     *
     * @param klartext  Text, der verschlüsselt werden soll.
     * 
     * @param schluessel  Kryptografischer Schlüssel (darf nicht leer sein).
     * 
     * @return Chiffre
     */
    public static byte[] verschluesseln(String klartext, byte[] schluessel) {
                
        byte[] klartextBytes = klartext.getBytes();

        int laengeKlartext   = klartextBytes.length;
        int laengeSchluessel = schluessel.length;

        byte[] chiffreBytes = new byte[laengeKlartext];

        byte schluesselByte;
        for (int i=0; i < laengeKlartext; i++ ) {

            schluesselByte  = schluessel[i % laengeSchluessel];
            chiffreBytes[i] = (byte)(klartextBytes[i] ^ schluesselByte); // XOR-Verknüpfung
        }

        return chiffreBytes;
    }


    /**
     * Methode zum Entschlüsseln der Chiffre, d.h. Wiedergewinnung des Klartexts. 
     *
     * @param chiffre  Chiffre, die entschlüsselt werden soll.
     * 
     * @param schluessel  Kryptografischer Schlüssel (darf nicht leer sein);
     *                    muss derselbe Schlüssel sein, mit dem die Chiffre
     *                    erzeugt wurde.
     * 
     * @return Klartext
     */
    public static String entschluesseln(byte[] chiffre, byte[] schluessel) {

        int laengeChiffre    = chiffre.length;
        int laengeSchluessel = schluessel.length;

        byte[] klartextBytes = new byte[laengeChiffre];
        
        byte schluesselByte;
        for (int i=0; i < laengeChiffre; i++ ) {

            schluesselByte   = schluessel[i % laengeSchluessel];
            klartextBytes[i] = (byte)(chiffre[i] ^ schluesselByte); // XOR-Verknüpfung
        }

        return new String(klartextBytes);
    }

}