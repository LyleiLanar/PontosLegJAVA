package main.utasitasok;

public class ForCiklusMetosudokkal {


    public static void main(String[] args) {

        System.out.println("Dobások összege: " + dobasTobbD6(10));

    }

    public static int dobasD6() {
        int dobas=dobas(6);
        dobasKiir(dobas);
        return dobas;

    }

    public static int dobasTobbD6(int mennyiseg) {

        int osszeg = 0;

        for (int i = 0; i < mennyiseg; i++) {

            int dobas = dobasD6();
            osszeg = osszeg + dobas;
        }

        return osszeg;

    }

    public static void dobasKiir(int dobas){

        System.out.println("Dobas eredmeny: " + dobas);

    }

    public static int dobas(int oldalakSzama) {

        return (int) ((Math.random() * oldalakSzama) + 1);

    }
}
