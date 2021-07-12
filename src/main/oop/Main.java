package main.oop;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Ember béla = new Ember();

        System.out.println(béla.getNev().toUpperCase());

        Ember klári = new Ember("Nő","Klári",33,70,198,false,false);

        klári.bemutatkozik();
        klári.koszon();


//        béla.setMagassag(180);
//        béla.setSzomjasE(false);
//        béla.setKor(25);
        //béla.setNem("Férfi");


//        béla.nev = "Béla";
//        System.out.println(béla.nev);
//
//        Ember klári = new Ember();
//        klári.setMagassag(180);
//        klári.setSzomjasE(false);
//        klári.setKor(25);
//        klári.setNem("Férfi");
//
//        klári.nev = "Klári";
//        System.out.println(klári.nev);
//
//        béla.koszon();
//        klári.koszon();
//
       // System.out.println(béla.getKor());
       // béla.kor = 13;
//
//        béla.setKor(13);
//        System.out.println(béla.getKor());
//        béla.setKor(12);
//        System.out.println(béla.getKor());
//
//        béla.setKor(17);
//        béla.oregszik();
//
//
//        String nev = béla.getNev().toUpperCase();
//        System.out.println(nev);




    }
}
