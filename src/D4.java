import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Random;

public class D4 {

    static public final String TANAR = "PATRIK";

    enum TANULO {ZSOFI, MAGDI, VILI, JULI}

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {

            System.out.println(sorsol(true));
        }

    }

    private static String formazNevet(String nev) {
        nev = nev.toLowerCase();
        return nev.substring(0, 1).toUpperCase() + nev.substring(1, nev.length());
    }

    public static String sorsol(boolean tanarral) {

        if (tanarral) {
            int kiRnd = (int) (Math.random() * (TANULO.values().length + 1));

            if (kiRnd == TANULO.values().length) {
                return formazNevet(TANAR);
            }
        }
        return formazNevet(TANULO.values()[(int) (Math.random() * TANULO.values().length)].toString());
    }

    public static String[] sorsolSorrend(boolean tanarral) throws Exception {

        String[] emberek = new String[TANULO.values().length];

        String rndEmber = sorsol(tanarral);
        emberek[0] = rndEmber;


//        for (int i = 1; i < TANULO.values().length; i++) {
//
//            while (vanBenneIlyenEmber()) {
//
//
//
//            }
//        }
        throw new Exception("Nincs kész!");
    }

    public static boolean vanBenneIlyenEmber() throws Exception {
        throw new Exception("Nincs kész!");
    }
}
