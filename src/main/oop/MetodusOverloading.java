package main.oop;

public class MetodusOverloading {

    public static void main(String[] args) {


        rajzolNegyszog(7, '*');

        System.out.println();
        System.out.println(true);
        System.out.println('c');
        System.out.println(2.45d);
        System.out.println(2.45f);
        System.out.println(25);
        System.out.println("string");

        rajzolNegyszog(7, 2, 'O');

    }

    /*
            Metódus overload

            Két vagy több metódus ugyan azzal a névvel, viszont különbözik a paraméterezésük.
            A metódus név + paraméterezés = A metódus szignatúrája.

     */

    public static void rajzolNegyszog(int hossz, int magassag, char karakter) {

        String egyseg = karakter + "  ";

        for (int i = 0; i < magassag; i++) {
            for (int j = 0; j < hossz; j++) {
                System.out.print(egyseg);
            }

            System.out.println();
        }
    }

    public static void rajzolNegyszog(int alap, char karakter) {
        rajzolNegyszog(alap,alap,karakter);
    }



}
