package main.oraiMunka.oop.inhAutok;

import java.util.Random;
import java.util.Scanner;

public class MyRandom extends Random {

    /**
     * Véletlenszerű számot állít elő a és b között. Mindkét paramétert beleveszi.
     *
     * @param a alsó határ nem lehet kisebb, mint nulla.
     * @param b felső határ nem lehet negatív vagy nulla.
     * @return a és b közötti véletlenszerű egész szám.
     * @throws IllegalArgumentException
     */
    public int nextInt(int a, int b) {
        if (a < 0 || b <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        return nextInt(b - a + 1) + a; //10-14 (10,11,12,13,14) //2-6 (2, 3, 4, 5, 6)
    }

}
