package HF;

public class HF2_2 {

    public static void main(String[] args) {

        double ertek = -460;
        char fok = 'F';
        char nyil = '\u27B3';

        /*
        [°C] = ([°F] - 32) : 1,8
        [°F] = [°C] · 1,8 + 32
        */

        if ((fok == 'C' && ertek >= -273) || (fok == 'F' && ertek >= -459.67)) {

            if (fok == 'C') {
                double fahrenheit = ertek * 1.8 + 32;
                //   System.out.println(ertek + " °C " + nyil + " " + fahrenheit + " °F");
                System.out.println(ertek + " °C \u27B3 " + fahrenheit + " °F");
            }

            if (fok == 'F') {
                double celsius = (ertek - 32) / 1.8;
                System.out.println(ertek + " °F " + nyil + " " + celsius + " °C");
            }
        }

        if ((fok == 'C' && ertek < -273) || (fok == 'F' && ertek < -459.67)){
            System.out.println("Nem megfelelő érték!");
        }

    }

}
