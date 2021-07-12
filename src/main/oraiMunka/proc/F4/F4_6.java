package main.oraiMunka.proc.F4;

public class F4_6 {

    /*

        Juli, Vili, Zsófi, Magdi

        1, feladat:
            8 sarok mindig, ennyi

        2, feladat:
            a = 2 cm -> 12*0 db 2 oldalon festett kockánk lesz.
            a = 3 cm -> 12*1 db 2 oldalon festett kockánk lesz.
            a = 4 cm -> 12*2 db 2 oldalon festett kockánk lesz.
            a = 5 cm -> 12*3 db 2 oldalon festett kockánk lesz.

            a = n cm -> 12*(n-2) 2 oldalon festett kockánk lesz.

         3, feladat:

            a = 2 cm -> nulla
            a = 3 cm -> 6*1
            a = 4 cm -> 6*(2*2)
            a = 5 cm -> 6*(3*3)

            a = n cm -> 6 * ((n-2)^2)

         4, feladat:
            a. összes kocka - festett kockák
            b. a = n cm -> (n-2)^3
     */

    public static void main(String[] args) {

       kiertekelKocka(6);

    }

    public static int szamolKockaTerfogat(int oldalA) {

        return (int) Math.pow(oldalA, 3);

    }

    public static int szamolFestetlenKockaTerfogat(int oldalA) {

        return szamolKockaTerfogat(oldalA-2);

    }

    public static int egyOldalFestett(int oldalA) {
        return (int) (6 * (Math.pow(oldalA - 2, 2)));
    }

    public static int ketOldalFestett(int oldalA) {
        return 12 * (oldalA - 2);
    }

    public static int haromOldalFestett() {
        return 8;
    }

    public static void kiertekelKocka (int oldalA) {

        System.out.println("Festetlen kockák száma: " + szamolFestetlenKockaTerfogat(6));
        System.out.println("Egy oldala festett: " + egyOldalFestett(6));
        System.out.println("Két oldala festett: " + ketOldalFestett(6));
        System.out.println("Három oldala festett: " + haromOldalFestett());
    }
}
