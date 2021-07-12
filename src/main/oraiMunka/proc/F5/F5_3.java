package main.oraiMunka.proc.F5;

public class F5_3 {

    /*
            n = 3

            * * *
            * * *
            * * *
     */

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Kérem adja a négyzet hosszát: ");
//        int hossz=Integer.parseInt(sc.nextLine());
//        System.out.println("Adja meg a kívánt karaktert amivel rajzolunk: ");
//        char karakter=sc.nextLine().charAt(0);

        rajzolNegyszog(7,'*');

        System.out.println();

        rajzolTeglalap(7,2,'O');



    }

    public static void rajzolTeglalap(int hossz, int magassag, char karakter) {
        for (int i = 0; i < magassag; i++) {
            for (int j = 0; j < hossz; j++) {
                System.out.print(karakter+"  ");
            }

            System.out.println();
        }

    }

    public static void rajzolNegyszog(int hossz,char karakter){
        for (int i = 0; i < hossz; i++) {
            for (int j = 0; j < hossz; j++) {
                System.out.print(karakter+"  ");
            }

            System.out.println();
        }

    }
}
