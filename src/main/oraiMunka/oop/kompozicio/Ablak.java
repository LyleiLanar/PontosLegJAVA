package main.oraiMunka.oop.kompozicio;

import main.enums.Color;
import main.enums.anyagok.NyilaszaroAnyag;

public class Ablak extends NyilasZaro {

    private boolean redony;
    private boolean redonyFelhuzva;

    public Ablak(NyilaszaroAnyag anyag, Color szin, boolean nyitva, double szelesseg, double magassag, boolean redony) {
        super(anyag, szin, true, nyitva, szelesseg, magassag);
        this.redony = redony;
        this.redonyFelhuzva = true;
    }

    public void redonyFelhuz() {
        if (redonyFelhuzva) {
            System.out.println("A redőny már fel van húzva!");
        } else if (this.redony) {
            redonyFelhuzva = true;
            System.out.println("Redőny sikeresen felhúzva!");
        } else {
            System.out.println("Vegyél redőnyt!");
        }
    }

    public void redonyLeenged() {
        if (!redonyFelhuzva) {
            System.out.println("A redőny már le van engedve!");
        } else if (this.redony) {
            redonyFelhuzva = false;
            System.out.println("Redőny sikeresen leengedve!");
        } else {
            System.out.println("Vegyél redőnyt!");
        }
    }


}
