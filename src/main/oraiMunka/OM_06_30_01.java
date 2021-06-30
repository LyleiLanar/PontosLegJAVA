package main.oraiMunka;

import java.util.Scanner;

public class OM_06_30_01 {

    /*
        Kérjünk be a felhasználótól n számot, ami 0-9 közötti.
        Ezeket rakjuk egy tömbbe.
        Ezek után egy tömbbe írjuk be a szöveges formáját az adott számnak. 0-> "nulla", 1->"egy"
        Írassuk ki a két tömböt egy más mellé. | 2, azaz kettő   |

     */
    public static final int tombMeret = 3;
    public static final String hibaRosszSzam = "Nem megfelelő szám, kérlek adj meg egy másikat: ";

    public static void main(String[] args) {
        int[] szamok = bekerSzamok();
        String[] szövegesSzam = csinalSzovegesSzamok(szamok);
        for (int i = 0; i < szövegesSzam.length; i++) {
            System.out.println(szamok[i] + ", azaz " + szövegesSzam[i]);

        }

    }

    public static int[] bekerSzamok() {

        int[] szamokTömb = new int[tombMeret];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < szamokTömb.length; i++) {
            System.out.print("Adj meg egy számot 0-9 között: ");
            int szam = Integer.parseInt(sc.nextLine());

            while (szam < 0 || szam > 9) {
                System.out.print(hibaRosszSzam);
                szam = Integer.parseInt(sc.nextLine());
            }
            szamokTömb[i] = szam;
        }

        return szamokTömb;
    }

    public static String[] csinalSzovegesSzamok(int[] szamokTömb) {
        String[] szovegSzamok = new String[szamokTömb.length];
        for (int i = 0; i < szamokTömb.length; i++) {
            switch (szamokTömb[i]) {
                case 0:
                    szovegSzamok[i] = "nulla";
                    break;
                case 1:
                    szovegSzamok[i] = "egy";
                    break;
                case 2:
                    szovegSzamok[i] = "kettő";
                    break;
                case 3:
                    szovegSzamok[i] = "három";
                    break;
                case 4:
                    szovegSzamok[i] = "négy";
                    break;
                case 5:
                    szovegSzamok[i] = "öt";
                    break;
                case 6:
                    szovegSzamok[i] = "hat";
                    break;
                case 7:
                    szovegSzamok[i] = "hét";
                    break;
                case 8:
                    szovegSzamok[i] = "nyolc";
                    break;
                case 9:
                    szovegSzamok[i] = "kilenc";
                    break;
            }
        }
        return szovegSzamok;


    }

}
