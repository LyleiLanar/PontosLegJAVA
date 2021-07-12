package main.oop;

import java.util.Random;

public class Ember {

    public static int korhatar = 18;

    //region adattagok
    private String nem; //"nő", "férfi"
    private String nev;
    private int kor;
    private int tomeg;
    private int magassag;
    private boolean ehesE;
    private boolean szomjasE;
    //endregion

    //region konstruktorok
    public Ember() {

        this("Nem ismert","Nem ismert",0,0,0,false,false);
        System.out.println("Paraméter nélküli konstruktor KÉSZ!");

    }

    public Ember(String nem, String nev, int kor, int tomeg, int magassag, boolean ehesE, boolean szomjasE){
        setNem(nem);
        setNev(nev);
        setKor(kor);
        setTomeg(tomeg);
        setMagassag(magassag);
        setEhesE(ehesE);
        setSzomjasE(szomjasE);
        System.out.println("Paraméteres konstruktor KÉSZ!");
    }
    //endregion

    //region getterek, setterek


    public String getNem() {
        return nem;
    }

    public void setNem(String nem) {
        this.nem = nem;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        if (kor < this.kor) {
            System.out.println("Nem lehet kisebb, mint az aktuális kor.");
        } else {
            //int kor = 0;
            this.kor = kor;
        }
    }

    public int getTomeg() {
        return tomeg;
    }

    public void setTomeg(int tomeg) {
        this.tomeg = tomeg + 1;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public boolean isEhesE() {
        return ehesE;
    }

    public void setEhesE(boolean ehesE) {
        this.ehesE = ehesE;
    }

    public boolean isSzomjasE() {
        return szomjasE;
    }

    public void setSzomjasE(boolean szomjasE) {
        this.szomjasE = szomjasE;
    }

    //endregion

    //region metódusok

    public void eszik() {

    }

    public void iszik() {
        //some code
    }

    public void oregszik() {
        kor++;
        if (kor >= korhatar) {
            System.out.println(nev + " nagykorú.");
        }
    }

    public void setal() {
        //some code
    }

    public void szeret() {
        //some code
    }

    public void koszon() {
        System.out.println(generalKoszones()+"!");
    }

    public void bemutatkozik(){

        System.out.println(generalKoszones()+ ", " + nev + " vagyok!");
    }
    //endregion

    private static String generalKoszones(){
        Random rnd = new Random();

        String[] koszonesek = {"Helló", "Szia", "Jónapot", "Adjisten"};

        return koszonesek[rnd.nextInt(koszonesek.length)];

    }

}
