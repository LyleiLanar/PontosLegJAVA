package main.oraiMunka;

public class SzamrendszerValto {

    /*
            csináljunk egy metódust, ami átvált egy 2-es számrendszer beli számot 10-esbe.

     */

    public static void main(String[] args) {

        System.out.println(atvalt2_10(1010101010)); //10

    }

    public static int atvalt2_10(int szam) {
        String szamString = String.valueOf(szam);

        //n = s.length();

        //1010 utolsó karakter s.charAt(3)
        // Melyik számjegy következik:
        // i = 0,   s.charAt(n-1)
        // i = 1,   s.charAt(n-2)
        // i = 2,   s.charAt(n-3)
        // .
        // .
        // .
        // i = i,   s.charAt(n-(i+1))

        //Melyik helyiérték
        //Alap = 2
        //i = 0     kitevő = 0
        //i = 1     kitevő = 1
        // .
        // .
        // .
        // i = i,   kitevő = i

        int osszeg = 0;
        for (int i = 0; i < szamString.length(); i++) {

            int helyiertek = (int) (Math.pow(2, i));
            int szamjegy = szamString.charAt(szamString.length() - (i + 1)) - 48;

            int ertek = helyiertek * szamjegy;
            osszeg = osszeg + ertek;

        }

        return osszeg;
    }


}
