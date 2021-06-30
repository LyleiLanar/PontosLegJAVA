package main.oraiMunka;

public class OM_06_30_2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 12;

        int körte;

        System.out.println("kiiras" + (a + b));

        a = 2;
        b = 1;
        System.out.println("kiiras" + (a + b));

        a = 8;
        b = 5;
        System.out.println("kiiras" + (a + b));

        a = 5;
        b = 4;
        System.out.println("kiiras" + (a + b));

        a = 6;
        b = 2;
        System.out.println("kiiras" + (a + b));

        eljaras();

        int visszertek = fuggvegy();
        System.out.println(visszertek);

        fuggvegy();

        körte = fuggvegy();

        System.out.println(fuggvegy());

       // System.out.println(eljaras()); Ez nem jó!

        int kacsa = 7;

    }

    public static void eljaras() {

        int a = 10;
        int b = 12;
        System.out.println("kiiras" + (a + b));

    }

    public static int fuggvegy() {
        int a = 10;
        int b = 12;
        int osszeg = a + b;

        return osszeg;
    }


}
