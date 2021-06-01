package Típusok;

public class Operatorok {

    public static void main(String[] args) {



        /*

        Operátorok: Valamilyen műveletet hajtanak végre a hozzájuk tartozó operandusokon.
        Operandus: Valamilyen érték.

    Kétoperandusó matematikai operátorok
    ********************************
        +
        -
        *
        /
        %: maradékképzés

        2 + 3 -> 5 két operandusú operátor:
        2 - 3 -> 1 2op operátor
        2 * 3 -> 6
        2 / 3 -> 0
        2 % 3 -> 2
    ********************************

    Egyoperandusú matematikai operátorok
    ********************************
        ++: megnöveli az operandus értékét 1-gyel.
        --: csökkenteni tudjuk eggyel.

        int a =0;
        a++;
        ++a;
        a--;
        --a;
    ********************************

    Értéknövelő utasítások
    ********************************
        +=
        -=
        *=
        /=
        %=

        int a = 0;
        a += 10;    // a = a + 10; -> a: 10
        a -= 4;     // a = a - 4; -> a: 6
        a /= 2;     // a = a / 2; -> a: 3
        a *= 6;     // a = a * 6; -> a: 18
        a %= 4      // a = a % 4; -> a: 2

    ********************************

        int szam = 0;

        szam = szam + 1;    // szam = 1;
        szam = szam + 1;    // szam  = 2;

        szam++;             // szam = 3;
        ++szam;             // szam = 4;

        szam--;             // szam = 3;
        --szam;             // szam = 2;

        1 + szam++;
        1 + ++szam;
        */

        int szam = 1;

        System.out.println(szam + szam++);
        System.out.println(szam);
        System.out.println();

        szam = 1;
        System.out.println(szam++ + szam);
        System.out.println(szam);
        System.out.println();

        szam = 1;
        System.out.println(szam + ++szam);
        System.out.println(szam);
        System.out.println();

        szam = 1;
        System.out.println(++szam + szam);
        System.out.println(szam);
        System.out.println();

        szam = 2;
        System.out.println("5 :" + (szam++ + ++szam));

        System.out.println("4: " + szam);
        System.out.println();

        int a = 0;

        a += 10;
        System.out.println(a);    // a = a + 10; -> a: 10

        a -= 4;
        System.out.println(a);     // a = a - 4; -> a: 6

        a /= 2;
        System.out.println(a);     // a = a / 2; -> a: 3

        a *= 6;
        System.out.println(a);     // a = a * 6; -> a: 18

        a %= 4;
        System.out.println(a);      // a = a % 4; -> a: 2

        /*

        45 % 11 -> 1
        33 % 4 -> 1
        122 % 2 -> 0
        27 % 5 -> 2

        int a;
        int b;

        .
        .
        .

        parancs(a + b);
        parancs(a - b);
        parancs(a * b);
        parancs(a / b);


        Kifejezés: változók, litrálok, metódus visszatérési értéket és operátorok véges sok kombinációja.

        int kacsa = a + 5 - metódus(a + 5);


        */

    }

}
