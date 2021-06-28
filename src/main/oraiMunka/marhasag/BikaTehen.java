package main.oraiMunka.marhasag;

import java.util.Scanner;

public class BikaTehen {

    static final int maxElet = 10;
    static final char uresSziv = '\u2661';
    static final char teliSziv = '\u2665';

    static String titok;
    static String tipp;
    static int elet;


    public static void main(String[] args) {

        jatek();

    }

    public static void jatek() {

        beallitTitok();
        elet = maxElet;
        boolean marhasag;
        //System.out.println(titok);
        System.out.println("Gondoltam egy négyjegyű számra (0000-9999) számra! Tippelj!\n" +
                "Ha az adott értéket eltaláltad, akkor bikát mondok, ha van olyan érték csak más helyen, akkor tehenet!\n");
        do {

            System.out.print("Életeid: ");
            for (int i = 0; i < elet; i++) {
                System.out.print(teliSziv);
            }
            for (int i = elet; i < maxElet; i++) {
                System.out.print(uresSziv);
            }
            System.out.println();
            elet--;
            beallitTipp();
            marhasag = marhasag();
        } while (!marhasag && elet > 0);

        if (marhasag) {
            System.out.println("GRATULÁLOK GYŐZTÉL!!! Te vagy a helyi cowboy, minden bika réme!");
        } else {
            System.out.println("Hát jó nagy marha vagy! Vesztettél!");
        }

    }

    public static void beallitTitok() {
        titok = "";
        for (int i = 0; i < 4; i++) {
            //*((max - min) + 1) + min;
            int szam = (int) (Math.random() * 10);
            titok += szam;
        }

    }

    public static void beallitTipp() {
        Scanner sc = new Scanner(System.in);
        String szam;

        //0000 - 9999
        // 1. pontosan 4 hosszú a szöveg.
        // 2. a karakterek értéke 0-9 terjedhet csak.

        boolean megfeleloErtek = false;

        do {

            System.out.print("Tippelj!: ");
            szam = sc.nextLine();

            if (szam.length() == 4) {

                int index = 0;
                while ((index < 4) && !(szam.charAt(index) < 48 || szam.charAt(index) > 57)) {
                    index++;
                }
                megfeleloErtek = index >= 4;
            }

            if (!megfeleloErtek) {
                System.out.println();
                System.out.println("!!! HIBÁS ÉRTÉK !!!");
            }

        } while (!megfeleloErtek);

        tipp = szam;

        //0-9999

//        while (szam<0 || szam>9999){
//            System.out.println("Nem megfelelő érték, kérem adjon meg egy új számot!");
//            szam = Integer.parseInt(sc.nextLine());
//        }

        //0 - 9 : "x" -> "000" + x;
        //10 - 99: "x"-> "00" + x;
        //100 - 999: "x"-> "0" + x;

    }

    public static boolean marhasag() {

        boolean[] titokMarhasag = {false, false, false, false};
        boolean[] tippMarhasag = {false, false, false, false};

        int bikaSzam = 0;
        for (int i = 0; i < 4; i++) {
            if (titok.charAt(i) == tipp.charAt(i)) {
                titokMarhasag[i] = true;
                tippMarhasag[i] = true;
                System.out.print("BIKA ");
                bikaSzam++;
            }
        }
        if (bikaSzam == 4) {
            return true;
        }

        for (int i = 0; i < 4; i++) {
            if (tippMarhasag[i]) {
                continue;
            }

            for (int j = 0; j < 4; j++) {
                if (titokMarhasag[j]) {
                    continue;
                }
                if (tipp.charAt(i) == titok.charAt(j)) {
                    titokMarhasag[j] = true;
                    tippMarhasag[i] = true;
                    System.out.print("TEHÉN ");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println();
        return false;
    }

}
