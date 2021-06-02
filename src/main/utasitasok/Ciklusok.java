package main.utasitasok;

import java.util.Scanner;

public class Ciklusok {

    /*
        Előre meghatározott lépésszámú
        ------------ FOR -------------

        for(int i = 0;i<10;i++){
            parancs_1;
            parancs_2;
            parancs_3;
            .
            .
            .
            parancs_n;
        }

        Előre NEM meghatározott lépésszámú
        ----------- WHILE -------------

        while(!hatosADobottErtek){
            parancs_1;
            parancs_2;
            parancs_3;
            .
            .
            .
            parancs_n;
        }

     */


    public static void main(String[] args) {


        System.out.println("**** FOR CIKLUS ****");
        Scanner sc = new Scanner(System.in);

        System.out.println("A dobások száma: ");
        int dobasokSzama = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < dobasokSzama; i++) {

            int dobas = (int) (Math.random() * 6) + 1;
            System.out.println("A(z) " + (i + 1) + ". dobott érték: " + dobas);

        }

        System.out.println();
        System.out.println("**** WHILE CIKLUS ****");

        boolean hatosE = false;

        while (!hatosE) {

            int dobas = (int) (Math.random() * 6) + 1;

            if (dobas == 6) {
                System.out.print("Na végre!!! ");
                hatosE = true;
            } else {
                hatosE = false;
            }

            System.out.println("A dobott érték: " + dobas);
        }
    }
}
