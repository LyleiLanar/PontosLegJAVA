package Utasítások;

public class Switch {

    /*
    switch(valtozo){

        case <eset1>:
            parancs1;
            parancs2;
            break;

        case <eset2>:
            parancs1;
            parancs2;
            break;

            .
            .
            .
        default:
            parancs1;
            parancs2;
            break;

    }
     */


    public static void main(String[] args) {

        int erdemjegy = 6;

        /*
         1: elégtelen
         2: elégséges
         3: közepes
         4: jó
         5: jeles
         */


        //iffel
        if (erdemjegy == 1) {
            System.out.println("elégtelen");
        } else if (erdemjegy == 2) {
            System.out.println("elégséges");
        } else if (erdemjegy == 3) {
            System.out.println("közepes");
        } else if (erdemjegy == 4) {
            System.out.println("jó");
        } else if (erdemjegy == 5) {
            System.out.println("Jeles");
        } else {
            System.out.println("Nincs ilyen érdemjegy!");
        }

        //switch
        switch (erdemjegy) {

            case 1:
                System.out.println("elégtelen");
                break;

            case 2:
                System.out.println("elégséges");
                break;

            case 3:
                System.out.println("közepes");
                break;

            case 4:
                System.out.println("jó");
                break;

            case 5:
                System.out.println("jeles");
                break;

            default:
                System.out.println("Nincs ilyen érdemjegy!");
                break;
        }

        int homerseklet = 30;

    }
}
