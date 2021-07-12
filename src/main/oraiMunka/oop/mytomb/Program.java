package main.oraiMunka.oop.mytomb;

public class Program {
    public static void main(String[] args) {

//        MyTomb myTomb = new MyTomb(10);
//
//        myTomb.kiir();
//        myTomb.general(10);
//        myTomb.kiir();
//        System.out.println("Az elemek összege: " + myTomb.getOsszeg());
//        System.out.println("A legkisebb elem: " + myTomb.getMinumun());
//        System.out.println("A legnagyobb elem: " + myTomb.getMaximum());
//
//        MyTomb alap = new MyTomb(10);
//        alap.general(10);
//
//        MyTomb masik = new MyTomb(5);
//        masik.general(10);
//
//        alap.kiir();
//        masik.kiir();
//
//        //System.out.println(alap.vanErtek(10));
//
//        MyTomb kulonbozok = alap.getNemSzereploErtekek(masik);
//       kulonbozok.kiir();

        MyTomb proba = new MyTomb(10);

        System.out.println("Proba:");
        proba.general(10);
        proba.kiir();

        System.out.println("Proba2:");
        proba.hozzafuz(33);
        proba.kiir();

        System.out.println("Proba3:");
        proba.hozzafuz(44);
        proba.kiir();

        MyTomb kieg = new MyTomb(5);
        kieg.general(10);
        System.out.println("Kieg:");
        kieg.kiir();

        MyTomb kulonbozok = proba.getNemSzereploErtekek(kieg);
        System.out.println("Különbözők:");
        kulonbozok.kiir();
        proba.hozzafuz(kulonbozok);

        System.out.println("Összefűzött próba:");
        proba.kiir();






    }
}

