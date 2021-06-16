package main.oraiMunka.F5;

import java.util.Scanner;

public class F5_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int osszeg = 0;
        int paratlanDb = 0;
        int parosDb = 0;

//        while (osszeg < 100) {
//            System.out.println("Kérem adjon meg egy számot: ");
//            int aktSzam = Integer.parseInt(sc.nextLine());
//
//            osszeg = osszeg + aktSzam;
//
//            if (aktSzam % 2 == 0) {
//                parosDb++;
//            } else {
//                paratlanDb++;
//            }
//
//        }

        do {
            System.out.println("Kérem adjon meg egy számot: ");
            int aktSzam = Integer.parseInt(sc.nextLine());

            osszeg = osszeg + aktSzam;

            if (aktSzam % 2 == 0) {
                parosDb++;
            } else {
                paratlanDb++;
            }

        } while (osszeg < 100);

        System.out.println("A beírt számok közül, " + parosDb + " páros és " + paratlanDb + " páratlan szám volt.");

    }
}
