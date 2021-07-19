package main.adatszerkezetek.verem;

public class IntVerem {

    private int[] verem;
    private int mutato;
    private int hossz;


    public IntVerem(int hossz) {
        this.hossz = hossz;
        this.mutato = -1;
        this.verem = new int[hossz];
    }

    public boolean tele() {
        return mutato == hossz - 1;
    }

    public boolean ures() {
        return mutato == -1;
    }

    public boolean push(int szam) {
        if (!tele()) {
            mutato++;
            verem[mutato] = szam;
            return true;
        }
        return false;
    }

    public int pull() throws Exception {
        if (!ures()) {
            int utolsoSzam = verem[mutato];
            mutato--;
            return utolsoSzam;
        }
        throw new Exception("Üres a verem");
    }

    public void kiir() {
        System.out.print("Verem: [ ");
//        for (int szam:verem) {
//            System.out.print(szam+" ");
//
//        }

        for (int i = 0; i < hossz; i++) {
            if (i <= mutato) {
                System.out.print(verem[i] + " ");
            } else {
                System.out.print("- ");
            }

        }

        System.out.println("]");
    }

    public void rajzol() {

        for (int i = hossz - 1; i >= 0; i--) {
            String veremErtek = "-";
            String mutatoString = "";

            if (i <= mutato) {
                veremErtek = verem[i] + "";
            }

            if (i == mutato) {
                mutatoString = "<-M";
            }

            System.out.println(i + " | " + veremErtek + " | " + mutatoString);

        }
    }

    /*
             6 | - |
             5 | - |
             4 | - |
             3 | D | <-
             2 | C |
             1 | B |
             0 | A |
     */


}
