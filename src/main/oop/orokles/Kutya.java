package main.oop.orokles;

public class Kutya extends Allat {

    private int labak;
    private String bunda;

    public Kutya(String nem, int tomeg, int magassag, int maxSebesseg, String bunda, int labak) {
        super(nem, tomeg, magassag, maxSebesseg);
        this.bunda = bunda;
        this.labak = labak;
    }

    public Kutya(String nem, int tomeg, int magassag, String bunda) {
        this(nem, tomeg, magassag, 10, bunda, 4);
    }

    public Kutya() {
        //some code
        //random generált kutya
    }

    public int getLabak() {
        return labak;
    }

    public String getBunda() {
        return bunda;
    }

    private void rag() {
        System.out.println("Nyamm Nyamm");
    }

    @Override
    public void eszik() {
        rag();
        super.eszik();
    }

    public void ugat() {
        System.out.println("Vau!");
    }

    //overloading
    public boolean ugat(int db) {
        for (int i = 0; i < db; i++) {
            System.out.print("Vau! ");
        }
        System.out.println();
        return true;
    }

    public void setal() {
        System.out.println("KUTYA sétál"); //some code
        super.mozog(); //közvetlenül az ős kerül meghívásra, HIBA LEHETŐSÉG
    }

    public void fut() {
        System.out.println("KUTYA fut"); //some code
        this.mozog(); //az override-olt metódus kerül hívásra.
    }

    @Override
    public void mozog() {
        System.out.println("KUTYA mozog: Teszi a lábát ide-oda...");
        super.mozog();
    }

    @Override
    public Kokeny asdfhj() {
        return new Kokeny();
    }
}

//A Kutya az egy Állat

