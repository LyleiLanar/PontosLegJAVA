package main.oraiMunka.oop.kompozicio;

import main.enums.LampaTipus;

public class Lampa {

    private boolean vilagit;
    private LampaTipus tipus;
    private int fenyero;

    public Lampa(LampaTipus tipus, int fenyero) {
        this.vilagit = false;
        this.tipus = tipus;
        this.fenyero = fenyero;
    }

    public void felkapcsol() {
        if (!vilagit) {
            vilagit = true;
            System.out.println("Felkapcsoltad a lámpa.");
        } else {
            System.out.println("A lámpa már fel van kapcsolva!");
        }
    }

    public void lekapcsol() {
        if (vilagit) {
            vilagit = false;
            System.out.println("Lekapcsolatad a lámpát.");
        } else {
            System.out.println("A lámpa már le van kapcsolva!");
        }
    }

}
