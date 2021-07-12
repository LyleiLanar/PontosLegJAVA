package main.oraiMunka.proc.F4;

import java.util.Scanner;

public class F4_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy mondatot!");
        String mondat = sc.nextLine();

        for (int i = 0; i < mondat.length(); i++) {
            if (mondat.charAt(i) != ' ') {
                System.out.print(mondat.charAt(i));
            }
        }
        System.out.println();

        System.out.println(mondat.replaceAll("k", "@"));

        kiirMassal(mondat,'k', '@');

    }

    public static void kiirMassal(String mondat, char mit, char mire) {

        for (int i = 0; i < mondat.length(); i++) {

            if (mondat.charAt(i) == mit) {
                System.out.print(mire);
            } else {
                System.out.print(mondat.charAt(i));
            }
        }
        System.out.println();
    }
}
