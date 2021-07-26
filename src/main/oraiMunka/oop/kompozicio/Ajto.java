package main.oraiMunka.oop.kompozicio;

import main.enums.Color;
import main.enums.anyagok.NyilaszaroAnyag;

import java.util.Scanner;

public class Ajto extends NyilasZaro {

    private boolean kulcsraZarva;
    private String kulcs;
    private Scanner sc = new Scanner(System.in);

    public Ajto(NyilaszaroAnyag anyag, Color szin, boolean uvegezett, boolean nyitva, double szelesseg, double magassag) {
        super(anyag, szin, uvegezett, nyitva, szelesseg, magassag);
        this.kulcsraZarva = false;
        //setKulcs();
        this.kulcs="1234";
    }


    public boolean isKulcsraZarva() {
        return kulcsraZarva;
    }

    private void setKulcs(){
        System.out.print("Kérlek add meg a kódot az ajtóhoz: ");
        String kulcs = sc.nextLine();
        this.kulcs = kulcs;
    }

    public void bekulcsol() {
        if (kulcsraZarva) {
            System.out.println("Az ajtó már zárva van!");
        } else if (isNyitva()) {
            System.out.println("Csukd be az ajtót!");
        } else if (bekerKulcs().equals(kulcs)) {
            kulcsraZarva = true;
            System.out.println("Klikk! Az ajtó BE lett kulcsolva.");
        } else {
            System.out.println("Nem megfelelő a kód!");
        }
    }

    public void kikulcsol() {
        if (!kulcsraZarva) {
            System.out.println("Az ajtó nyitva van, előbb csukd be!");
        } else if (bekerKulcs().equals(kulcs)) {
            kulcsraZarva = false;
            System.out.println("Klikk! Az ajtó KI lett kulcsolva.");
        } else {
            System.out.println("Nem megfelelő a kód!");
        }
    }

    @Override
    public void kinyit() {
        if (!kulcsraZarva) {
            super.kinyit();
        } else {
            System.out.println("Az ajtó kulcsra van zárva. Szükséged lesz egy kulcsra.");
        }
    }

    private String bekerKulcs() {
        System.out.print("Add meg a kódot: ");
        String kod = sc.nextLine();
        return kod;
    }


}
