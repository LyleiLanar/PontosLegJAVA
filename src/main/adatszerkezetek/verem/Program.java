package main.adatszerkezetek.verem;

import main.oraiMunka.oop.macskas.Macska;

import java.util.Stack;

public class Program {
    public static void main(String[] args) throws Exception {
        IntVerem verem = new IntVerem(4);

        verem.push(1);
        verem.push(2);
        verem.rajzol();
        System.out.println();

        verem.push(2);
        verem.rajzol();
        System.out.println();

        verem.push(2);
        verem.rajzol();
        System.out.println();

        verem.push(2);
        verem.rajzol();
        System.out.println();

        verem.pull();
        verem.rajzol();
        System.out.println();

        verem.pull();
        verem.rajzol();
        System.out.println();

        verem.pull();
        verem.rajzol();
        System.out.println();

        verem.pull();
        verem.rajzol();
        System.out.println();

        Stack<Macska> stack = new Stack<>();


    }
}
