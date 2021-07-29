package main.adventOfCode.ms2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static int[][] data;

    public static String readInput() {

        File file = new File("src\\main\\adventOfCode\\ms2\\inputData.txt");

        String fajlSzoveg = "";
        Scanner fileScanner = null;

        try {

            fileScanner = new Scanner(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("A fájl nem található!");
        }

        while (fileScanner.hasNextLine()) {
            fajlSzoveg += fileScanner.nextLine() + "\n";
        }

        return fajlSzoveg;
    }

    public static void setData() {

        String[] sorok = readInput().split("\n");

        int[][] data = new int[sorok.length][];

        for (int i = 0; i < data.length; i++) {

            String[] sor = sorok[i].split("\t");
            int[] tomb = new int[sor.length];

            for (int j = 0; j < sor.length; j++) {
                tomb[j] = Integer.parseInt(sor[j]);
            }

            data[i] = tomb;
        }

        Main.data = data;

    }

    public static void printData() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getEllenorzoSzam(int[] sor) {

        int min = sor[0];
        int max = sor[0];

        for (int i = 1; i < sor.length; i++) {

            if (sor[i] < min) {
                min = sor[i];
            }

            if (sor[i] > max) {
                max = sor[i];
            }
        }

        return max - min;

    }

    public static int getEllenorzoSzam2(int[] sor) throws Exception {
/*
        MINIMUMKIVÁLASZTÁSOS RENDEZÉS
     -----------------------------------
            ciklus I:=1..N-1 ismétlés
                MinIndex := I
                ciklus J:=I+1..N ismétel
                    ha A[J]<A[MinIndex] akkor
                        MinIndex = J
                    hvége
                cvége
                Csere:=A[MinIndex]
                A[MinIndex]:=A[I]
                A[I]:=Csere
            cvége
     -----------------------------------

*/

        for (int i = 0; i < sor.length - 1; i++) {


            for (int j = i + 1; j < sor.length; j++) {
                System.out.println(sor[i] + " - " + sor[j]);
                //System.out.println(sor[i] + " % " + sor[j] + " = " + sor[i] % sor[j]);
               // System.out.println(sor[j] + " % " + sor[i] + " = " + sor[j] % sor[i]);

                if (sor[i] % sor[j] == 0) {
                    System.out.println("\n*** TALÁLAT (" + sor[i] / sor[j] + ") ***\n");
                    return sor[i] / sor[j];
                }

                if (sor[j] % sor[i] == 0) {
                    System.out.println("\n*** TALÁLAT (" + sor[j] / sor[i] + ") ***\n");
                    return sor[j] / sor[i];
                }

                System.out.println();
            }
            System.out.println("Következő szám!\n");
        }

        throw new Exception("Nincs ilyen érték a sorban.");

    }

    public static int getCheckSum() {

        int szum = 0;

        for (int i = 0; i < data.length; i++) {

            try {
                szum += getEllenorzoSzam2(data[i]);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }

        return szum;

    }

    public static void main(String[] args) {

        setData();
        printData();
        System.out.println();
        System.out.println("Checksum: " + getCheckSum());

    }
}
