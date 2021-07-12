package main.oraiMunka.proc.F4;

import java.util.Scanner;

public class F4_18 {
    public static void main(String[] args) {
        char sorszam = beker();

        while (sorszam != 'q') {

            kiirNapot(sorszam);
            sorszam = beker();
        }

        System.out.println("Itt a vég!");
    }

    public static void kiirNapot(char sorszam) {
        switch (sorszam) {
            case '1':
                System.out.println("Ez hétfő!");
                break;
            case '2':
                System.out.println("Ez kedd!");
                break;
            case '3':
                System.out.println("Ez szerda!");
                break;
            case '4':
                System.out.println("Ez csütörtök!");
                break;
            case '5':
                System.out.println("Ez péntek!");
                break;
            case '6':
                System.out.println("Ez szombat!");
                break;
            case '7':
                System.out.println("Ez vasárnap!");
                break;
            default:
                System.out.println("Hibás adat");
                break;
        }
    }

    private static char beker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy számot 1-7-ig vagy nyomjon q-t ha ki akar lépni!");
        char sorszam = sc.nextLine().charAt(0);

        return sorszam;
    }

}
