package main.oraiMunka;

import java.util.Scanner;

public class F4_10 {

    public static void main(String[] args) {

        int[] haromszog = bekerHaroszogOldalai();
        boolean szerkesztheto = szerkeszthetoE(haromszog);

        kiirSzerkeszthetoseg(szerkesztheto);
        if (szerkesztheto) {

            kiirHaromszogTipus(haromszog);
            kiirKerulet(haromszog);
            kiirTerulet(haromszog);
        }

    }

    public static int[] bekerHaroszogOldalai() {

        int[] haromszog = new int[3];

        for (int i = 0; i < haromszog.length; i++) {
            System.out.print("Kérem adja meg a háromszög (" + (char) (i + 97) + ") oldalát: ");
            haromszog[i] = beker();
        }

        return haromszog;
    }

    public static int beker() {
        Scanner sc = new Scanner(System.in);

        int oldal = Integer.parseInt(sc.nextLine());
        while (oldal <= 0) {
            System.out.println("Hibás adat, kérem adjon meg másikat!");
            oldal = Integer.parseInt(sc.nextLine());

        }

        return oldal;

    }

    public static boolean szerkeszthetoE(int[] haromszog) {
        if ((haromszog[0] + haromszog[1]) > haromszog[2] && (haromszog[0] + haromszog[2]) > haromszog[1] && (haromszog[2] + haromszog[1]) > haromszog[0]) {
            return true;
        }
        return false;
    }

    public static void kiirSzerkeszthetoseg(boolean szerkesztheto) {
        if (szerkesztheto) {
            System.out.println("A megadott háromszög szerkeszthető");

        } else {
            System.out.println("A megadott háromszög NEM szerkeszthető.");
        }
    }

    public static void kiirHaromszogTipus(int[] haromszog) {
        if ((haromszog[0] == haromszog[1]) && (haromszog[1] == haromszog[2])) {
            System.out.println("Egyenlő oldalú háromszög!");
        } else if ((haromszog[0] == haromszog[1]) || (haromszog[1] == haromszog[2]) || (haromszog[0] == haromszog[2])) {
            System.out.println("Egyenlő szárú háromszög!");
        } else {
            System.out.println("Általános háromszög!");
        }
    }

  //kerület metódusok
    public static void kiirKerulet(int[] haromszog) {

        System.out.println("A háromszög kerulete: " + szamolKerulet(haromszog));
    }

    public static int szamolKerulet(int[] haromszog) {
        // K = a + b + c => kerulet = haromszog[0]+haromszog[1]+haromszog[2]

        int kerulet = 0;

        for (int i = 0; i < haromszog.length; i++) {

            kerulet = kerulet + haromszog[i];

        }

        return kerulet;
    }

  //terület metódusok
    public static void kiirTerulet(int[] haromszog) {


        System.out.println("A háromszög területe :  " + szamolTerulet(haromszog));

    }

    public static double szamolTerulet(int[] haromszog) {

        // s =(amb+c)/2 --- kerület fele

        double s = szamolKerulet(haromszog) / 2;
        return  Math.sqrt(s * (s - haromszog[0]) * (s - haromszog[1]) * (s - haromszog[2]));

    }


}
