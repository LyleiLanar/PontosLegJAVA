import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        java.awt.Toolkit.getDefaultToolkit().beep();
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg hány tétel szerepel a blokkon!");
        int tetelszam = Integer.parseInt(sc.nextLine());

        String[] aruNev = new String[tetelszam];
        int[] egysegar2 = new int[tetelszam];
        int[] darabszam2 = new int[tetelszam];

        for (int i = 0; i < tetelszam; i++) {
            System.out.println(" ");
            System.out.println("******************************************************- ");

            System.out.println("Kérem adja meg a következő tétel nevét");
            aruNev[i] = sc.nextLine();

            System.out.println("Kérem adja meg a darab árat!");
            egysegar2[i] = Integer.parseInt(sc.nextLine());

            System.out.println("Kérem adja meg a darabszámot");
            darabszam2[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < tetelszam; i++) {
            System.out.println("A(z) " + aruNev[i] + " termékből " + egysegar2[i] + " HUF/DB " + darabszam2[i] + " db az " + egysegar2[i] * darabszam2[i] + " HUF összesen.");
        }

    }




    public static boolean isLeapYear(int year) {


        if (year >= 1 && year <= 9999) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                    }
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }

        }
        return false;

    }
}
