package main.oraiMunka;

import java.util.Scanner;

public class BikaTehen {

    static String titok;
    static String tipp;

    public static void main(String[] args) {

        /*
                Bekérünk két 4 jegyű számot

                Amennyi egyezés van a két szám számjegyeiben helyiértékpontosan, annyi bika, a többi tehén.

         */

        jatekInditas();
        kiirJatekEremeny();
        System.out.println((char)57);

    }

    private static void kiirJatekEremeny() {

        int bikaMennyiseg = kapBikaMennyiseg();
        System.out.println("Bikák száma: " + bikaMennyiseg);
        System.out.println("Tehenek száma: " + (4 - bikaMennyiseg));

    }

    private static int kapBikaMennyiseg() {
        int bikaMennyiseg = 0;

        for (int i = 0; i < 4; i++) {
            if (titok.charAt(i) == tipp.charAt(i)) {
                bikaMennyiseg += 1;
            }
        }

        return bikaMennyiseg;
    }

    private static void jatekInditas() {

        titok = kapSzam("titok");
        tipp =kapSzam("tipp");

    }

    public static String kapSzam(String mit) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg a " + mit + " értékét!");
        String szam = sc.nextLine();

        //validáció

        return szam;
    }
}
