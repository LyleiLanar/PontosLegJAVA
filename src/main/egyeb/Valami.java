package main.egyeb;

import java.util.Scanner;

public class Valami {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Írja be a személy súlyát!");
        int kg = Integer.parseInt(sc.nextLine());

        System.out.println("Írja be a személy magasságát!");
        int cm = Integer.parseInt(sc.nextLine());


//        BodyMassIndex(kg,cm);

        double bmi = BodyMassIndex(kg, cm);
        System.out.println("Testtömegindex: " + BodyMassIndex(kg, cm));
    }

    public static double BodyMassIndex(int kg, int cm) {
        return kg / Math.pow(((double) cm / 100), 2);
    }

}
