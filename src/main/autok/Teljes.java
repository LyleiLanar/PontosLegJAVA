package main.autok;

import java.util.Scanner;

public class Teljes {


    public static final int maxCars = 50;
    public static int cars = 0;

    public static final String[] brands = new String[maxCars];
    public static final String[] types = new String[maxCars];
    public static final int[] years = new int[maxCars];
    public static final int[] prices = new int[maxCars];
    public static final String[] colors = new String[maxCars];
    public static final int[] kms = new int[maxCars];
    public static final char[] fuels = new char[maxCars];
    public static final char[] shifters = new char[maxCars];

    public static void main(String[] args) {

        //Ez mutatja, hogy mennyi autó fér el a kereskedésben.
        /*
        int maxAutok = 50;
        */

        //Ezek foglalják össze az autókat, az index lesz az adott autó azonosítója.
        /*
        String[] markak = new String[maxAutok];
        String[] tipusok = new String[maxAutok];
        int[] evjaratok = new int[maxAutok];
        int[] arak = new int[maxAutok];
        String[] szinek = new String[maxAutok];
        int[] megtettKmek = new int[maxAutok];
        char[] uzemanyagok = new char[maxAutok];
        char[] valtok = new char[maxAutok];
        */

        //szükség lenne pár metódusra, ami azzal foglalkozik, hogy autókat vegyünk fel
        //autókat adjunk el
        //kiírjuk az autókat
        //keressünk az autók között
        //jah meg valami menüféle is kellene.


        String marka = "Toyota";
        String tipus = "Corolla";
        int evjarat = 1999;
        int ar = 500_000;
        String szin = "piros";
        int megtettKm = 200_000;
        char uzemanyag = 'b';
        char valto = 'm';
    }

    public static String getPrompt() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");

        String command = sc.nextLine();

        return command;

    }

    public static void doCommand(String command) {

        switch (command.toUpperCase()) {
            case "NC":
                addNewCar();
                break;
            default:
                System.out.println("Not a command!");
        }

    }

    private static void addNewCar() {

        int index = getEmptySlot();

    }

    private static int getEmptySlot() {

        int index = 0;
        while (index < maxCars && brands[index] != null){
            index++;
        }
        
        return index;

    }


}
