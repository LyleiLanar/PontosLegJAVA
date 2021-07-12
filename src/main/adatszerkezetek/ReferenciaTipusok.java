package main.adatszerkezetek;

public class ReferenciaTipusok {
    public static void main(String[] args) {


        int ertek = 5;
        System.out.println(ertek);
        System.out.println(duplaz(ertek));
        System.out.println(ertek);
        System.out.println("*********");
        int[] szamok = new int[10];

        for (int i = 0; i < szamok.length; i++) {
            szamok[i] = i;
        }

        tombKiir(szamok);
        tombKiir(duplaz(szamok));
        tombKiir(szamok);
    }

    private static void tombKiir(int[] szamok) {
        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i]+" ");
        }
        System.out.println();
    }

    public static int duplaz(int ertek) {
        ertek = ertek * 2;
        return ertek;
    }

    public static int[] duplaz(int[] kiskacsa) {

        for (int i = 0; i < kiskacsa.length; i++) {
            kiskacsa[i] = kiskacsa[i] * 2;
        }
        return kiskacsa;
    }
}
