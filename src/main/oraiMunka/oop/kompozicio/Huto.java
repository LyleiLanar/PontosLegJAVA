package main.oraiMunka.oop.kompozicio;

import main.enums.EnergiaOsztaly;

public class Huto {

    private int aktHomerseklet;
    private int minHomerseklet;
    private int maxHomerseklet;
    private boolean hutE;

    private EnergiaOsztaly energiaOsztaly;

    private int magassag;
    private int szelesseg;
    private int melyseg;

    public Huto(int aktHomerseklet, boolean hut, EnergiaOsztaly energiaOsztaly, int magassag, int szelesseg, int melyseg) {
        this.aktHomerseklet = aktHomerseklet;
        this.minHomerseklet = 3;
        this.maxHomerseklet = 8;
        this.hutE = hut;
        this.energiaOsztaly = energiaOsztaly;
        this.magassag = magassag;
        this.szelesseg = szelesseg;
        this.melyseg = melyseg;
    }

    //region getterek

    public int getAktHomerseklet() {
        return aktHomerseklet;
    }

    public int getMinHomerseklet() {
        return minHomerseklet;
    }

    public int getMaxHomerseklet() {
        return maxHomerseklet;
    }

    public boolean isHutE() {
        return hutE;
    }

    public EnergiaOsztaly getEnergiaOsztaly() {
        return energiaOsztaly;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getSzelesseg() {
        return szelesseg;
    }

    public int getMelyseg() {
        return melyseg;
    }

    //endregion


    public void hut() {

        if (hutE) {
            aktHomerseklet--;


            if (aktHomerseklet <= minHomerseklet) {
                hutE = false;
                System.out.println("*** A hűtő kikapcsol ***");
            }

        } else {
            if (aktHomerseklet < 24) {
                aktHomerseklet++;
            }
            if (aktHomerseklet >= maxHomerseklet) {
                hutE = true;
                System.out.println("*** A hűtő bekapcsol ***");
            }
        }

        System.out.println("A hűtő " + aktHomerseklet + "C°-os.");

    }


}
