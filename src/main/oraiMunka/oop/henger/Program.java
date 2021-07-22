package main.oraiMunka.oop.henger;

public class Program {

    public static void main(String[] args) {
        Kor kor=new Kor(3.75);
        Henger henger=new Henger(3.75,5.5);
        System.out.println("Kör rádiusza: "+kor.getRadius());
        System.out.println("Kör területe: "+kor.getTerulet());
        System.out.println("");
        System.out.println("Henger rádiusza: "+henger.getRadius());
        System.out.println("Henger magassága: "+henger.getMagassag());
        System.out.println("Henger alap területe: "+henger.getTerulet());
        System.out.println("Henger térfogata: "+henger.getTerfogat());

    }
}
