package main.hf;

public class HF2_1 {

    public static void main(String[] args) {

        int szam = -35;

        if (szam % 3 == 0) {
            System.out.println("A " + szam + " osztható hárommal.");
        }

        if (szam % 3 != 0) {
            System.out.println("A " + szam + " NEM osztható hárommal.");
        }

        if (szam % 4 == 0) {
            System.out.println("A " + szam + " osztható néggyel.");
        }

        if (szam % 4 != 0) {
            System.out.println("A " + szam + " NEM osztható néggyel.");
        }

        if (szam % 9 == 0) {
            System.out.println("A " + szam + " osztható kilenccel.");
        }

        if (szam % 9 != 0) {
            System.out.println("A " + szam + " NEM osztható kilenccel.");
        }

        if (szam % 4 == 0 && szam % 9 == 0) {
            System.out.println("A " + szam + " osztható hárommal, néggyel és kilenccel is.");
        }

        if (!(szam % 4 == 0 && szam % 9 == 0)) {
            System.out.println("A " + szam + " NEM osztható hárommal, néggyel és kilenccel egyszerre.");
        }

        if (szam % 2 == 0){
            System.out.println("A " + szam + " páros!");
        }

        if (szam % 2 != 0){
            System.out.println("A " + szam + " páratlan!");
        }

        if (szam<0){
            System.out.println("A " + szam + " negatív!");
        }

        if (szam >=0){
            System.out.println("A " + szam + " pozitív!");
        }
    }
}
