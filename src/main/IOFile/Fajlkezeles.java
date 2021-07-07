package main.IOFile;

import java.io.File;
import java.io.IOException;

public class Fajlkezeles {

    public static void main(String[] args) throws IOException {

        File file = new File("src\\source\\testFile2.txt");

        if (file.createNewFile()) {
            System.out.println("Fájl sikeresen létrehozva...");
        } else {
            System.out.println("HIBA TÖRTÉNT A FÁJL LÉTREHOZÁSAKOR...");
        }

        /*
        File sourceMappa = new File("src\\source");

        String[] fajlok =  sourceMappa.list();
        for (int i = 0; i < fajlok.length; i++) {
            System.out.println(fajlok[i]);
        }
        */

        System.out.println("A fálj olvasható: "+file.canRead());
        System.out.println("A fálj írható: "+file.canWrite());

        new File("src\\source\\ujMappa").mkdir();


        for (String fileName: new File("src\\source").list()) {
            System.out.println(fileName);
        }

        System.out.println(file.length() + " bytes");


/*
        file.canRead(); //visszaadja, hogy olvasható-e a fájl.
        file.canWrite(); //visszaadja, hogy írható-e a fájl.
        file.createNewFile(); //létre hozzuk üresen ezt a fájlt.
        file.delete(); //töröljük a fájlt.
        file.exists(); //megnézi, hogy létezik-e az adott fájl.
        file.getName(); //visszaadja a fájl nevét.
        file.getAbsolutePath(); //abszoloút útvonallal tér vissza.
        file.length(); //a fájl mérete
        file.list(); //egy String tömböt, ami a benne lévő fájlok nevét.
        file.mkdir() //létrehoz az adott útvonal mappát
*/






    }
}
