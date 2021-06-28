package main.sorsolator;

public class Sorsolator {

    //Zsófi, Vili, Magdi

    /**
     * Konstansok:
     * Tanár és diákok listája.
     */

    static public final String TEACHER = "Patrik";

    static public final String[] PUPILS = {"Juli", "Magdi", "Zsófi", "Vili", "Penya"};

    /**
     * Pool:
     * Ebből választunk majd ki egy vagy több személyt.
     */

    static public String[] pool;

    /**
     * Main
     *
     * @param args A szokásos argumentumok a main metódusnak.
     */

    public static void main(String[] args) {

        createPool(false);
        shufflePool();
        writePool();

        System.out.println(getRandomName());

    }

    /**
     * Ezzek hozzuk létre, vagy írjuk felül a meglévő pool tartalmát.
     *
     * @param hasWithTeacher A poolba kerüljön-e bele a tanár is.
     */

    public static void createPool(boolean hasWithTeacher) {


        if (hasWithTeacher) {
            String[] names = new String[PUPILS.length + 1];

            for (int i = 0; i < PUPILS.length; i++) {
                names[i] = PUPILS[i];
            }

            names[names.length - 1] = TEACHER;

            pool = names;

        } else {
            pool = PUPILS;
        }
    }

    /**
     * A poolból visszatér egy véletlenszerű névvel.
     *
     * @return Random név String.
     */

    public static String getRandomName() {

        return pool[(int) (Math.random() * pool.length)];

    }

    /**
     * Visszatér egy sorozatnyi véletlenszerű névvel. Lehet benne ismétlődés.
     *
     * @param count A nevek száma.
     * @return Random nevek String tömb.
     */

    public static String[] getRandomNames(int count) {

        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            names[i] = getRandomName();
        }
        return names;
    }

    /**
     * Megállapítja, hogy egy névlista tartalmazz-e már az adott nevet.
     *
     * @param names A lista, amiben keresünk.
     * @param name  A keresett név.
     * @return Ha van benne, akkor true, különben nem.
     */
    public static boolean hasTheGivenName(String[] names, String name) {

        int i = 0;
        while (i < names.length && !names[i].equals(name)) {
            i++;
        }

        return i < names.length;

    }

    /**
     * Összekeveri a teljes poolt.
     */
    public static void shufflePool() {

        //String[] names = getRandomNames(pool.length);

        String[] names = new String[pool.length];

        for (int i = 0; i < pool.length; i++) {
            names[i] = "";
        }


        for (int i = 0; i < pool.length; i++) {
            String nextName;

            do {

                nextName = getRandomName();

            } while (hasTheGivenName(names, nextName));

            names[i] = nextName;

        }

        pool = names;
    }

    /**
     * Kiírja a terminálra a pool tartalmát.
     */
    public static void writePool() {

        for (int i = 0; i < pool.length - 1; i++) {
            System.out.print(pool[i] + ", ");
        }
        System.out.println(pool[pool.length - 1]);

    }
}
