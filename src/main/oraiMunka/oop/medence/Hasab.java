package main.oraiMunka.oop.medence;

public class Hasab extends Teglalap {

    private double magassag;

    public Hasab(double hossz, double szelesseg, double magassag) {
        super(hossz, szelesseg);
        if (magassag < 0) {
            magassag = 0;
        }
        this.magassag = magassag;
    }

    public double getTerfogat() {
        return getAlapTerulet() * magassag;
    }

    @Override
    public String toString() {
        String osStr = super.toString();
        osStr = osStr.split("<")[1];
        osStr += "\b";
        osStr = osStr.trim();

        return "Hasáb<" + osStr + ",magasság=" + magassag + ",térfogat=" + getTerfogat() + ">";
    }
}
