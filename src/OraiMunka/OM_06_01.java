package OraiMunka;

import java.util.Scanner;

public class OM_06_01 {

    /*
        Írjunk olyan programot, amely addig kér
        be egész számokat a billentyűzetről, amíg azok összege meg nem haladja a 100-at. A
        beolvasás végén írjuk ki azt, hogy a bekért számok közül hány volt páros, és hány volt
        páratlan.
     */

    public static void main(String[] args) {
        kiirSzamokOsszeg();
    }

    static public void kiirSzamokOsszeg() {
        Scanner sc = new Scanner(System.in);

        int osszeg = 0;

        int paros = 0;
        int paratlan = 0;

        while (osszeg <= 100) {

            System.out.println("Adj meg egy számot: ");
            int szam = Integer.parseInt(sc.nextLine());

            osszeg += szam;

            if (szam % 2 == 0) {
                paros++;
            } else {
                paratlan++;
            }
        }

        System.out.println();
        System.out.println("Meghaladtuk a 100-at, most már elég lesz!");
        System.out.println("Páros: " + paros + " Páratlan: " + paratlan);

    }
}
