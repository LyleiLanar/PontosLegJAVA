package OraiMunka;

public class OM_05_27 {

    static public void main(String[] args) {

        //HelloWorld(12);
        //System.out.println(Oszthato3malE(24253));
        //KiirHarommalOszthato(273543);

//        double bmi = BodyMassIndex(75, 169);
//        System.out.println("Testtömegindex: " + bmi);
//
//        System.out.println("Testtömegindex: " + BodyMassIndex(75, 169));
        System.out.println(bmiEredmeny(bodyMassIndex(75, 169)));
    }

    public static void helloWorld(int hanyszorLegyenKiirva) {

        for (int i = 0; i < hanyszorLegyenKiirva; i++) {

            System.out.println("Hello World!");
        }
    }

    public static boolean oszthato3malE(int vizsgaltSzam) {

        return vizsgaltSzam % 3 == 0;

    }

    public static void kiirHarommalOszthato(int vizsgaltSzam) {
        if (oszthato3malE(vizsgaltSzam)) {
            System.out.println("A " + vizsgaltSzam + " osztható 3-mal!");
        } else {
            System.out.println("A " + vizsgaltSzam + " NEM osztható 3-mal!");
        }

    }

    //BMI = kg/m^2
    public static double bodyMassIndex(int kg, int cm) {

        return kg / Math.pow((cm / 100), 2);
    }

    public static String bmiEredmeny(double bmi) {

        if (bmi < 20) {
            return "girhes szegény";
        } else if (bmi < 25) {
            return "pont jó, normál";
        }
        return "na jó ez már dagi";
    }


}
