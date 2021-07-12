package main.autok;

import main.enums.Color;
import main.enums.Fuel;
import main.enums.ShifterType;

public class Program {
    public static void main(String[] args) {
        Car auto=new Car("Toyota","Corolla",2020,10_000_000, Color.KÉK,0, Fuel.HIBRID, ShifterType.AUTOMATA);
        System.out.println(auto.toText());

        CarShop cs = new CarShop();

        //Car[] cars = cs.getCars();
        //cars[0] = null;
    }
}
