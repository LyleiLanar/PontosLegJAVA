package main.autok.proc;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

enum Uzemanyag{
    BENZIN, DIESEL
}

public class AutoKereskedes {

    //Mennyi autó fér el a kereskedésben.
    public static final int maxCars = 50;
    public static Scanner sc = new Scanner(System.in);

    //Az adott index értékű autónak milyen tulajdonságai vannak.
    public static final String[] brands = new String[maxCars];
    public static final String[] types = new String[maxCars];
    public static final int[] years = new int[maxCars];
    public static final int[] prices = new int[maxCars];
    public static final String[] colors = new String[maxCars];
    public static final int[] kms = new int[maxCars];
    public static final char[] fuels = new char[maxCars];
   // public static final Uzemanyag[] fuels = new Uzemanyag[maxCars];
    public static final char[] shifters = new char[maxCars];


    public static void main(String[] args) throws IOException {
        //Jó lenne ha tudnánk autót vásárolni, szerezni "BUY"
        //El tudnánk adni.                              "SELL"
        //Ki tudnánk írni a raktárkészlet               "STORAGE"
        //Adott autó kiírása                            "PRINT 12"
        //Keresni az autók között, bizonyos paraméterekkel
        //Valami menü, vagy parancsokkal lehetne ezt megtenni.
        //Kilép                                         "QUIT"


        //>>


        System.out.println("*** Autókereskedelmi kisalkalmazás *** \n    by Pont Systems Zrt.");
        String command;
        do {

            String[] input = getStringValue(">> ").toUpperCase().split(" ");
            command = input[0];

            String parameter = "nincs";

            if (input.length > 1) {
                parameter = input[1];
            }

            switch (command) {
                case "BUY":
                    addNewCar();
                    break;

                case "SELL":

                    try {
                        sellCar(Integer.parseInt(parameter));
                    } catch (NumberFormatException e) {
                        System.out.println("Nem megfelelő paraméter a SELL parancsnál!");
                    } catch (Exception e) {
                        System.out.println("Ismeretlen hiba a SELL parancsnál!");
                    }
                    break;

                case "PRINT":
                    try {
                        if (parameter.equals("-A")) {
                            int db = 0;
                            for (int i = 0; i < maxCars; i++) {
                                if (!isPlaceEmpty(i)) {
                                    printCarByPlace(i);
                                    db++;
                                }
                            }
                            if (db == 0) {
                                System.out.println("Nincs autó a kereskedésben!");
                            }
                        } else if (parameter.equals("-E")) {
                            int db = 0;
                            for (int i = 0; i < maxCars; i++) {
                                if (isPlaceEmpty(i)) {
                                    printCarByPlace(i);
                                    db++;
                                }
                            }
                            if (db == 0) {
                                System.out.println("Tele van a kereskedés!");
                            }
                        } else {
                            printCarByPlace(Integer.parseInt(parameter));
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Nem megfelelő paraméter a PRINT parancsnál!");
                    } catch (Exception e) {
                        System.out.println("Ismeretlen hiba a PRINT parancsnál!");
                    }
                    break;


                case "HELP":
                    System.out.println("BUY - Új autó vásárlása");
                    System.out.println("SELL <hely> - Autó eladása a <hely>-ről.");
                    System.out.println("QUIT - Kilépés");
                    System.out.println("PRINT <hely> - Autó a <hely>-en.");
                    System.out.println("PRINT -A - Összes autó");
                    break;
                case "QUIT":
                    System.out.println("Viszlát!");
                    break;

                default:
                    System.out.println("Nincs ilyen parancs!");
                    break;

            }
        } while (!command.equals("QUIT"));
    }

    public static void addNewCar() {
        int i = 0;
        while ((i < maxCars) && !isPlaceEmpty(i)) {
            i++;
        }
        if (i < maxCars) {

            System.out.println("Új autó hozzáadása");

            brands[i] = getStringValue("Add meg az autó márkáját: ");
            types[i] = getStringValue("Add meg az autó típusát: ");
            years[i] = getNumericValue("Add meg az autó évjáratát: ");
            prices[i] = getNumericValue("Add meg az autó árát: ");
            colors[i] = getStringValue("Add meg az autó színét: ");
            kms[i] = getNumericValue("Add meg a megtett kilómétert: ");
            fuels[i] = getStringValue("Add meg az autó üzemanyag típusát: ").charAt(0);
            shifters[i] = getStringValue("Add meg az autó váltó típusát: ").charAt(0);


        } else {
            System.out.println("Tele a raktár!");
        }

    }

    public static void sellCar(int place) {

        if (!isPlaceEmpty(place)) {
            printCarByPlace(place);

            if (getStringValue("Biztos ezt szeretnéd eladni (Y=Igen, N=Nem)?").equalsIgnoreCase("Y")) {
                brands[place] = null;
                System.out.println("Sikeres eladás!");
            } else {
                System.out.println("Az eladás visszamondva!");
            }
        } else {
            System.out.println("Nincs ilyen autó!");
        }
    }

    private static int getNumericValue(String text) {
        System.out.print(text);
        while (true) {
            boolean hasInt = sc.hasNextInt();
            if (hasInt) {
                int number = sc.nextInt();
                sc.nextLine();
                return number;
            }
            System.out.print("Ez nem szám! Adj meg egyet újra: ");
            sc.nextLine();
        }
    }

    public static void printCarByPlace(int place) {
        if (!isPlaceEmpty(place)) {
            System.out.println("Márka: " + brands[place] + ", Típus: " + types[place] + ", Évjárat: " + years[place] + ", Ár: " + prices[place] + ", Szín: " + colors[place] + ", Megtett km: " + kms[place] + ", Üzemanyag típus: " + fuels[place] + ", Váltó típus: " + shifters[place]);
        } else {
            System.out.println("A(z) " + place + ". helyen nem található autó.");
        }
    }

    public static boolean isPlaceEmpty(int place) {
        return brands[place] == null;
    }

    private static String getStringValue(String text) {

        System.out.print(text);
        return sc.nextLine();
    }


}


