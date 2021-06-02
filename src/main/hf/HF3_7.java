package main.hf;

import java.util.Scanner;

public class HF3_7 {

    public static void main(String[] args) {
        System.out.println("Kérem adja meg a pontszámot 0-100-ig");
        Scanner sc = new Scanner(System.in);
        int pontszam = Integer.parseInt(sc.nextLine());

        Math.random();

        if (pontszam >= 0 && pontszam <= 100) {
            if (pontszam < 50) {
                System.out.println("Az érdemjegy elégtelen.");
            } else if (pontszam < 65) {
                System.out.println("Az érdemjegy 2-es.");
            } else if (pontszam < 80) {
                System.out.println("Az érdemjegy 3-as");
            } else if (pontszam < 90) {
                System.out.println("Az érdemjegy 4-es");
            } else if (pontszam < 100) {
                System.out.println("Az érdemjegy 5-ös.");
            }
        } else {
            System.out.println("Hibás érték");
        }


    }

}
