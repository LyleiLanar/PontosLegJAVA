package main.vizsgak;

public class Tetelek {

    /*
            1. Írjuk ki a sorozat átlagát.
            2. Írjuk ki a sorozat legnagyobb elemének a helyét a tömbön belül.
            3. Írjuk ki a sorozoat legkisebb elemének az értékét.
            4. Írjuk ki a sorozat negatív elemeinek a számát.
            5. Írjuk ki a sorozoatban megtalálható tökéletes szám értékét. (Tökéletes szám az a szám, aminek az osztóinak összege maga a szám.) PL. 6 = 3 + 2 + 1

     */

    public static double[] tomb = {3, 7.74, -37.5, 496, -4, 25, -7, 375.3, -17.4, 25, 19.2, 6};

    public static void main(String[] args) {


        otosFeladat();


    }

    public static void otosFeladat() {
        /*
                LINEÁRIS KERESÉS
                -----------------------------------
                        algoritmus LinearisKereses
                I := 0
                amíg (I<N) és (A[I] NEM P tulajdonságú) ismétel
                I := I + 1
                avége
                Hely := I
                Van := (I<N)

                        ha (I<N) akkor
                Hely := I
                        különben
                Hely := -1
                -----------------------------------
        */


        int index = 0;

        while ((index < tomb.length) && (!tokeleteE(tomb[index]))) {
            index++;
        }

        boolean vanTokeletesSzam = (index < tomb.length);

        if (vanTokeletesSzam) {
            System.out.println("Van tökéletes szám, és ez a: " + tomb[index]);
        } else {
            System.out.println("Nincs tökéletes szám.");
        }

    }

    public static boolean tokeleteE(double szam) {

        double osszeg = 0;
        for (int i = 1; i < szam; i++) {
            if (szam % i == 0) {
                osszeg += i;
            }
        }

        return osszeg == szam;

    }
}
