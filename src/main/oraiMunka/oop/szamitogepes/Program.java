package main.oraiMunka.oop.szamitogepes;

import java.util.Random;

public class Program {

    public static void main(String[] args) {


    /* A main metódusban hozz létre két számítógépet a fenti konstruktorokkal. Mindkét gép
            kikapcsolt állapotban kezdjen. Az alapértelmezett gépet kapcsold be, és másold rá először
            800 MB, aztán 400 MB programot. A másik gépre másolj 1 MB programot. A
            másolások eredményeit írd ki.
        • Mindkét objektumot írd ki szövegesen.*/

        Random rnd = new Random();

        Szamitogep dellNotebook1 = new Szamitogep();
        Szamitogep dellNotebook2 = new Szamitogep(1024, false);

        Szamitogep[] szamitogepek = new Szamitogep[10];

        for (int i = 0; i < szamitogepek.length; i++) {
            szamitogepek[i] = new Szamitogep();
        }

        for (int i = 0; i < szamitogepek.length; i++) {
            szamitogepek[i].kapcsol();
        }

        for (int i = 0; i < szamitogepek.length; i++) {
            System.out.println(szamitogepek[i].programMasol(rnd.nextInt(1000))?"A program másolása sikeres.":"A program másolása sikertelen.");
        }

        for (int i = 0; i < szamitogepek.length; i++) {
            System.out.println(szamitogepek[i].toString());
        }

        System.out.println(szamitogepek[0].programMasol(1000)?"A program másolása sikeres.":"A program másolása sikertelen.");


        dellNotebook1.kapcsol();

        if (dellNotebook1.programMasol(800)) {
            System.out.println("A program másolása sikeres.");
        } else {
            System.out.println(" A program másolása sikertelen.");
        }

        System.out.println(dellNotebook1.programMasol(400)?"A program másolása sikeres.":"A program másolása sikertelen.");


        if (dellNotebook2.programMasol(1)){
            System.out.println("A program másolása sikeres.");
        } else{
            System.out.println("A program másolása sikertelen.");
        }

        System.out.println(dellNotebook1.toString());
        System.out.println(dellNotebook2.toString());


    }


}
