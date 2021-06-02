package main.oraiMunka;

import java.util.Scanner;

public class OM_05_31_futas {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Kérlek add meg, hány kört futsz!");
        int korSzam = Integer.parseInt(sc.nextLine());

        int[] korIdok = new int[korSzam];

        for (int i = 0; i < korIdok.length; i++) {
            System.out.println("Kérlek add meg, hány másodperc volt a kör!");
            korIdok[i] = Integer.parseInt(sc.nextLine());

        }

        //****************************

        for (int i = 0; i < korIdok.length; i++) {
            System.out.println((i + 1) + ". kört " + korIdok[i] / 3600 + ":" + korIdok[i] % 3600 / 60 + ":" + korIdok[i] % 60 + " idő alatt futottad le.");
        }

    }
}
