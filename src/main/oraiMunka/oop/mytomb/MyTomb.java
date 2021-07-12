package main.oraiMunka.oop.mytomb;

import java.util.Random;

public class MyTomb {

    /*
        intelligens tömb

        - int vagy float (legyen állítható)
        - kiírni az elemeit
        - feltölteni magát véletlen számokkal
        - elemek összegét, minimum és maximum értékét
        - egy másik tömbből legyen képes átvenni értékeket, amik nem szerepelnek benne.

     */

    private int[] tomb;

    public MyTomb(int meret) {

        tomb = new int[meret];

    }

    public int getElem(int index) {
        return tomb[index];
    }

    public void setElem(int index, int ertek) {
        tomb[index] = ertek;
    }

    public int getHossz() {
        return tomb.length;
    }

    public void kiir() {
//  (1, 2, 3, 4, 5)
//
//        System.out.print("(");
//        for (int i = 0; i < tomb.length-1; i++) {
//            System.out.print(tomb[i] + ", "); //"0 "
//        }
//
//        System.out.println(tomb[tomb.length-1]+")");

        if (tomb != null) {


            System.out.print("(");
            for (int i = 0; i < tomb.length; i++) {
                System.out.print(tomb[i] + ", "); //"0 "
            }
            System.out.println("\b\b)");
        } else {
            System.out.println("A tömbben nincsenek elemek!");
        }

    }

    public void general(int felsoHatar) {
        Random rnd = new Random();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = rnd.nextInt(felsoHatar + 1);
        }
    }

    public int getOsszeg() {
        int szum = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            szum = szum + tomb[i];
        }

        return szum;
    }

    public int getMinumun() {
        int min = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
        }
        return min;
    }

    public int getMaximum() {
        int max = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] > max) {
                max = tomb[i];
            }
        }
        return max;
    }

    public MyTomb getNemSzereploErtekek(MyTomb masik) {

         /*
         KIVÁLOGATÁS TÉTELE
         -----------------------------------
            algoritmus Kiválogatás
                Db:=-1
                ciklus I:=0..(N-1) ismétel
                    ha Tomb[I] T tulajdonságú akkor
                        Db := Db + 1
                        T_Tomb[Db] := Tomb[I]
                    hvége
                cvége
         -----------------------------------
         */

        /*

         ELDÖNTÉS TÉTELE
         -----------------------------------
            algoritmus Eldöntes
                I := 0
                amíg (I<N) és (A[I] NEM P tulajdonságú) ismétel
                    I := I + 1
                avége
                Van := (I<N)
         -----------------------------------
         */


        MyTomb kulonbozok = new MyTomb(masik.getHossz());
        int db = 0;

        for (int i = 0; i < masik.getHossz(); i++) {
            int j = 0;
            while (j < tomb.length && (masik.getElem(i) != tomb[j])) {
                j++;
            }
            if (j >= tomb.length) {
                db++;
                kulonbozok.setElem(db - 1, masik.getElem(i));
            }
        }

        if (db == 0) {
            return null;
        }

        MyTomb vegleges = new MyTomb(db);

        for (int i = 0; i < vegleges.getHossz(); i++) {
            vegleges.setElem(i, kulonbozok.getElem(i));
        }

        return vegleges;
    }

    public boolean vanErtek(int ertek) {
        int index = 0;
        while ((index < tomb.length) && !(tomb[index] == ertek)) {
            index++;
        }
        if (index < tomb.length) {
            return true;
        }
        return false;
    }

    public void hozzafuz(MyTomb kieg) {

        for (int i = 0; i < kieg.getHossz(); i++) {
            hozzafuz(kieg.getElem(i));
        }

    }

    public void hozzafuz(int szam) {

        int[] ujTomb = new int[tomb.length + 1];

        for (int i = 0; i < tomb.length; i++) {
            ujTomb[i] = tomb[i];
        }
        ujTomb[ujTomb.length - 1] = szam;

        tomb = ujTomb;

    }

    public void torol() {
        tomb = new int[tomb.length];
    }

}
