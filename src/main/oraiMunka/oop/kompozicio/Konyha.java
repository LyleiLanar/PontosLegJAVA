package main.oraiMunka.oop.kompozicio;

/*                    is a(n)
    Öröklődésnél: A "az egy" B; A toyota corolla "az egy" autó. Az autó "az egy" jármű.
    Kompozíciónál: B-nek része a(z) A: A szobának rész a fal. A szobának van fala.
 */

public class Konyha {

    private Fal fal1;
    private Fal fal2;
    private Fal fal3;
    private Fal fal4;

    private Plafon plafon;
    private Padlo padlo;

    private Huto huto;
    private Tuzhely tuzhely;

    public Konyha(Fal fal1, Fal fal2, Fal fal3, Fal fal4, Plafon plafon, Padlo padlo, Huto huto, Tuzhely tuzhely) {
        this.fal1 = fal1;
        this.fal2 = fal2;
        this.fal3 = fal3;
        this.fal4 = fal4;
        this.plafon = plafon;
        this.padlo = padlo;
        this.huto = huto;
        this.tuzhely = tuzhely;
    }

    public Fal getFal1() {
        return fal1;
    }

    public Fal getFal2() {
        return fal2;
    }

    public Fal getFal3() {
        return fal3;
    }

    public Fal getFal4() {
        return fal4;
    }

    public Plafon getPlafon() {
        return plafon;
    }

    public Padlo getPadlo() {
        return padlo;
    }

    public Huto getHuto() {
        return huto;
    }

    public Tuzhely getTuzhely() {
        return tuzhely;
    }

    public void kinyitAblak1() {
        if (fal1.getAblak() != null) {
            fal1.getAblak().kinyit();
        }else {
            System.out.println("Nincs mit kinyitni!");
        }
    }
}
