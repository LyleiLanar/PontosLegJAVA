package main.oraiMunka.oop.medence;

public class Teglalap{

    private double hossz;
    private double szelesseg;

    public Teglalap(double hossz, double szelesseg){
        if (hossz < 0) {
            hossz = 0;
        }
        if (szelesseg < 0) {
            szelesseg = 0;
        }
        this.hossz=hossz;
        this.szelesseg=szelesseg;

    }

    public double getHossz() {
        return hossz;
    }

    public double getSzelesseg() {
        return szelesseg;
    }

    public double getAlapTerulet(){
        return hossz*szelesseg;
    }

    @Override
    public String toString() {
       // return super.toString();
       return "Teglalap<hossz=" + hossz +",szelesseg=" + szelesseg +">";
    }
}
