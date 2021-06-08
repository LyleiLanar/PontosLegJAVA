package main.oraiMunka;

import java.util.Scanner;

public class F4_19 {

    /*
                    Készítsünk alkalmazást, amely beolvassa egy személy
                    életkorát (E), majd a kapott adat fényében kiírja a képernyőre azt a korosztályt, amibe
                    az életkor „tulajdonosa” tartozik.

                        – Gyermek (0-6),
                        – Iskolás (7-22),
                        – Felnőtt (22-64),
                        – 65 töl nyugdíjas!

     */

    public static void main(String[] args) {
        kiirEletkorCsoport(beker());
    }

    public static int beker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg az életkorod: ");
        int eletkor = Integer.parseInt(sc.nextLine());
        return eletkor;
    }

    public static void kiirEletkorCsoport(int eletkor) {
        if (eletkor >= 0) {
            if (eletkor <= 6) {
                System.out.println("Gyerek vagy");
            } else if (eletkor <= 22) {
                System.out.println("Iskolás vagy");
            } else if (eletkor <= 64) {
                System.out.println("Felnőtt vagy");
            } else if (eletkor <= 150) {
                System.out.println("Nyuggger vagy");
            } else {
                System.out.println("Halott vagy");
            }
        } else {
            System.out.println("Még meg se születtél");

        }
    }
}
