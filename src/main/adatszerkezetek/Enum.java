package main.adatszerkezetek;

enum Nap {
    HETFO, KEDD, SZERDA, CSUTORTOK, PENTEK, SZOMBAT, VASARNAP
}

public class Enum {

    public static void main(String[] args) {

        Nap nap = Nap.SZOMBAT;

      //  mennyireSzeretemEztANapot(nap);


        for (Nap ertek: Nap.values()) {
            System.out.print(ertek + ": ");
            mennyireSzeretemEztANapot(ertek);
        }
    }

    public static void mennyireSzeretemEztANapot(Nap nap){

        switch (nap){

            case HETFO:
            case KEDD:
            case SZERDA:
            case CSUTORTOK:
                System.out.println("Fúj már megint dolgozni kell!");
                break;
            case PENTEK:
                System.out.println("Fúj már megint dolgozni kell, de legalább holnap már nem!");
                break;
            case SZOMBAT:
                System.out.println("Nah végre nem kell dolgozni!");
                break;
            case VASARNAP:
                System.out.println("Fúj holnap már megint dolgozni kell!");
                break;
            default:
                System.out.println("Hiba! Nincs ilyen nap!");
                break;
        }


    }


}
