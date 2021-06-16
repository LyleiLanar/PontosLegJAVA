package main.oraiMunka.F4;

import java.util.Scanner;

public class F4_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Első menüpont");
        System.out.println("2. Második menüpont");
        System.out.println("3. Harmadik menüpont");
        System.out.println("4. Negyedik menüpont");
        System.out.println("5. Kilépés");

        //String valasztott=  sc.nextLine();
        //űrpalota ű + r + p ...

        char valasztott = sc.nextLine().charAt(0);


        /*
                addig(!IsKorsoTorott){
                    megyKorsoKutra();
                }

                kiirKorsoEltort();

         */

        while (valasztott !='5') {


            switch (valasztott) {
                case '1':
                    System.out.println("Első menüpont");
                    break;
                case '2':
                    System.out.println("Második menüpont");
                    break;
                case '3':
                    System.out.println("Harmadik menüpont");
                    break;
                case '4':
                    System.out.println("Negyedik menüpont");
                    break;
                case '5':
                    System.out.println("Kilépés");
                    break;
                default:
                    System.out.println("Rossz választás!");

            }
            System.out.println("Válasszon másik menüpontot!");
            valasztott = sc.nextLine().charAt(0);

        }



    }


}
