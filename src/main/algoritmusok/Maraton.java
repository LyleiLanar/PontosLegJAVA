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

        int resztvevok = 2;
        Scanner sc = new Scanner(System.in);

        String[] nevek = new String[resztvevok];
        String[] orszagok = new String[resztvevok];
        int[] eletkorok = new int[resztvevok];

        System.out.println("Hellobello! Ez itt egy maraton! Kezdjük a versenyzők felvételével: ");
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

        int[] eredmenyek = new int[resztvevok];

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
            if (eletkorok[i] > 35){
                //db = db +1;
                //db += 1;
                db++;
            }
        }

        System.out.println("Összesen " + db +" szenior versenyző indult a maratonon.");

        // 4. feladat hány magyar? - KIVÁLOGATÁS TÉTELE


    }
}
