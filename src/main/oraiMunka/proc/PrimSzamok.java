package main.oraiMunka.proc;

public class PrimSzamok {

    /*
            felső határ -> fh
            alsó határ -> ah
            eközött a két érték között meg kell keresni az összes primszámot, és ki kell írni a felhasználónak.


            végig kell mennni az összes intervallumon belüli számon. fh-ah

            i. szam
            2, 3, ... i/2

            ha i != 2;
            i/3, i/5, i/7, i/9... i/(i/2)
            (i%3 != 0) .... (i%(i/2) != 0)

            for (...){

                while(...){
                eldönti, hogy a soron követkető eleme, hogy prím-e.
                }

            }


            metódus eldönti, hogy EGY szám az prím-e.

            for ciklusnál csak meg kell hívni az aktuális számra ezt a metódust.

     */

    public static void main(String[] args) {

        kiirPrimszamok(8,234);


    }

    public static boolean primSzamE(int szam) {

        if (szam == 0 || szam == 1) {
            return false;
        }

//        if (szam == 2) {
//            return true;
//        }

        // 1. iteráció: szam % 3 != 0           1 -> 3
        // 2. iteráció: szam % 5 != 0           2 -> 5
        // 3. iteráció: szam % 7 != 0           3 -> 7
        // 4. iteráció: szam % 9 != 0           4 -> 9
        //.
        //.
        // i. iteráció: szam % (2 * i + 1) != 0 i -> 2i+1
        //.
        //.
        //.
        // n. iteráció: szam % (szam/2) !=0


        int oszto = 2;

        // amíg nem értünk az adott érékkészlet végére és nem találtunk T tulajdonásgú elemet.
        // T tulajdonság: nincs 1-en és önmagán kívül nincs több osztója.

        while ((oszto <= szam / 2) && (szam % oszto != 0)) {
            oszto++;
        }

        return oszto > szam / 2;

    }
    public static void kiirPrimszamok(int ah,int fh){
//        boolean elsoPrim = true;
//
//        for (int i = ah; i <= fh; i++) {
//            if (primSzamE(i)) {
//                if (elsoPrim) {
//                    System.out.print(i);
//                    elsoPrim = false;
//                }
//                else {
//                    System.out.print(", "+i);
//                }
//            }
//        }
//        System.out.println();

        int db=0;
        for (int i = ah; i <= fh; i++) {
            if (primSzamE(i)) {
                db++;
                System.out.print(i + ", ");
                if(db%10==0){
                    System.out.println();
                }
            }
        }
        System.out.print("\b\b.");

    }


}
