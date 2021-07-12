package main.oraiMunka.proc.F4;

public class F4_9 {

    public static void main(String[] args) {
        int[] szamok = randomSzamok();
        kiirTomb(szamok);
        System.out.println("A legnagyobb index: " + kapLegnagyobbErtekIndex(szamok));
        System.out.println("A legnagyobb érték sorszáma: " + (kapLegnagyobbErtekIndex(szamok) + 1));
    }

    public static int[] randomSzamok() {

        int[] tomb = new int[10];

        for (int i = 0; i < 10; i++) {
            tomb[i] = (int) (Math.random() * 100 + 1);
        }
        return tomb;
    }

    public static int kapLegnagyobbErtekIndex(int[] szamok) {

        int legnagyobbIndex = 0;

        for (int i = 1; i < szamok.length; i++) {

            if (szamok[legnagyobbIndex] < szamok[i]) {
                legnagyobbIndex = i;
            }
        }

        return legnagyobbIndex;
    }

    public static void kiirTomb(int[] szamok) {
        for (int i = 0; i < szamok.length; i++) {
            System.out.println((i + 1) + ". érték: " + szamok[i]);
        }
    }
}
