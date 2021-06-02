package main.tipusok;

public class TipusokSumma {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long

        //float
        //double

        //char

        //boolean

        //String szöveges típus

        //deklaráció
        String szoveg;

        //inicializáció
        szoveg = "Nagykutya";

        System.out.println(szoveg + " pusztító!");

        String szokoz = " ";

        System.out.println(szoveg + szokoz + "nagyon" + szokoz + "király!");

        szoveg = szoveg + "\u00A9";

        System.out.println(szoveg);

        String szovegesSzam = "250.25";

        szovegesSzam = szovegesSzam + "20";

        System.out.println(szovegesSzam);

        szovegesSzam = "10";

        int tenylegSzam = 20;

        szovegesSzam = szovegesSzam + tenylegSzam;

        System.out.println(szovegesSzam);

    }

}
