package main.oop.orokles;

public class Allat {

    private String nem;
    private int tomeg;
    private int magassag;
    private int maxSebesseg;

    public Allat(String nem, int tomeg, int magassag, int maxSebesseg) {
        this.nem = nem;
        this.tomeg = tomeg;
        this.magassag = magassag;
        this.maxSebesseg = maxSebesseg;
    }

    public Allat() {
        //some code
        //random generált állat
    }

    public String getNem() {
        return nem;
    }

    public int getTomeg() {
        return tomeg;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }


    public void eszik() {
        System.out.println("ÁLLAT eszik");
    }

    public void mozog() {
        System.out.println("ÁLLAT mozog");
    }

    public Noveny asdfhj() {
        return new Noveny();
    }

}
