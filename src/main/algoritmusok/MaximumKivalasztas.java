package main.algoritmusok;

public class MaximumKivalasztas {

    public static int kapLegnagyobbErtekIndex(int[] szamok) {

        int legnagyobbIndex = 0;

        for (int i = 1; i < szamok.length; i++) {

            if (szamok[legnagyobbIndex] < szamok[i]) {
                legnagyobbIndex = i;
            }
        }

        return legnagyobbIndex;

    }
}
