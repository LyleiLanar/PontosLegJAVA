package main.vizsgak.Magdi;

public class Tetelek {
    /*
           1. Írjuk ki a sorozat átlagát.
           2. Írjuk ki a sorozat legnagyobb elemének a helyét a tömbön belül.
           3. Írjuk ki a sorozat legkisebb elemének az értékét.
           4. Írjuk ki a sorozat negatív elemeinek a számát.
           5. Írjuk ki a sorozatban megtalálható tökéletes szám értékét. (Tökéletes szám az a szám,
           aminek az osztóinak összege maga a szám.) PL. 6 = 3 + 2 + 1
    */
    public static double[] tomb = {3, 7.74, -37.5, -4, 25, -7, 375.3, -17.4, 25, 19.2};

    public static void main(String[] args) {
        // sorozat átlagának kiszámolása
        double osszeg = 0;
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg = osszeg + tomb[i];
            db++;
        }
        double atlag = /*(double)*/ osszeg / db;
        System.out.println("A sorozat átlaga: " + atlag);

        //sorozat legnagyobb elemének a helye a tömbön belül!
        int maxIndex = 0;
        double maximum = tomb[maxIndex];

        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i] > maximum) {
                maximum = tomb[i];
                maxIndex = i;
            }
        }
        System.out.println("A tombben levo legnagyobb szam: " + maximum);
        System.out.println("A tombben levo legnagyobb szam indexe: " + maxIndex);

        // sorozat legkisebb elemének az értéke
        int minIndex = 0;
        for (int j = 1;j < tomb.length; j++) {
            if (tomb[j] < tomb[minIndex]){
                minIndex = j;
            }
        }
        System.out.println("A tombben levo legkisebb szam: " + tomb[minIndex]);

        // sorozat negatív elemeinek a száma
        int szamlaloka = 0;
        for (int k = 0; k < tomb.length; k++) {
            if (tomb[k] < 0) {
                szamlaloka = szamlaloka + 1;
            }
        }
        System.out.println("A sorozatban " + szamlaloka + " db negatív szám található.");
    }
}

