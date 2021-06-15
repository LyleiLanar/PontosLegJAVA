package main.vizsgak.Vili;

public class Tetelek {
    /*
        1. Írjuk ki a sorozat átlagát.
        2. Írjuk ki a sorozat legnagyobb elemének a helyét a tömbön belül.
        3. Írjuk ki a sorozoat legkisebb elemének az értékét.
        4. Írjuk ki a sorozat negatív elemeinek a számát.
        5. Írjuk ki a sorozoatban megtalálható tökéletes szám értékét. (Tökéletes szám az a szám, aminek az osztóinak összege maga a szám.) PL. 6 = 3 + 2 + 1
 */
    public static double[] tomb = {3, 7.74, -37.5, -4, 25, -7, 375.3, -17.4, 25, 19.2};//6,28,496};
    public static int db = darab();

    public static void main(String[] args) {
        kiir();
    }

    public static void kiir() {
        System.out.println("A sorozat átlaga: " + kiirEgyesFeladat());
        System.out.println(" ");
        System.out.println("A legnagyobb elem helye (indexe): " + kiirKettesFeladat());
        System.out.println(" ");
        System.out.println("Legkisebb elem értéke: " + kiirhHarmasFeladat());
        System.out.println(" ");
        System.out.println("Negatív elemek száma: " + kiirnNegyesFeladat());
        System.out.println(" ");
        //osztokOsszege();
        kiirOtosFeladat();
    }

    public static double kiirEgyesFeladat() {
        System.out.println("*****Egyes feladat*****");

        double atlag = 0;
        for (int i = 0; i < tomb.length; i++) {
            atlag = atlag + tomb[i];
        }
        atlag = atlag / db;
        return atlag;
    }

    public static int darab() {
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            db = db + 1;
        }
        return db;
    }

    public static int kiirKettesFeladat() {
        System.out.println("*****Kettes feladat*****");

        int maxIkettes = 0;
        for (int i = 1; i < db; i++) {
            if (tomb[i] > tomb[maxIkettes]) {
                maxIkettes = i;
            }
        }
        return maxIkettes;
    }

    public static double kiirhHarmasFeladat() {
        System.out.println("*****Hármas feladat*****");

        int minI = 0;
        for (int i = 1; i < db; i++) {
            if (tomb[i] < tomb[minI]) {
                minI = i;
            }
        }
        return tomb[minI];
    }

    public static int kiirnNegyesFeladat() {
        System.out.println("*****Négyes feladat*****");

        int negyes = 0;
        for (int i = 0; i < db; i++) {
            if (tomb[i] < 0) {
                //System.out.println("A " + tomb[i] + " kisebb mint 0.");
                negyes = negyes + 1;
            }
        }
        return negyes;
    }

    /*public static int osztokOsszege() {
        int osztokOsszege = 0;
        int szam = 6;
        //for (int i = 0; i < 7; i++) {
        for (int j = 1; j < szam; j++) {
            if (szam % j == 0) {
                //System.out.println("A " + szam + " osztója a(z) " + j);
                osztokOsszege = osztokOsszege + j;
            }
        }
        System.out.println("A " + szam + " osztóinak összege: " + osztokOsszege);
        if (szam == osztokOsszege) {
            System.out.println("A " + szam + " tökéletes szám");
        }
        return osztokOsszege;
    }*/

    public static void kiirOtosFeladat() {
        System.out.println("*****Ötös feladat*****");

        double szam;
        for (int i = 0; i < tomb.length; i++) {
            szam = tomb[i];
            int osztokOsszege = 0;
            for (int j = 1; j < szam; j++) {
                if (szam % j == 0) {
                    // System.out.println("A " + szam + " osztója a(z) " + j);
                    osztokOsszege = osztokOsszege + j;
                }
            }
            //System.out.println("A " + szam + " osztóinak összege: " + osztokOsszege);
            if (szam == osztokOsszege) {
                System.out.println("A " + szam + " tökéletes szám");
            } else {
                System.out.println("A " + szam + " nem tökéletes szám");
            }
        }
    }
}
