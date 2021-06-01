package Típusok;

public class EgeszTipus {
    public static void main(String[] args) {

        //deklaráció
        int valtozoSzam;

        //System.out.println("valtozoszam alapertek: "+valtozoSzam);

        //inicializáció
        valtozoSzam = 34;

        //***** Egész számok ******
        //1 bájt
        //|1111 1111| = 255
        byte byteMaxErtek = Byte.MAX_VALUE;
        System.out.println("Byte maximum érteke: " + byteMaxErtek);

        byte byteMinErtek = Byte.MIN_VALUE;
        System.out.println("Byte maximum érteke: " + byteMinErtek);

        //2 bájt
        //|1111 1111|1111 1111| = 65 535
        short shortMaxErtek = Short.MAX_VALUE;
        System.out.println("Short maximum érteke: " + shortMaxErtek);

        short shortMinErtek = Short.MIN_VALUE;
        System.out.println("Short maximum érteke: " + shortMinErtek);

        //32 bit : 4 bájt
        //|1111 1111|1111 1111|1111 1111|1111 1111| = 4 294 967 295
        int intMaxErtek = Integer.MAX_VALUE;
        System.out.println("Integer maximum érteke: " + intMaxErtek);

        int intMinErtek = Integer.MIN_VALUE;
        System.out.println("Integer minimum érteke: " + intMinErtek);

        //64 bit : 8 bájt
        //|1111 1111|1111 1111|1111 1111|1111 1111|1111 1111|1111 1111|1111 1111|1111 1111| = 18 446 744 073 709 551 615
        long longMaxErtek = Long.MAX_VALUE;
        System.out.println("Long maximum érteke: " + longMaxErtek);

        long longMinErtek = Long.MIN_VALUE;
        System.out.println("Long minimum érteke: " + longMinErtek);

        byte myByte = 127;
        short myShort = 32_767;
        int myInt = 2_147_483_647;
        long myLong = 9_223_372_036_854_775_807L;

        //+,-,*,/

        int osszeg = 12 / 6;
        System.out.println("Eredmeny: " + osszeg);

        byte newByte = (byte) (myByte * 2);
        //maxByte:                   |1111 1111|

        short newShort = (short) (myShort / 2);
        short veryNewShort = (short) (myShort / newShort);

        System.out.println("Max bájt érték fele: " + newByte);

        /*
            1. byte vmilyen értékkel
            2. short vmilyen értékkel
            3. int vmilyen értékkel

            4. long = 50_000 + 10 * byte + short + integer
            5. kiírás: long értékét.

            4. short = 100 + 10 * byte + short + integer
            5. kiírás: short értékét.
         */
    }
}
