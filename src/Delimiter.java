import java.util.Scanner;
public class Delimiter {

    public static void main(String[] args) {

        /*
        2 db tetszőleges időpont: óra, perc, másodperc
        különbségek kiszámítása másodpercben
        kiíratás
        NINCS kész - PercA - t elkezdi nem érteni
         */
        Scanner sc = new Scanner(System.in);
        int percA, percB, mpA, mpB, oraA, oraB;

        System.out.println("Add meg az első időponthoz tartozó óra értéket:");
        oraA = Integer.parseInt(sc.nextLine());
        if ((oraA < 0) || (oraA >= 24)) {
            System.out.println("Nem okés az óra érték");
            oraA = 0;
        }

        System.out.println("Add meg az első időponthoz tartozó perc értéket:");
        percA = Integer.parseInt(sc.nextLine());
        if ((percA < 0) || (percA > 59)) {
            System.out.println("Nem okés a perc érték");
            percA = 0;
        }

        System.out.println("Add meg az első időponthoz tartozó másodperc értéket:");
        mpA = Integer.parseInt(sc.nextLine());
        if ((mpA < 0) || (mpA > 59)) {
            System.out.println("Nem okés a másodperc érték");
            mpA = 0;
        }

        System.out.println("Add meg a második időponthoz tartozó óra értéket:");
        oraB = Integer.parseInt(sc.nextLine());
        if ((oraB < 0) || (oraB >= 24)) {
            System.out.println("Nem okés az óra érték");
            oraB = 0;
        }

        System.out.println("Add meg a második időponthoz tartozó perc értéket:");
        percB = Integer.parseInt(sc.nextLine());
        if ((percB < 0) || (percB > 59)) {
            System.out.println("Nem okés a perc érték");
            percB = 0;
        }

        System.out.println("Add meg az első időponthoz tartozó másodperc értéket:");
        mpB = Integer.parseInt(sc.nextLine());
        if ((mpB < 0) || (mpB > 59)) {
            System.out.println("Nem okés a másodperc érték");
            mpB = 0;
        }



        long sumMp = ((oraA * 3600) + (percA * 60) + mpA) - ((oraB * 3600) + (percB * 60) +mpB);
        System.out.println( "A másodpercekben kifejezett különbség: " + sumMp);
    }


}

