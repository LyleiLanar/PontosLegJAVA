package main.oraiMunka;

import java.util.Scanner;

public class OM_06_30_03 {

    public static void main(String[] args) {
        /*
        kiIras();
        kiIras2("Zsófi");
        kiIras2("Patrik");
        kiIras2(beKerNev());
        */
        // osszegKiIr(-1,-2);

        //1,2   3,4
        //3     7
        //   10
        System.out.println(32);
        System.out.println("kacsa");

        System.out.println(osszeg(1, 2) + osszeg(3, 4));
        System.out.println(osszeg(osszeg(1, 2), osszeg(3, 4)));


    }

    public static void kiIras() {
        System.out.println("Szia, Magdi vagyok.");
    }

    public static void kiIras2(String nev) {
        System.out.println("Szia, " + nev + " vagyok.");
    }

    public static String beKerNev() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy nevet:");
        String nev = sc.nextLine();
        return nev;
    }

    public static void osszegKiIr(int szam1, int szam2) {
        System.out.println(szam1 + " + " + szam2 + " = " + (szam1 + szam2)); //3 + 4 = 7
    }

    public static int osszeg(int szam1, int szam2) {
        return (szam1 + szam2);
    }

}
