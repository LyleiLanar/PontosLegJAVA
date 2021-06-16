package main.oraiMunka.F4;

public class F4_14 {
    public static void main(String[] args) {

        mennyiHatosVan(100);


    }

    public static void mennyiHatosVan(int dobasokSzama) {
        int db = 0;

        for (int i = 0; i < dobasokSzama; i++) {
            int szam = (int) ((Math.random() * (6)) + 1);
            // System.out.println(szam);
            if (szam == 6) {
                db = db + 1;
            }
        }
        System.out.println(dobasokSzama + " dobásból " + db + " db hatos van");
    }


}
