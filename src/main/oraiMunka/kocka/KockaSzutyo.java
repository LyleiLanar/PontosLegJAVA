package main.oraiMunka.kocka;

import main.enums.KockaTipus;
import main.enums.Szin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class KockaSzutyo {

    /*
        Hozzunk létre egy olyan programot, ami dobókockákat tárol
        Ezekkel meg tudunk műveleteket végrehajtani.
    */

    public static final String folderPath = "src\\main\\oraiMunka\\kocka";
    public static final int maxKocka = 6;
    public static Szin[] szinek = new Szin[maxKocka];
    public static KockaTipus[] kockak = new KockaTipus[maxKocka];

    public static void main(String[] args) throws IOException {

      betolt();
      kiirOsszesKocka();

      torlesKocka(3);
      mentes();

    }

    public static boolean adKocka(Szin szin, KockaTipus tipus) {

        int hely = kapElsoUresHely();

        if (hely != -1) {
            szinek[hely] = szin;
            kockak[hely] = tipus;
            return true;
        }
        return false;


    }

    public static void kiirKocka(int hely) {
        if (kockak[hely] != null) {

            System.out.println("[" + hely + "] " + szinek[hely] + " " + kockak[hely]);
        } else {
            System.out.println("[" + hely + "] " + "...");
        }
    }

    public static int kapElsoUresHely() {

        int index = 0;

        while ((index < maxKocka) && (kockak[index] != null)) {
            index++;
        }

        if (index < maxKocka) {
            return index;
        } else {
            return -1;
        }
    }

    public static void kiirOsszesKocka() {
        for (int i = 0; i < kockak.length; i++) {
            kiirKocka(i);
        }
    }

    public static void torlesKocka(int hely) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Biztos szeretnéd törölni ez a kockát? (y)es");
        kiirKocka(hely);
        char valasz = sc.nextLine().toUpperCase().charAt(0);

        if (valasz == 'Y') {
            kockak[hely] = null;
            szinek[hely] = null;
            System.out.println("Sikeres törlés!");
        } else {
            System.out.println("Törlés visszavonva!");
        }

        sc.close();
    }

    public static String getKockaCSVFormat(int hely) {

        return szinek[hely] + ";" + kockak[hely];

    }

    public static void mentes() throws IOException {

        FileWriter fileWriter = new FileWriter(folderPath + "\\szutyo.csv");

        for (int i = 0; i < maxKocka; i++) {
            fileWriter.write(getKockaCSVFormat(i) + "\n");
        }

        fileWriter.flush();
        fileWriter.close();

    }

    public static void betolt() throws FileNotFoundException {

        File szutyoFile = new File(folderPath + "\\szutyo.csv");

        Scanner fileScanner = new Scanner(szutyoFile);

        while (fileScanner.hasNextLine()) {

            String nextKocka = fileScanner.nextLine();
            String szin = nextKocka.split(";")[0];
            String tipus =nextKocka.split(";")[1];
            adKocka(getSzinEnum(szin), getKockaTipusEnum(tipus));
        }
    }

    public static Szin getSzinEnum(String szin) {

        switch (szin.toUpperCase()) {
            case "PIROS":
                return Szin.PIROS;
            case "SÁRGA":
                return Szin.SÁRGA;
            case "KÉK":
                return Szin.KÉK;
            case "ZÖLD":
                return Szin.ZÖLD;
            case "FEHÉR":
                return Szin.FEHÉR;
            case "FEKETE":
                return Szin.FEKETE;
            default:
                return null;
        }
    }

    public static KockaTipus getKockaTipusEnum(String tipus) {

        switch (tipus.toUpperCase()) {
            case "D4":
                return KockaTipus.D4;
            case "D6":
                return KockaTipus.D6;
            case "D8":
                return KockaTipus.D8;
            case "D10":
                return KockaTipus.D10;
            case "D12":
                return KockaTipus.D12;
            case "D20":
                return KockaTipus.D20;
            default:
                return null;
        }
    }

}
