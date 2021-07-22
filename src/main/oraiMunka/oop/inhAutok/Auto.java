package main.oraiMunka.oop.inhAutok;

public class Auto extends Jarmu {
    private int kerekek;
    private int ajtok;
    private boolean manualis;
    private int fokozatok; //a sebességek száma

    private int aktFokozat; //az aktuális beváltott fokozat, -1: hátramenet 0: üres 1: 1 ... 6: 6.


    public Auto(int tomeg, String nev, int maxSebesseg, int ajtok, boolean manualis, int fokozatok) {
        super(tomeg, nev, maxSebesseg);
        System.out.println("<AUTO> készítése");
        this.kerekek = 4;
        this.ajtok = ajtok;
        this.manualis = manualis;
        this.fokozatok = fokozatok;
        this.aktFokozat = 0;
    }

    //region getterek
    public int getKerekek() {
        return kerekek;
    }

    public int getAjtok() {
        return ajtok;
    }

    public boolean isManualis() {
        return manualis;
    }

    public int getFokozatok() {
        return fokozatok;
    }

    public int getAktFokozat() {
        return aktFokozat;
    }
    //endregion

    public void sebessegValtas() {

    }

    public void felValtas() {
        if (aktFokozat < fokozatok) {

            this.aktFokozat++;
        }
    }

    public void leValtas() {
        if (aktFokozat > 0) {

            this.aktFokozat--;
        }
    }

    public void uresbeRak() {
        this.aktFokozat = 0;
    }

    public void hatramenetbeRak() {
        if (aktFokozat == 0 && getPilSebesseg() == 0) {
            aktFokozat = -1;
        }
    }

    @Override
    public void kormanyoz(int iranyMod) {
        if (getPilSebesseg() > 0) {
            super.kormanyoz(iranyMod);
        }
    }
}
