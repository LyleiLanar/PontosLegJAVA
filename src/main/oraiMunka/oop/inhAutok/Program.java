package main.oraiMunka.oop.inhAutok;

public class Program {


    public static void main(String[] args) {
        //Jarmu j = new Jarmu(200, "KIT", 360);

        MentoAuto ma = new MentoAuto();
        TaxiAuto ta = new TaxiAuto(2000,"sdf", 300,4,true,4);

        MyRandom rnd = new MyRandom();

        for (int i = 0; i < 100; i++) {
            rnd.nextInt(1,6);
            rnd.nextInt(23);
        }





    }
}

