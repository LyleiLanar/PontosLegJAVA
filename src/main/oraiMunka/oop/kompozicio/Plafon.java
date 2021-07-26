package main.oraiMunka.oop.kompozicio;

import main.enums.anyagok.EpitoAnyag;

public class Plafon {

    private EpitoAnyag epitoAnyag;
    private Lampa csillar;

    public Plafon(EpitoAnyag epitoAnyag, Lampa csillar) {
        this.epitoAnyag = epitoAnyag;
        this.csillar = csillar;
    }

    public EpitoAnyag getEpitoAnyag() {
        return epitoAnyag;
    }

    public Lampa getCsillar() {
        return csillar;
    }
}
