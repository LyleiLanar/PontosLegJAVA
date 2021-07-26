package main.oraiMunka.oop.kompozicio;

import main.enums.Color;
import main.enums.anyagok.NyilaszaroAnyag;

public class NyilasZaro {

    private NyilaszaroAnyag anyag;
    private Color szin;
    private boolean uvegezett;
    private boolean nyitva;

    private double szelesseg;
    private double magassag;

    public NyilasZaro(NyilaszaroAnyag anyag,Color szin, boolean uvegezett, boolean nyitva, double szelesseg, double magassag) {
        this.anyag = anyag;
        this.szin = szin;
        this.uvegezett = uvegezett;
        this.nyitva = nyitva;
        this.szelesseg = szelesseg;
        this.magassag = magassag;
    }

    public Color getSzin() {
        return szin;
    }

    public NyilaszaroAnyag getAnyag() {
        return anyag;
    }

    public boolean isUvegezett() {
        return uvegezett;
    }

    public boolean isNyitva() {
        return nyitva;
    }

    public double getSzelesseg() {
        return szelesseg;
    }

    public double getMagassag() {
        return magassag;
    }

    public void kinyit() {
        if (nyitva) {
            System.out.println("Az "+this.getClass().getSimpleName().toLowerCase()+" már nyitva van.");
        } else {
            nyitva=true;
            System.out.println("Az "+this.getClass().getSimpleName().toLowerCase()+" sikeresen kinyílt.");
        }
    }

    public void becsuk(){
        if(!nyitva){
            System.out.println("Az "+this.getClass().getSimpleName().toLowerCase()+" már zárva van.");
        } else {
            nyitva=false;
            System.out.println("Az "+this.getClass().getSimpleName().toLowerCase()+" sikeresen bezáródott.");
        }
    }

}
