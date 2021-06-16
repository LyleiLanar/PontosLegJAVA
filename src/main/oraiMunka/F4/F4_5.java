package main.oraiMunka.F4;

import java.util.Scanner;

public class F4_5 {

    /*
        - be kell kérni a résztvevők számát

        - csoportos
        - intézményi
        - egyéni

        - ki kell írni, hogy mennyi az eredmény
        - írjuk ki, hogy melyiket tanácsos választani

     */

    public static void main(String[] args) {

        int letszam = beker();
        ertekeles(letszam);
    }

    public static int beker() {
        System.out.println("Kérem adja meg a résztvevők számát!");
        Scanner sc = new Scanner(System.in);
        int resztvevok = Integer.parseInt((sc.nextLine()));
        return resztvevok;
    }

    public static double csoportos(int resztvevok) {
        if (resztvevok > 0 && resztvevok < 10) {
            return resztvevok * 0;
        } else if (resztvevok < 20) {
            return resztvevok * 0.05;
        } else if (resztvevok < 30) {
            return resztvevok * 0.08;
        } else if (resztvevok <= 40) {
            return resztvevok * 0.12;
        } else {
            return resztvevok * 0.14;
        }
    }

    public static double intezmenyi(int resztvevok) {
        if (resztvevok < 5) {
            return 0;
        } else if (resztvevok <= 11) {
            return 1;
        } else if (resztvevok <= 19) {
            return 2;
        } else if (resztvevok <= 28) {
            return 3;
        } else if (resztvevok <= 40) {
            return 4;
        } else {
            return 5;
        }
    }

    public static double diakKedvezmeny(int resztvevok) {
        return resztvevok * 0.1;
    }

    public static void ertekeles(int resztvevok) {

        double intezmenyi = intezmenyi(resztvevok);
        double csoportos = csoportos(resztvevok);
        double diakkedvezmeny = diakKedvezmeny(resztvevok);

        System.out.println("Az intezmenyi kedvezmeny " + resztvevok + " főre: " + intezmenyi);
        System.out.println(("A csoportos kedvezmeny " + resztvevok + " főre: " + csoportos));
        System.out.println("A diakkedvezmeny " + resztvevok + " főre: " + diakkedvezmeny);

        System.out.println();

        if ((intezmenyi >= csoportos) && (intezmenyi >= diakkedvezmeny)) {
            System.out.println("Az intézményit érdemes választani!");
        } else if ((csoportos >= diakkedvezmeny) && (csoportos >= intezmenyi)) {
            System.out.println("Az csoportost érdemes választani!");
        } else {
            System.out.println("Az diákosat érdemes választani!");
        }
    }
}
