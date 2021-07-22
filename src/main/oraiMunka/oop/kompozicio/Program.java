package main.oraiMunka.oop.kompozicio;

import main.enums.Color;
import main.enums.anyagok.NyilaszaroAnyag;

public class Program {

    public static void main(String[] args) {

        Ajto ajto = new Ajto(NyilaszaroAnyag.FA, Color.FEKETE, true, true, 200, 300);
        Ablak ablak = new Ablak(NyilaszaroAnyag.MUANYAG, Color.KÉK, false, 100, 200, true);

        ablak.kinyit();
        ablak.becsuk();
        ablak.kinyit();

        ablak.redonyFelhuz();
        ablak.redonyLeenged();
        ablak.redonyFelhuz();


    }
}
