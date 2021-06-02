package main.utasitasok;

import java.util.Scanner;

public class Metodus {

    public static void main(String[] args) {

        /*
        alprogram:
            - eljárás (nincs visszatérési érték)
            - függvény (van visszatéréis értéke)

        metódus = alprogram

        void: nincs visszatérés
        <típus>: van visszatérés

        public static <viszérték> <név>(int parameter){
            parancs1;
            parancs2;
            parancs3;
            .
            .
            .
            if (){

            }
            return <viszérték> valtozo;
        }

         */

        /*
        Kérjünk be egy számot és vizsgáljuk meg, hogy osztható-e 3-mal
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg te!");
        int szam = Integer.parseInt(sc.nextLine());



        kiirOszthatoHarommal(szam);

        /*
        if (szam % 3 == 0) {
            System.out.println("A " + szam + " osztható hárommal.");
        } else {
            System.out.println("A " + szam + " NEM osztható hárommal.");
        }

        szam = Integer.parseInt(sc.nextLine());

        if (szam % 3 == 0) {
            System.out.println("A " + szam + " osztható hárommal.");
        } else {
            System.out.println("A " + szam + " NEM osztható hárommal.");
        }
        */
    }

    public static void kiirOszthatoHarommal(int num) {

        if (num % 3 == 0) {
            System.out.println("A " + num + " osztható hárommal.");
        } else {
            System.out.println("A " + num + " NEM osztható hárommal.");
        }

    }

}
