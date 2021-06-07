package main.oraiMunka;

import java.util.Scanner;

public class F4_16 {
    public static void main(String[] args) {

        kiirn_edikElem(1, 1, 4);
        System.out.println("N-edik elem értéke: " + kapN_rekurzív(1, 1, 4));

    }

    public static int beker(String bekerSzoveg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(bekerSzoveg);
        return Integer.parseInt(sc.nextLine());

    }

    public static void kiirn_edikElem(int elsoElem, int d, int n) {
        int kovetkezoSzam = elsoElem;
        for (int i = elsoElem; i < n; i++) {
            kovetkezoSzam = kovetkezoSzam + d;
        }
        System.out.println("N-edik elem értéke: " + kovetkezoSzam);
    }

    public static int kapN_rekurzív(int a, int d, int n) {

        if (n == 1) {
            return a;
        } else {
            return kapN_rekurzív(a, d, n - 1) + d;
        }
    }
}
