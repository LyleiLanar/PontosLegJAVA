package main.oraiMunka.F4;

public class F4_4 {

    /*
        4 3 2 1
        4 3 2
        4 3
        4
     */


    public static void main(String[] args) {
        piramisKiirasEcceru();
        System.out.println();
        piramisKiirasCiklussal(16,8,14);
    }

    public static void piramisKiirasEcceru() {
        System.out.println("4 3 2 1\n4 3 2\n4 3\n4");

    }

    public static void piramisKiirasCiklussal(int meret, int min, int max) {

        for (int i = min; i <= max; i++) {

            for (int j = meret; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
