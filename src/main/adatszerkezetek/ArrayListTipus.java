package main.adatszerkezetek;

import main.oraiMunka.oop.Macskas.Macska;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTipus {
    public static void main(String[] args) {

        double d = 1.0;
        ArrayList<Double> tomb = new ArrayList<>();
        ArrayList<Double> masik = new ArrayList<>();


        masik.add(20.0);
        masik.add(20.0);
        masik.add(-5.0);

        System.out.println(tomb.size());
        tomb.add(12.0);
        System.out.println(tomb.size());
        tomb.set(0, 3.0);
        System.out.println(tomb.get(0));
        tomb.add(12.0);
        System.out.println(tomb.size());

        tomb.addAll(1, masik);

        for (int i = 0; i < tomb.size(); i++) {
            System.out.print(tomb.get(i) + " ");
        }
        System.out.println();
        ArrayList<Macska> macskak = new ArrayList<>();

        macskak.add(new Macska("Cili", 3.6));
        macskak.add(new Macska("Kormi", 4.0));
        macskak.add(new Macska("Mokesz", 6.0));
        macskak.add(new Macska("Nabukodonozor", 5.0));

        for (Macska aktualisMacska:macskak) {
            System.out.println(aktualisMacska.toString());
        }

        //Macska macska = macskak.get(0);
        System.out.println("Futokos a 0. macska");
        macskak.get(0).futkos();

        for (Macska macska:macskak) {
            macska.futkos();
            System.out.println(macska.getNev()+" futkos.");
        }

        for (Macska aktualisMacska:macskak) {
            System.out.println(aktualisMacska.toString());
        }

        macskak.clear();

        if (macskak.size() == 0){
            System.out.println("Nincsenek macskák");
        }

    }

}
