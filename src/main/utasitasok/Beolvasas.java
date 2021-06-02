package main.utasitasok;

import java.util.Scanner;

public class Beolvasas {

    public static void main(String[] args) {

        /*
        Kérjük meg erre a felhasználót!
        Olvassunk be egy számot a terminálról.

        Íruk ki, hogy ez a szám ez osztható-e 7-tel.

         */

        Scanner beolvaso = new Scanner(System.in);

        System.out.print("Kérlek adj meg egy számot: ");

        String beolvasottSzoveg;
        beolvasottSzoveg = beolvaso.nextLine();

        int szam;
        szam = Integer.parseInt(beolvasottSzoveg);

        if (szam % 7 == 0) {
            System.out.println("A " + szam + " osztható 7-tel!");
        } else {
            System.out.println("A " + szam + " NEM osztható 7-tel!");
        }


    }
}
