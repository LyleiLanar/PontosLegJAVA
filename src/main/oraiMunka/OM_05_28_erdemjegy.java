package main.oraiMunka;

import java.util.Scanner;

public class OM_05_28_erdemjegy {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("A(z) " + (i + 1) + ". diák.");
            kiirErtekeles(bekerPontok());
        }
    }

    /*
        > < { & |

        0-49 : 1
        50-64: 2
        65-79: 3
        80-89: 4
        90-  : 5

        ha x<0 vagy x>100, akkor jelezze a program, hogy hibás a megadott pont.
     */
    public static int kiszamolErtekeles(int pontok) {

        if (pontok < 50) {
            return 1;
        } else if (pontok < 65) {
            return 2;
        } else if (pontok < 80) {
            return 3;
        } else if (pontok < 90) {
            return 4;
        }
        return 5;

    }

    public static void kiirErtekeles(int pontok) {

        System.out.println("Az ön érdemjegye: " + kiszamolErtekeles(pontok));

    }

    public static int bekerPontok() {
        System.out.println("Kérem adja meg a pontjait!");
        Scanner sc = new Scanner(System.in);

        int pontok = Integer.parseInt(sc.nextLine());

        while (!validPontok(pontok)) {
            System.out.println("Te balga ilyen pontot nem lehet megadni, kérlek adj meg egy helyeset: ");
            pontok = Integer.parseInt(sc.nextLine());
        }

        return pontok;
    }

    public static boolean validPontok(int pontok) {

        return pontok >= 0 && pontok <= 100;

    }
}
