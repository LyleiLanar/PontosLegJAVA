package main.oraiMunka.proc;

public class PozitivSzum {

    public static int[] tomb;

    public static boolean pozitivE(int szam) {
        return szam >= 0;
    }

    public static void tombGeneral(int n) {

        tomb = new int[n];

        for (int i = 0; i < tomb.length; i++) {

                                //Math.random((max-min)+1) + min
            tomb[i] = (int) ((Math.random() * 202) - 101);

        }
    }

    public static void main(String[] args) {

        tombGeneral(1000);


        int db = 0;
        int szum = 0;
        for (int i = 0; i < tomb.length; i++) {

            System.out.println("Az " + (i + 1) + ". szám: " + tomb[i]);

            if (pozitivE(tomb[i])) {
                db++;
            } else {
                szum += tomb[i];
            }
        }
        System.out.println("A pozitív számok mennyisége: " + db);
        System.out.println("A negatív számok összege: " + szum);

    }




    /*
            Legyen egy olyan metódus, ami megállapítja, hogy egy szám a pozitív-e. 0 is pozitív legyen.

            Legyen egy olyan metódus ami feltölt egy n (paraméter) elemű tömböt -100 és +100 közötti random értékekkel.

             - Ezek után a main metódusban írjuk ki, hogy a tömbünk az hány pozitív számmal rendelkezik. // megszámlálás
             - Ezen a tömbon adjuk össze a negatív számokat. // összegzés

                A tömb az legyen osztályszintű azaz statikus.

     */


}
