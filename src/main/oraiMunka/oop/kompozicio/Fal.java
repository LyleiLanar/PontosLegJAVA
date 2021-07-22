package main.oraiMunka.oop.kompozicio;

import main.enums.Color;
import main.enums.anyagok.EpitoAnyag;

public class Fal {

    private EpitoAnyag epitoAnyag;
    private Color szin;
    private Ajto ajto;
    private Ablak ablak;

    public Fal(EpitoAnyag epitoAnyag, Color szin, Ajto ajto, Ablak ablak) {
        this.epitoAnyag = epitoAnyag;
        this.szin = szin;
        this.ajto = ajto;
        this.ablak = ablak;
    }

    public Fal(EpitoAnyag epitoAnyag, Color szin){
        this(epitoAnyag,szin,null,null);
    }
    public Fal(EpitoAnyag epitoAnyag,Color szin,Ajto ajto){
        this(epitoAnyag,szin,ajto,null);
    }
    public Fal(EpitoAnyag epitoAnyag,Color szin,Ablak ablak){
        this(epitoAnyag,szin,null,ablak);
    }



}
