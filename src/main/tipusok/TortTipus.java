package main.tipusok;

public class TortTipus {

    public static void main(String[] args) {

        //***** Tört számok ******

        //32 bit
        float floatTortSzamMax = Float.MAX_VALUE;
        System.out.println("Float maximum érteke: " + floatTortSzamMax);

        float floatTortSzamMin = Float.MIN_VALUE;
        System.out.println("Float minimum érteke: " + floatTortSzamMin);

        //64 bit        
        double doubleTortSzamMax = Double.MAX_VALUE;
        System.out.println("Double maximum érteke: " + doubleTortSzamMax);

        double doubleTortSzamMin = Double.MIN_VALUE;
        System.out.println("Double minimum érteke: " + doubleTortSzamMin);

        float f = 3.1415F;

        double d = 20D / 21;
        System.out.println("Eredmény: " + d);

        d = 20 / 21D;
        System.out.println("Eredmény: " + d);

        d = 20.0 / 21;
        System.out.println("Eredmény: " + d);

        d = 20 / 21.0;
        System.out.println("Eredmény: " + d);

        d = (double) 20 / 21;
        System.out.println("Eredmény: " + d);

        d = 20 / (double) 21;
        System.out.println("Eredmény: " + d);

        d = (double) 20 / (double) 21;
        System.out.println("Eredmény: " + d);

        /* nem jó megoldás
        d = (double) (20 / 21);
        System.out.println("Eredmény: " + d);
        */

        double a = 23.2;
        int b = 10;

        System.out.println(a/b);



    }

}
