package main.adatszerkezetek.sor;

public class EgyediSor {
    private char[] sor;
    private int utolsoI;
    private int hossz;

    public EgyediSor(int hossz) {
        this.hossz = hossz;
        utolsoI = hossz;
        sor = new char[hossz];
    }

    public boolean tele() {
        return utolsoI == 0;
    }

    public boolean ures() {
        return utolsoI == hossz;
    }

    public boolean beletesz(char karakter) {
        if (!tele()) {
            utolsoI--;
            sor[utolsoI] = karakter;
            return true;
        }
        return false;
    }

    public char kivesz() throws Exception {
        if (!ures()) {

            char utolsoElem = sor[hossz - 1];
            for (int i = hossz - 1; i >= utolsoI + 1; i--) {
                sor[i] = sor[i - 1];
            }
            utolsoI++;
            return utolsoElem;
        }
        throw new Exception("Üres a sor");
    }

    /*    5  3   7   11  15
             0   1   2   3   4   5   6   7
           #################################
        -> | - | - | - | - | - | C | B | A |
           #################################
                                 ^
                                 u
     */
    public void rajzol() {
        System.out.print("    ");

        for (int i = 0; i < hossz; i++) {
            System.out.print("  " + i + " ");
        }
        System.out.println();

        System.out.print("    ");
        for (int i = 0; i < hossz; i++) {
            System.out.print("####");
        }
        System.out.println("#");

        System.out.print(" -> ");
        for (int i = 0; i < hossz; i++) {
            String ertek = "-";

            if (utolsoI <= i) {
                ertek = sor[i] + "";
            }

            System.out.print("| " + ertek + " ");
        }

        System.out.println("|");

        System.out.print("    ");
        for (int i = 0; i < hossz; i++) {
            System.out.print("####");
        }
        System.out.println("#");

        System.out.print("    ");

        if (!ures()) {
            for (int i = 0; i < ((utolsoI + 1) * 4) - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("^");
        }else{
            System.out.println("ÜRES");
        }
        System.out.println();


    }


}
