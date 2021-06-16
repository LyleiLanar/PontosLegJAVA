package main.algoritmusok;

import java.util.Scanner;

public class MaratonSexy {

    /*
            Menü: amiből kiválasztjuk mit akarunk csinálni.

            1. Adat felvitel
            2. Adatok kiírása
            3. Átlag életkor
            4. Szeniorok száma
            5. Megadott ország futóinak nevei
            6. Mindenkinek sikerült szintidőn belül?
            7. Nurmo Paavi?
            8. Ki a győztes?
            9. Ranglista kiírás
            Q. Kilépés

     */

    static final int szintido = 330;
    private static final String HIBA_NEM_VOLT_ADATFELTOLTES = "!!! Hiba: Nem volt adatfeltoltes !!!";

    static String[] nevek;
    static String[] orszagok;
    static int[] eletkorok;
    static int[] eredmenyek;    // automatikusan minden eleme 0 lesz.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String valasztottMenupont;

        kirajzolMenu();

        do {

            System.out.print(">>> ");
            valasztottMenupont = sc.nextLine().toUpperCase();

            valasztMenupont(valasztottMenupont);

        } while (!valasztottMenupont.equals("Q"));

    }

    private static void valasztMenupont(String valasztottMenupont) {
        switch (valasztottMenupont) {
            case "1":
                adatokFelvitele();
                break;

            case "2":
                if (voltEAdatFeltoltes()) {
                    futokKiirasa();
                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }
                break;

            case "3":
                if (voltEAdatFeltoltes()) {

                    System.out.println("Az átlag életkor: " + kapAtlagEletkor() + " év.");
                    System.out.println();
                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }
                break;

            case "4":
                if (voltEAdatFeltoltes()) {
                    System.out.println("A megjelent szeniorok száma: " + kapSzeniorokSzama() + " fő.");
                    System.out.println();
                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }
                break;

            case "5":
                if (voltEAdatFeltoltes()) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Add meg az ország azonosítót: ");

                    String orszagAzon = sc.nextLine();

                    String[] nevek = kapFutokNeveiByOrszag(orszagAzon);

                    int index = 0;
                    while (index < nevek.length && nevek[index] != null) {
                        System.out.println(nevek[index]);
                        index++;
                    }
                    System.out.println();
                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }

                /*
                        MaratonSexy.Nevek       Nevek (kapFutokNeveiByOrszag("HUN"))
                        *********               ***********
                        Béla H                  Béla
                        George G                Céla
                        Jukka F                 null
                        Céla H                  null

                 */

                break;

            case "6":
                if (voltEAdatFeltoltes()) {

                    if (sikerultESzintidoMindenkinek()) {
                        System.out.println("Mindenkinek sikerült a szintidő!");
                    } else {
                        System.out.println("NEM sikerült mindekinek a szintidő!");
                    }

                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }

                break;

            case "7":
                if (voltEAdatFeltoltes()) {
                    int rajtszam = kapFutoSzamByNev();

                    if (rajtszam >= 0) {
                        System.out.println("Rtszám: " + rajtszam + ". | Nev: " + nevek[rajtszam] + " | Orsz:" + orszagok[rajtszam] + " | Kor: " + eletkorok[rajtszam] + " | Idő: " + eredmenyek[rajtszam]);
                    } else {
                        System.out.println("Nincs ilyen nevű versenyzőnk!");
                    }

                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }
                break;

            case "8":
                if (voltEAdatFeltoltes()) {

                    int gyoztesId = kapGyoztesRajtszam();
                    System.out.println("A maratoni futóverseny győztese: " + nevek[gyoztesId] + " (" + gyoztesId + ")"); //Kovács Lajos (23)

                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }

                System.out.println();

                break;

            case "9":
                if (voltEAdatFeltoltes()) {

                    System.out.println("A maraton toplistája: ");

                    int[] ranglista = kapRanglista();


                    for (int i = 0; i < ranglista.length; i++) {
                        int index = ranglista[i];
                        System.out.println((i + 1) + ". helyezett: " + nevek[index] + " (" + index + ") | Idő: " + eredmenyek[index]);
                    }

                    System.out.println();
                } else {
                    System.out.println(HIBA_NEM_VOLT_ADATFELTOLTES);
                }
                break;

            case "Q":
                System.out.println("Kilépés!");
                break;

            default:
                System.out.println("Nincs ilyen menüpont!");
                System.out.println();
                break;

        }


    }

    public static void kirajzolMenu() {

        System.out.println("*** Maraton verseny program ***");
        System.out.println();
        System.out.println("Válasszon az alábbi menüpontok közül:");
        System.out.println("1. Adatok felvitele");
        System.out.println("2. Futók kiírása");
        System.out.println("3. Mennyi az átlag életkor?");
        System.out.println("4. Mennyi a szeniorok száma:");
        System.out.println("5. Megadott ország futói.");
        System.out.println("6. Mindenkinek sikerült szintidőn belül?");
        System.out.println("7. Futó keresése");
        System.out.println("8. Ki a győztes?");
        System.out.println("9. Ranglista kiírása");
        System.out.println("Q. Kilépés");


    }

    private static int[] kapRanglista() {

        int[] rajtszamok = new int[MaratonSexy.eredmenyek.length];
        int[] eredmenyek = new int[MaratonSexy.eredmenyek.length];

        for (int i = 0; i < eredmenyek.length; i++) {
            eredmenyek[i] = MaratonSexy.eredmenyek[i];
        }

        for (int i = 0; i < eredmenyek.length; i++) {
            rajtszamok[i] = i;
        }

        int miniIndex;

        for (int i = 0; i < eredmenyek.length - 1; i++) {
            miniIndex = i;

            for (int j = i + 1; j < eredmenyek.length; j++) {
                if (eredmenyek[j] < eredmenyek[miniIndex]) {
                    miniIndex = j;
                }
            }

            int csere = rajtszamok[miniIndex];
            rajtszamok[miniIndex] = rajtszamok[i]; //ranglista[miniIndex] = ranglista[i]; <- ez bezony nem jó.
            rajtszamok[i] = csere;


            //  0    1    2          i = 1, miniIndex = 1,  j = 3
            //  2    1    0         csere 300
            // 200, 300, 400

            csere = eredmenyek[miniIndex];
            eredmenyek[miniIndex] = eredmenyek[i];
            eredmenyek[i] = csere;

        }

        return rajtszamok;
    }

    private static int kapGyoztesRajtszam() {

        int minIndex = 0;

        for (int i = 0; i < nevek.length; i++) {
            if (eredmenyek[i] < eredmenyek[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static int kapFutoSzamByNev() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a futó nevét: ");

        String futoNeve = sc.nextLine().toUpperCase();

        int index = 0;
        while ((index < nevek.length) && !(nevek[index].equals(futoNeve))) {
            index++;
        }

        if (index < nevek.length) {
            return index;
        }
        return -1;
    }

    private static boolean sikerultESzintidoMindenkinek() {

        int index = 0;

        while ((index < nevek.length) && (eredmenyek[index] <= 330)) {
            index++;
        }

        return !(index < nevek.length);
    }

    private static String[] kapFutokNeveiByOrszag(String orszagAzon) {

        String[] nevek = new String[MaratonSexy.nevek.length];
        orszagAzon = orszagAzon.toUpperCase();

        int j = 0;
        for (int i = 0; i < MaratonSexy.nevek.length; i++) {
            if (orszagok[i].equals(orszagAzon)) {
                nevek[j] = MaratonSexy.nevek[i];
                j++;
            }
        }

        return nevek;
    }

    private static int kapSzeniorokSzama() {

        int seniorSzam = 0;
        for (int i = 0; i < eletkorok.length; i++) {
            if (eletkorok[i] > 35) {
                seniorSzam++;
            }
        }
        return seniorSzam;
    }

    private static double kapAtlagEletkor() {

        int szumEletkor = eletkorok[0];
        for (int i = 1; i < eletkorok.length; i++) {
            szumEletkor += eletkorok[i];
        }

        return (double) szumEletkor / eletkorok.length;
    }

    private static void futokKiirasa() {

        for (int i = 0; i < nevek.length; i++) {
            System.out.println("Rtszám: " + i + " | Nev: " + nevek[i] + " | Orsz:" + orszagok[i] + " | Kor: " + eletkorok[i] + " | Idő: " + eredmenyek[i]);
        }
        System.out.println();

    }

    private static void adatokFelvitele() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mennyi futó indult a versenyen: ");
        int db = Integer.parseInt(sc.nextLine());

        nevek = new String[db];
        orszagok = new String[db];
        eletkorok = new int[db];
        eredmenyek = new int[db];

        for (int i = 0; i < db; i++) {
            System.out.println("***  " + i + ". FUTÓ FELTÖLTÉSE ****");
            System.out.print("Add meg a futó nevét: ");
            nevek[i] = sc.nextLine().toUpperCase();

            System.out.print("Add meg a futó országát: ");
            orszagok[i] = sc.nextLine().toUpperCase();

            System.out.print("Add meg a futó korát: ");
            eletkorok[i] = Integer.parseInt(sc.nextLine());

            System.out.print("Add meg a futó eredményét: ");
            eredmenyek[i] = Integer.parseInt(sc.nextLine());
            System.out.println();
        }
        System.out.println("!!!KÉSZ A FELTÖLTÉS!!!");
        System.out.println();

    }

    private static boolean voltEAdatFeltoltes() {
        return nevek != null;
    }

}
