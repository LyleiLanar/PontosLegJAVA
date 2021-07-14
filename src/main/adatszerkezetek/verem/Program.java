package main.adatszerkezetek.verem;

public class Program {
    public static void main(String[] args) {
        IntVerem verem = new IntVerem(4);

        try {
            verem.pull();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        verem.kiir();

        verem.push(34);
        verem.kiir();

        try {
            System.out.println("A veremből kivett érték: " + verem.pull());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        verem.kiir();

        if (verem.push(10)) {
            System.out.println("Sikeres push");
        } else {
            System.out.println("Sikertelen push");
        }
        verem.kiir();

        if (verem.push(20)) {
            System.out.println("Sikeres push");
        } else {
            System.out.println("Sikertelen push");
        }
        verem.kiir();

        if (verem.push(30)) {
            System.out.println("Sikeres push");
        } else {
            System.out.println("Sikertelen push");
        }
        verem.kiir();

        if (verem.push(40)) {
            System.out.println("Sikeres push");
        } else {
            System.out.println("Sikertelen push");
        }
        verem.kiir();

        if (verem.push(1)) {
            System.out.println("Sikeres push");
        } else {
            System.out.println("Sikertelen push");
        }
        verem.kiir();


        try {
            System.out.println("A veremből kivett érték: " + verem.pull());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        verem.kiir();

        try {
            System.out.println("A veremből kivett érték: " + verem.pull());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        verem.kiir();

        try {
            System.out.println("A veremből kivett érték: " + verem.pull());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        verem.kiir();

        try {
            System.out.println("A veremből kivett érték: " + verem.pull());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        verem.kiir();
    }
}
