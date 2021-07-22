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

    private Szekreny konyszekreny;
    private Huto huto;
    private Tuzhely tuzhely;

    public Konyha(Fal fal1, Fal fal2, Fal fal3, Fal fal4, Plafon plafon, Padlo padlo, Szekreny konyszekreny, Huto huto, Tuzhely tuzhely) {
        this.fal1 = fal1;
        this.fal2 = fal2;
        this.fal3 = fal3;
        this.fal4 = fal4;
        this.plafon = plafon;
        this.padlo = padlo;
        this.konyszekreny = konyszekreny;
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

    public Szekreny getKonyszekreny() {
        return konyszekreny;
    }

    public Huto getHuto() {
        return huto;
    }

    public Tuzhely getTuzhely() {
        return tuzhely;
    }
}
