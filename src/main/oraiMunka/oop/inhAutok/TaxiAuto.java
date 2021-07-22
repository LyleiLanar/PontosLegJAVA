package main.oraiMunka.oop.inhAutok;

public class TaxiAuto extends Auto {

    private boolean szallitUtast;
    private int taxiOra;


    public TaxiAuto(int tomeg, String nev, int maxSebesseg, int ajtok, boolean manualis, int fokozatok) {
        super(tomeg, nev, maxSebesseg, ajtok, manualis, fokozatok);
        this.szallitUtast = false;
        this.taxiOra = 0;

    }

    public void felveszUtas(){
        //some code
        szallitUtast = true;
        taxiOra = 0;
        this.kormanyoz(20);
    }

    public void telikAzIdo(){
        //some code
        taxiOra++;
    }

    public void leteszUtas(){

        //some code
        System.out.println(taxiOra + "percig tartott az utazás. Az alapján fizess!");
        szallitUtast =false;
    }

}
