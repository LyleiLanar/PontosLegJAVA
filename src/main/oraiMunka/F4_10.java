package main.oraiMunka;

import java.util.Scanner;

public class F4_10 {

    public static void main(String[] args) {

        kiirSzerkeszthetoseg(szerkeszthetoE(bekerHaroszogOldalai()));

    }

    public static int[] bekerHaroszogOldalai() {

        int[] haromszog = new int[3];

        for (int i = 0; i < haromszog.length; i++) {
            System.out.println("Kérem adja meg a háromszög (" + (char) (i + 97) + ") oldalát");
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
            System.out.println(" A megadott háromszög szerkeszthető");

        } else {
            System.out.println(" A megadott háromszög NEM szerkeszthető.");
        }
    }


}
