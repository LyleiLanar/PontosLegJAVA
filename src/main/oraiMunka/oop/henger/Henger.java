package main.oraiMunka.oop.henger;

public class Henger extends Kor {

    private double magassag;


    public Henger(double radius,double magassag) {
        super(radius);
        if (magassag < 0) {
            magassag = 0;
        }
        this.magassag = magassag;
    }

    public double getMagassag() {
        return magassag;
    }

    public double getTerfogat(){
        return getTerulet()*magassag;
    }
}
