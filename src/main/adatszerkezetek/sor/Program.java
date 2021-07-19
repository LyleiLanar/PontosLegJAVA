package main.adatszerkezetek.sor;

public class Program {
    public static void main(String[] args) throws Exception {
        EgyediSor sor = new EgyediSor(10);
        sor.beletesz('A');
        sor.rajzol();

        sor.beletesz('B');
        sor.rajzol();

        sor.beletesz('C');
        sor.rajzol();

        System.out.println("A kivett érték: " + sor.kivesz());
        sor.rajzol();

        System.out.println("A kivett érték: " + sor.kivesz());
        sor.rajzol();

        System.out.println("A kivett érték: " + sor.kivesz());
        sor.rajzol();

        System.out.println("A kivett érték: " + sor.kivesz());
        sor.rajzol();

    }
}
