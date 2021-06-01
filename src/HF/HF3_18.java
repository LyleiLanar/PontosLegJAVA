package HF;

import java.util.Scanner;

public class HF3_18 {

    public static void main(String[] args) {

        // ax^2 + bx + c = 0; -> 3x^2 + 5,2x + 1 = 0

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Kérlek add meg a, értékét: ");
        a = Double.parseDouble(sc.nextLine());

        System.out.print("Kérlek add meg b, értékét: ");
        b = Double.parseDouble(sc.nextLine());

        System.out.print("Kérlek add meg c, értékét: ");
        c = Double.parseDouble(sc.nextLine());

        double diszkriminans = Math.pow(b, 2) - (4 * a * c);


        /*
            ha d < 0 => nincs valós megoldás
            ha d = 0 => 1 megoldás
            ha d > 0 => 2 megoldás
         */

        if (a != 0) {
            System.out.println("A diszkrimináns: " + diszkriminans);
            if (diszkriminans >= 0) {

                System.out.println("A feladatnak két eredménye van!");
                System.out.println("Első: " + (-b + Math.sqrt(diszkriminans)) / (2 * a));
                System.out.println("Második: " + (-b - Math.sqrt(diszkriminans)) / (2 * a));

            } else if (diszkriminans == 0) {

                System.out.println("A feladatnak egy eredménye van!");
                System.out.println("Eremény: " + (-b / 2 * a));

            } else {

                System.out.println("A feladatnak nincs eredménye!");

            }
        } else {

            System.out.println("Nullával nem illik osztani!");

        }

    }

}
