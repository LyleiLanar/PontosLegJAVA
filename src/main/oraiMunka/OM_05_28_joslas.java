package main.oraiMunka;

import java.util.Scanner;

public class OM_05_28_joslas {

    /*
        Készítsen konzolos alkalmazást, amely
        mezőgazdasági jóslást végez. A program kérje be az elvetett búza mennyiségét tonnában.
        Ez alapján számolja ki egy véletlenszerűen generált szorzóval (5-15) a várható hozamot,
        és írja ki a mennyiségét. A szorzó alapján elemezze és írja ki, hogy milyen év várható:
        átlag alatti (5-8), átlagos év (9-12), átlag feletti (13-15).

        Vili    - double bekerBuza()                                               -> Megkéri a felhasználót, hogy adjon be egy számot.
        Juli    - int josolHozam()                                                 -> Véletlenszerűen jósol 5-15 között.
        Zsófi   - double szamolHozam(int josoltHozam, double buzaMennyiseg)
        Magdi   - String elemezEv(int josoltHozam)
        Patrik  - void kiirOsszegzes(String evElemzes, double szamoltHozam)

        (paraméter) -> |metódus| -> visszérték

     */

    public static void main(String[] args) {

        //        double buzaMennyiseg = bekerBuza();
//
//        int josoltHozam = josolHozam();
//        double hozam = szamolHozam(josoltHozam,buzaMennyiseg);
//        String elemzes =elemzesEv(josoltHozam);
//
//        kiirOsszegzes(elemzes,hozam);

        mezogazdasagiJoslas();
    }

    public static void mezogazdasagiJoslas() {
        int josoltHozam = josolHozam();
        kiirOsszegzes(elemzesEv(josoltHozam), szamolHozam(josoltHozam, bekerBuza()));
    }

    // *** Vili ***
    public static double bekerBuza() {

        System.out.println("Kérem adja meg,hány tonna búzamagot ültetett?");
        Scanner sc = new Scanner(System.in);
        double ultetettBuza = Double.parseDouble(sc.nextLine());

        return ultetettBuza;
    }

    // *** Juli ***
    public static int josolHozam() {
        int josolSzam = (int) (Math.random() * 11) + 5;
        return josolSzam;
    }

    // *** Zsófi ***
    static public double szamolHozam(int josoltHozam, double buzaMennyiseg) {
        double szamoltHozam = josoltHozam * buzaMennyiseg;
        return szamoltHozam;
    }

    // *** Magdi ***
    public static String elemzesEv(int josoltHozam) {

        if (josoltHozam < 8) {
            return "átlag alatti";
        } else if (josoltHozam < 12) {
            return "átlagos";
        }

        return "átlag feletti";

    }

    // *** Patrik ***
    public static void kiirOsszegzes(String evElemzes, double szamoltHozam) {

        System.out.println("Ez az év várhatóan " + evElemzes + " lesz. A várható hozam pedig " + szamoltHozam + " tonna.");

    }


}
