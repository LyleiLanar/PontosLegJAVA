package main.oraiMunka.F4;

import java.util.Scanner;

public class F4_7 {
    public static void main(String[] args) {

        int szam1,szam2;

        do {
            System.out.println("*** Számbekérés ***");
            szam1 = bekerSzam();
            szam2 = bekerSzam();
        } while (eldontNagyobbSzam(szam1, szam2) == 0);


        if (eldontNagyobbSzam(szam1, szam2) == 1) {
            System.out.println(szam1 + " a nagyobb");
        } else {
            System.out.println(szam2 + " a nagyobb");
        }
    }

    public static int bekerSzam() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        return Integer.parseInt(sc.nextLine());
    }

    /*
        ha szam1 a nagyobb, akkor térjen vissza: 1
        ha szam2 a nagyobb, akkor térjen vissza: 2
        ha szam 1 = szam2, akkor térjen vissza: 0
     */
    static public int eldontNagyobbSzam(int szam1, int szam2) {
        if (szam1 < szam2) {
            return 2;
        } else if (szam1 > szam2) {
            return 1;
        }
        return 0;
    }

}
