package main.oraiMunka.oop.kompozicio;

import main.enums.anyagok.EpitoAnyag;
import main.enums.anyagok.PadloBurkoloAnyag;

public class Padlo {

    private EpitoAnyag epitoAnyag;
    private PadloBurkoloAnyag burkoloAnyag;

    public Padlo(EpitoAnyag epitoAnyag, PadloBurkoloAnyag burkoloAnyag) {
        this.epitoAnyag = epitoAnyag;
        this.burkoloAnyag = burkoloAnyag;
    }

    public EpitoAnyag getEpitoAnyag() {
        return epitoAnyag;
    }

    public PadloBurkoloAnyag getBurkoloAnyag() {
        return burkoloAnyag;
    }
}
