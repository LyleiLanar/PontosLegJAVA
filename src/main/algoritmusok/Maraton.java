package main.algoritmusok;

import main.sorsolator.Sorsolator;

import java.util.Scanner;

public class Maraton {

    /*
            Futók
            **********
            rajtszám: index
            név
            ország
            életkor

     */

    public static void main(String[] args) {

        // 1. feladat adatok rögzítése

        /*

            változó Név: tömb[0..99] szöveg[30]
            változó Ország: tömb[0..99] szöveg[3]
            változó Kor: tömb[0..99] egész

            ciklus I:=0..99 ismétel
                be: Név[I]
                be: Ország[I]
                be: Kor[I]
            cvége

            -----------------------------------
            algoritmus TömbFeldolgozás
                ciklus I:=0..(N-1) ismétel
                    A[I] feldolgozása...
                cvége
            -----------------------------------

         */

        int resztvevok = 3;
        Scanner sc = new Scanner(System.in);

        String[] nevek = new String[resztvevok];
        String[] orszagok = new String[resztvevok];
        int[] eletkorok = new int[resztvevok];
        int[] eredmenyek = new int[resztvevok];     // automatikusan minden eleme 0 lesz.

        String[] hunNevek = new String[resztvevok]; // automatikusan minden eleme null lesz.
        int[] fraRajtszamok = new int[resztvevok];  // automatikusan minden eleme 0 lesz.


        System.out.println("Hellobello! Ez itt egy maraton! Kezdjük a versenyzők felvételével (" + resztvevok + " db): ");
        System.out.println();

        for (int i = 0; i < resztvevok; i++) {
            System.out.println("*** Vegyünk fel egy futót! ***");
            System.out.print("Adja meg a versenyző nevét: ");
            nevek[i] = sc.nextLine();

            System.out.print("Adja meg a versenyző országát: ");
            orszagok[i] = sc.nextLine();

            System.out.print("Adja meg a versenyző életkor: ");
            eletkorok[i] = Integer.parseInt(sc.nextLine());
            System.out.println();
        }

        // 2. feladat idők rögzítése

        /*
                változó Eredmeny: tömb[0..99] egész

                ciklus I := 0..99 ismétel
                    be: Rajtszám
                    be: Eredmény[Rajtszám]
                cvége
         */


        System.out.println("Jönnek a futók!");

        for (int i = 0; i < resztvevok; i++) {
            System.out.println("*** Beért a futó ***");
            System.out.print("Adja meg a versenyző rajtszámát: ");
            int rajtszam = Integer.parseInt(sc.nextLine());

            System.out.print("Adja meg a versenyző eredményét: ");
            eredmenyek[rajtszam] = Integer.parseInt(sc.nextLine());
            System.out.println();

        }

        for (int i = 0; i < resztvevok; i++) {
            System.out.println("Rajtszám: " + i + " | Név: " + nevek[i] + " | Ország: " + orszagok[i] + " | Kor: " + eletkorok[i] + " | Eredmény: " + eredmenyek[i] + " min");
        }
        System.out.println();

        // 3. feladat átlag életkor - ÖSSZEGZÉS TÉTELE

        /*

         ÖSSZEGZÉS TÉTELE
         -----------------------------------
            algoritmus Összegzés
                Összeg := 0
                ciklus I := 0..(N-1) ismétel
                    Összeg := Összeg + A[I]
                cvége
         -----------------------------------

         ÖSSZEGZÉS TÉTELE II.
         -----------------------------------
            algoritmus Összegzés
                Összeg := A[0]
                ciklus I := 1..(N-1) ismétel
                    Összeg := Összeg + A[I]
                cvége
         -----------------------------------

         */

        int osszeg = eletkorok[0];
        for (int i = 1; i < resztvevok; i++) {
            osszeg = osszeg + eletkorok[i];
        }

        double atlagEletkor = (double) osszeg / resztvevok;
        System.out.println("A futók átlag életkora: " + atlagEletkor + " év.");
        System.out.println();

        // 4. feladat hány darab szenior? - MEGSZÁMLÁLÁS TÉTELE

        /*
         MEGSZÁMLÁLÁS TÉTELE
         -----------------------------------
            algoritmus Megszámlálás
                Db:=0
                ciklus I:=0..(N-1) ismétel
                    ha A[I] P tulajdonságú akkor
                        Db := Db + 1
                    hvége
                cvége
         -----------------------------------
         */

        int db = 0;
        for (int i = 0; i < resztvevok; i++) {
            if (eletkorok[i] > 35) {
                //db = db +1;
                //db += 1;
                db++;
            }
        }

        System.out.println("Összesen " + db + " szenior versenyző indult a maratonon.");
        System.out.println();

        // 5. feladat hány magyar? - KIVÁLOGATÁS TÉTELE
        /*
         KIVÁLOGATÁS TÉTELE
         -----------------------------------
            algoritmus Kiválogatás
                Db:=-1
                ciklus I:=0..(N-1) ismétel
                    ha Tomb[I] T tulajdonságú akkor
                        Db := Db + 1
                        T_Tomb[Db] := Tomb[I]
                    hvége
                cvége
         -----------------------------------
         */

        db = -1;
        for (int i = 0; i < resztvevok; i++) {
            //      hUn ->     HUN          TRUE
            if (orszagok[i].toUpperCase().equals("HUN")) {
                db++;
                hunNevek[db] = nevek[i].toUpperCase();
            }
        }

        System.out.println("A magyar indulók nevei: ");
        for (int i = 0; i < resztvevok; i++) {
            if (hunNevek[i] != null) {
                System.out.println(hunNevek[i]);
            }
        }
        System.out.println();

        /*
            A fraRajszamok tömb minden eleme 0.
         */

        for (int i = 0; i < resztvevok; i++) {
            fraRajtszamok[i] = -1;
        }

        db = -1;
        for (int i = 0; i < resztvevok; i++) {
            //      hUn ->     HUN          TRUE
            if (orszagok[i].toUpperCase().equals("FRA")) {
                db++;
                //hunNevek[db] = nevek[rajtszam].toUpperCase();
                fraRajtszamok[db] = i;
            }
        }

        System.out.println("A francia indulók adatai:");
        for (int i = 0; i < resztvevok; i++) {
            int actFraRajtszam = fraRajtszamok[i];
            if (actFraRajtszam != -1) {
                System.out.println("Rajtszám: " + actFraRajtszam + " | Név: " + nevek[actFraRajtszam] + " | Ország: " + orszagok[actFraRajtszam] + " | Kor: "
                        + eletkorok[actFraRajtszam] + " | Eredmény: " + eredmenyek[actFraRajtszam] + " min");
            }
        }
        System.out.println();

        // 6. Az egyetlen etióp eredménye? - KIVÁLASZTÁS TÉTELE
        /*
         KIVÁLASZTÁS TÉTELE
         -----------------------------------
            algoritmus Kiválasztás
                I := 0
                amíg A[I] NEM P tulajdonságú ismétel
                    I := I + 1
                avége
                Hely := I
         -----------------------------------
         */
        int index = 0;
        while (!orszagok[index].toUpperCase().equals("ETH")) {
            index++;
        }
        int etiopIndex = index;

        System.out.println("Az etióp versenyző eredménye: " + eredmenyek[etiopIndex] + " min.");
        System.out.println();

        // 7. Mindenkinek sikerült szintidőn belül? - ELDÖNTÉS TÉTELE
        /*
            P =  Szintidőn kivül teljesített (eredmény>330)= Nem sikerült teljesíteni szintidőm belül.

         ELDÖNTÉS TÉTELE
         -----------------------------------
            algoritmus Eldöntes
                I := 0
                amíg (I<N) és (A[I] NEM P tulajdonságú) ismétel
                    I := I + 1
                avége
                Van := (I<N)
         -----------------------------------
         */

        index = 0;
        int szintido = 330;

        while ((index < resztvevok) && !(eredmenyek[index] > szintido)) {
            index++;
        }

        boolean van = index < resztvevok;

        if (!van) {
            System.out.print("M");
        } else {
            System.out.print("Nem m");
        }
        System.out.println("indenki teljesítette szintidőn beül!");

        System.out.println();

        // 8. Van-e meg mennyi Nurmo Paavi? - LINEÁRIS KERESÉS
        /*
            P =  Szintidőn kivül teljesített (eredmény>330)= Nem sikerült teljesíteni szintidőm belül.

         LINEÁRIS KERESÉS
         -----------------------------------
            algoritmus LinearisKereses
                I := 0
                amíg (I<N) és (A[I] NEM P tulajdonságú) ismétel
                    I := I + 1
                avége
                Hely := I
                Van := (I<N)
         -----------------------------------
         */

        index = 0;

        while ((index < resztvevok) && !(nevek[index].toUpperCase().equals("NURMO PAAVI"))) {
            index++;
        }

        int hely;
        van = index < resztvevok;

        if (van) {
            hely = index;
            System.out.println("Nurmo Paavi részt vett a versenyen és " + hely + " a rajtszáma.");
        } else {
            hely = -1;
            System.out.println("Nem jött el Nurmo Paavi.");
        }

    }
}
