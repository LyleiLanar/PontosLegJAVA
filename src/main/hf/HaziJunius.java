package main.hf;

import java.util.Scanner;

public class HaziJunius {

    static String[] cikkszam;
    static int[] ar;
    static int db;

    public static void main(String[] args) {
        int db = getBeker();
        FeltoltCikkszam(db);
        FeltoltAr(db);

        vanE1015kozott((db - 1));
        Szetvalogat(db);
        Legdragabb(db);
        System.out.println("Cikksszám ár kiírás");
        for (int i = 0; i < db; i++) {
            System.out.println(i + " cikkszam " + cikkszam[i]);
            System.out.println(i + " ár " + ar[i]);
        }
    }

    private static void Legdragabb(int db) {
        System.out.println("Harmadik feladat: ");
        int maxAr = 0;
        for (int i = 0; i < db; i++) {
            if (ar[i] > ar[maxAr]) {
                maxAr = i;
            }
        }
        System.out.println("A legdrágább bútor helye cikkszam: " + cikkszam[maxAr]);
        System.out.println();
    }

    private static void Szetvalogat(int db) {
        System.out.println();
        System.out.println("Második feladat: ");

        String[] kisebb30 = new String[db];
        String[] tomb3050 = new String[db];
        String[] nagyobb50 = new String[db];

        int dbKisebb30 = 0;
        int dbTomb3050 = 0;
        int dbNagyobb50 = 0;


        /*   ár     kisebb30    tomb3050    nagyobb50   cikkszam
            14000   1           3           4           1
            20000   2           null        5           2
            40000   null        null        null        3
            60000   null        null        null        4
            80000   null        null        null        5
        */

        for (int i = 0; i < db; i++) {
            if (ar[i] < 30000) {
                kisebb30[dbKisebb30] = cikkszam[i];
                dbKisebb30++;
                //        System.out.println("1. tömb (Kisebb mint 30E FT) bútor cikkszáma " + kisebb30[i]);
            } else if (ar[i] > 30000 && ar[i] < 50000) {
                tomb3050[dbTomb3050] = cikkszam[i];
                dbTomb3050++;
                //      System.out.println("2. tömb (30E és 50E FT) közötti bútor cikkszáma " + tomb3050[i]);
            } else if (ar[i] > 50000) {
                nagyobb50[dbNagyobb50] = cikkszam[i];
                dbNagyobb50++;
                //      System.out.println("3. tömb (nagyobb mint 50E FT) bútor cikkszáma " + nagyobb50[i]);
            }
        }

        int index = 0;
        while (index < db && !(kisebb30[index] == null)) {
            System.out.println("Kisebb mint 30E bútor cikkszáma " + kisebb30[index]);
            index++;

        }

        index = 0;
        while (index < db && !(tomb3050[index] == null)) {
            System.out.println("30E és 50E Ft közötti bútor cikkszáma  " + tomb3050[index]);
            index++;

        }

        index = 0;
        while (index < db && !(nagyobb50[index] == null)) {
            System.out.println("Nagyobb mint 50E Ft bútor cikkszáma " + nagyobb50[index]);
            index++;

        }

        //   System.out.println("30E és 50E között cikkszáma "+tomb3050[i]);
        //   System.out.println("Nagyobb mint 50E cikkszáma "+nagyobb50[i]);

    }

    public static void vanE1015kozott(int db) {
        int index = 0;
        int ah = 10000;
        int fh = 15000;

        //T tulajdonság = adott termék ára az 10 és 15 ezer között van.

        while ((index < db) && (!(ar[index] > ah) || !(ar[index] < fh))) {
            index++;
        }

        boolean van = index < db;
        System.out.println();
        System.out.println(" Első feladat: ");

        if (!van) {
            System.out.println("Nincs olyan bútor, aminek az ára 10E és 15E között van.");
        } else {
            System.out.println("Van olyan bútor aminek az ára 10E és 15E között van.");
        }

    }

    /* private static void kiir(int db) {
         for (int i = 0; i < db; i++) {
             System.out.println("cikkszam"+cikkszam[i]);
             System.out.println("ár"+ar[i]);
         }
     }*/
    private static void FeltoltCikkszam(int db) {
        cikkszam = new String[db];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < db; i++) {
            System.out.println("Kérem adja meg " + (i + 1) + " bútor cikkszámát");
            cikkszam[i] = sc.nextLine();
        }
    }

    private static void FeltoltAr(int db) {
        ar = new int[db];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < db; i++) {
            System.out.println("Kérem adja meg " + (i + 1) + " bútor árát");
            ar[i] = Integer.parseInt(sc.nextLine());
        }
    }

    private static int getBeker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg hány bútor van a raktárban");
        int db = Integer.parseInt(sc.nextLine());
        return db;
    }
}

