package main.oraiMunka.F4;

import java.util.Scanner;

public class F4_1 {

    /*
            public static <visszatérési érték> <metódus név>(<típus> <paraméternév>, <típus> <paraméternév> .... ){
                ....
            }

     */


    public static double beker(String szoveg) {

        System.out.println(szoveg);
        Scanner sc = new Scanner(System.in);
        double szam = Double.parseDouble(sc.nextLine());

        return szam;

    }

    public static void main(String[] args) {

        System.out.println("**** 4/1 ****");

        double szam1 = beker("Add meg az első számot: ");

        double szam2 = beker("Add meg a második számot: ");

        muveletek(szam1, szam2);

        //muveletek(szam2, szam1);

    }


    public static void muveletek(double alfa, double beta) {

        System.out.println("*******");
        System.out.println("A két megadott szám összege:" + osszead(alfa, beta));
        System.out.println("A két megadott szám különbsége:" + (alfa - beta));
        System.out.println("A két megadott szám szorzata:" + (alfa * beta));
        System.out.println("A két megadott szám hányadosa:" + (alfa / beta));

    }

    public static double osszead(double alfa, double beta) {
        return alfa + beta;
    }
}
