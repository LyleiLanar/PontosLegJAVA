package main.oraiMunka.oop.diego;

public class Program {

    /*
        1. osztály Floor.
           @ két mező:
                - width: double
                - length: double
           @ konstruktor két paraméter
            ha a szélesség vagy a hossz az kisebb, mint nulla,akkor legyenek 0-ra állítva.
           @ metódus
           getArea: kiszámolja a szoba területét

        2. osztály Carpet.
           @ egy mező:
             cost: double
           @ konstruktor
             egyparaméteres konstruktor
           @ metódus
             getCost: megadja a árát a szőnyegünknek.

       2. osztály Calculator.
           @ két mező:
             floor: Floor
             carpet: Carpet
           @ konstruktor
             két param konstruktor
           @ metódus
             getTotalCost: kiszámolja a teljes költségét a szőnyegnek.

     */

    public static void main(String[] args) {
        Floor floor=new Floor(2.75,4);
        Carpet carpet=new Carpet(3.5);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println(calculator.getTotalCost());

    }
}
