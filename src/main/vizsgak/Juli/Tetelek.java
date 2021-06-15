package main.vizsgak.Juli;

public class Tetelek {


    /*
            1. Írjuk ki a sorozat átlagát.
            2. Írjuk ki a sorozat legnagyobb elemének a helyét a tömbön belül.
            3. Írjuk ki a sorozoat legkisebb elemének az értékét.
            4. Írjuk ki a sorozat negatív elemeinek a számát.
            5. Írjuk ki a sorozoatban megtalálható tökéletes szám értékét. (Tökéletes szám az a szám, aminek az osztóinak összege maga a szám.) PL. 6 = 3 + 2 + 1
     */

    public static double[] tomb = {3, 7.74, -37.5, -4, 25, -7, 375.3, -17.4, 25, 19.2};


    public static void main(String[] args) {

        feldolgozTomb();

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 1 == 0) {
                kiirSzamOsztoi();
            } else {
                System.out.println("A " + tomb[i] + " szám nem egész szám, így a fasorban sincs a tökéletes szám címétől.");
            }
        }


    }

    //tömb átlagának kiírása

    public static void tombAtlagKiir() {
        double osszeg = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            osszeg = osszeg + tomb[i];
        }

        double tombAtlag = osszeg / tomb.length;
        System.out.println("A tömb átlagértéke: " + tombAtlag);
        System.out.println();

    }

    //tömb max érték helyének kiíratása

    public static int kiirLegnagyobbIndex(double[] tomb) {
        int legnagyobbIndex = 0;

        for (int i = 1; i < tomb.length; i++) {

            if (tomb[legnagyobbIndex] < tomb[i]) {
                legnagyobbIndex = i;
            }
        }
        System.out.println("A tömb legnagyobb értéke a büszke és dicső " + legnagyobbIndex + ". indexen található.");
        System.out.println();

        return legnagyobbIndex;
    }

    //tömb min érték  kiíratása

    public static int kiirMinErtek(double[] tomb) {
        int minI = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < tomb[minI]) {
                minI = i;


            }

        }
        System.out.println("Nem szégyen a legkisebbnek lenni a tömbben, kedves " + minI + ". indexen található " + tomb[minI] + " érték.");
        System.out.println();
        return minI;


    }

    public static double kiirNegativSzamok() {
        int dbNegativ = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < 0) {
                dbNegativ++;
            }
        }
        System.out.println("A tömbben a negatív számok száma: " + dbNegativ + " .");
        return dbNegativ;
    }

    public static void feldolgozTomb() {

        System.out.println("Számítsuk ki a megadott tömb átlagát, a legnagyobb értékének indexét, a legkisebb értékét és a negatív számokat.");
        System.out.println();
        ;
        tombAtlagKiir();
        kiirLegnagyobbIndex(tomb);
        kiirMinErtek(tomb);
        kiirNegativSzamok();

    }


    public static void kiirSzamOsztoi() {


        // ez tök jól indul, de látom belezavarodtál :D
        for (double osztando = tomb[0]; osztando >= 1; osztando--) {
            System.out.print(osztando + " osztói: ");
            for (int oszto = 1; oszto <= osztando; oszto++)
                if (osztando % oszto == 0) {
                    System.out.print(oszto + " ");
                }
            System.out.println();

        }

    }

}

