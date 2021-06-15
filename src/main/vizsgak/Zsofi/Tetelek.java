package main.vizsgak.Zsofi;

public class Tetelek {
     /*
            1. Írjuk ki a sorozat átlagát.
            2. Írjuk ki a sorozat legnagyobb elemének a helyét a tömbön belül.
            3. Írjuk ki a sorozoat legkisebb elemének az értékét.
            4. Írjuk ki a sorozat negatív elemeinek a számát.
            5. Írjuk ki a sorozoatban megtalálható tökéletes szám értékét. (Tökéletes szám az a szám, aminek az osztóinak összege maga a szám.) PL. 6 = 3 + 2 + 1
     */

    public static double[] tomb = {13, 7.74, -37.5, -4, 25, -7, 375.3, -17.4, 25, 19.2, 6};


    public static void main(String[] args) {
        kiirSorozatAtlag();
        kiirLegnagyobbElemHelye();
        kiirLegkisebbElemErteke();
        kiirNegativElemekSzama();

        kiirTokeletesSzamErteke();
        kiirnemTokeletesSzamErteke();


    }

    public static void kiirSorozatAtlag() {
        double osszeg = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            osszeg = osszeg + tomb[i];
        }
        double sorozatAtlag = osszeg / tomb.length;
        System.out.println("1. feladat - A sorozat átlaga: " + sorozatAtlag + ".");

    }

    public static void kiirLegnagyobbElemHelye() {
        int maxi = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > tomb[maxi]) {
                maxi = i;
            }
        }
        System.out.println("2. feladat - A legnagyobb szám helye a tömb " + maxi + ". indexén van.");
    }


    public static void kiirLegkisebbElemErteke() {
        int mini = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < tomb[mini]) {
                mini = i;
            }
        }

        //cseles!
        System.out.println("3. feladat - A legkisebb szám értéke  " + tomb[mini] + ".");

    }

    public static void kiirNegativElemekSzama() {
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] < 0) {
                db++;
            }
        }
        System.out.println("4. feladat - " + db + " negatív szám van a tömbünkben.");
    }

    public static void kiirTokeletesSzamErteke() {
        System.out.print("5. feladat - ");
        for (int i = 0; i < tomb.length; i++) {
            for (int n = 0; n < 10; n++) {
                if (tomb[i] == szamolTokeletesSzam(n)) {
                    System.out.print("A(z) ");
                    System.out.print(tomb[i]);
                    System.out.print(" tökéletes szám. ");

                }
            }
        }
    }

    public static void kiirnemTokeletesSzamErteke() {
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            //miért pont 10-ig?
            for (int n = 0; n < 10; n++) {
                if (tomb[i] != szamolTokeletesSzam(n)) {
                    db++;
                }
            }
        }
        if (db >= (tomb.length * 10)) {
            System.out.println("Nincs ilyen szám");
        }
    }


    public static double szamolTokeletesSzam(int n) {

        //sajnos ez a képlet csak az első négy tökéletes számra igaz, meg csak saccolások vannak formalizált képletre. :(
        return (Math.pow(2, n - 1) * (Math.pow(2, n) - 1));
    }
}



