package main.adatszerkezetek;

import java.util.Scanner;

public class Tomb {

    /*
        Statikus, Homogén adatszerkezet.

        Statikus = Meghatározott mértetű és ez nem is módosítható.
        Homogén = Minden tagja azanos típusú.

        int[] egeszSzamok;
        egeszSzamok = {1,2,3,4,5};


     */
    public static void main(String[] args) {

//        int[] egeszSzamok = {1, 2, 3, 4, 5};
//        int[] egeszSzamok2 = new int[10];
//        System.out.println(egeszSzamok[2]);
//
//        Scanner sc = new Scanner(System.in);
//
        String[] gyerekNevek = new String[30];
//        System.out.println(gyerekNevek[0]);

       // gyerekNevek = beallitGyerekekNevei(5);
        String[] felnottNevek = {"Béla", "Céla", "János", "Géza", "Banderasz", "Nicole"};

        for (int i = 0; i < felnottNevek.length; i++){

            System.out.println(felnottNevek[i]);

        }

//        System.out.println("Mi a neved, Gyeremekem?");
//        gyerekNevek[0] = sc.nextLine();
//        gyerekNevek[0] = "Cserépedény"; Simán felülírja.
//        System.out.println(gyerekNevek[0]);
//
//        System.out.println("És neked, Gyeremekem?");
//        gyerekNevek[1] = sc.nextLine();
//        System.out.println(gyerekNevek[1]);
//
//        System.out.println("És neked, Gyeremekem?");
//        gyerekNevek[2] = sc.nextLine();
//        System.out.println(gyerekNevek[2]);
//
//        System.out.println("És neked, Gyeremekem?");
//        gyerekNevek[3] = sc.nextLine();
//        System.out.println(gyerekNevek[3]);

    }

    static public String[] beallitGyerekekNevei(int gyerekDb) {
        String[] nevek = new String[gyerekDb];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < gyerekDb; i++) {
            System.out.println("Gyerek neve: ");
            nevek[i] = sc.nextLine();
        }

        return nevek;
    }
}
