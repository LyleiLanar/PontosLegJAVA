package Utasítások;

import javax.sound.midi.Soundbank;

public class If {

    public static void main(String[] args) {

        /*
        Vezérlési szerkezetek:

            - Szekvencia: Az utasítások azok sorban követik egymást.
            - Szelekció: Elágazások a vezérlésben, amik feltételhez vannak kötve.
            - Iteráció (Ciklus): Valamilyen feltétel hatására egy adott kódblokk többször is lefut.

         SZELEKCIÓ:

         boolean isAGirl = true;

         if (isAGirl == true) System.out.println("Ez bezony egy jány!");

        Logikai operátorok
    ********************************
            ==: egyenlő-e? (a == b) true/false
            >:  nagyobb-e? (a > b)
            <:  kisebb-e?  (a < b)
            >=: nagyobb vagy egyenlő: (a >= b)
            <=: kisebb vagy egyenlő: (a <= b)

            !=: nem egyenlő (a != b)

            x && y: 'és' operátor logikai értékekkel. Csak akkor lesz true, ha x 'és' y is true.
            x || y: 'vagy' operátor lokikai értékekkel. Akkor lesz true, ha x 'vagy' y true.

            int a = 2;
            int b = 3;

            a == b -> false
            a > b  -> false
            a < b  -> true
            a >= b -> false
            a <= b -> true
            a != b -> true

          !(a < b) -> false

            boolean x = true;
            boolean y = true;

            (x && y) : true
            (x || y) : true

            x = F;
            y = F;

    ********************************
         */

        //egy embernek a paraméter

        boolean isAGirl = false;
        int magassag = 160;     // cm
        double suly = 451.5;    // N
        byte labmeret = 41;     //hu
        String szemSzin = "kék";
        char kezdoBetu = 'D';


        System.out.println("If statement:");
        if (isAGirl == true) {
            System.out.println("Ez bezony egy jány!");
            System.out.println("Hosszú haja van, mert lány!");
        }
        System.out.println();

        /*
         ********************************
         IF ELSE

          boolean isAGirl = true;

          if (isAGirl) {

            System.out.println("Ez bezony egy jány!");

          } else {

            System.out.println("Ez bezony NEM jány!");

          }


         */

        System.out.println("If-else statement: ");
        if (isAGirl) {
            System.out.println("Ez bezony egy jány!");
        } else {
            System.out.println("Ez bezony NEM jány!");
        }




    }
}
