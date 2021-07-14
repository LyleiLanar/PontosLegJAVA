package main.oraiMunka.oop.Macskas;

public class Macska {
/*
        • A macska adattagjai a következőek legyenek: név (String), súly (double), éhes -e (boolean).
        • Két konstruktort is készíts az osztályhoz. Az egyik általános legyen, ami minden adattagot a konstruktor paraméterlistájából állít be,
            illetve egy másik, ami az első két adattagot a konstruktor paraméterlistájából kapja, és alapértelmezetten éhes a macska legyen.
        • Az osztálynak legyen egy eszik metódusa, ami egy double értéket vár (étel mennyisége), és egy boolean-el tér vissza (sikeres volt -e az etetés).
            Ha a macska éhes, az etetés sikeres, és a súlya nőjön az étel mennyiségével. A macska ezután ne legyen éhes. Ha a
            macska nem éhes, az etetés nem sikeres.
        • Az osztálynak legyen egy void futkos metódusa, ami nem vár paramétert. A macska
            súlya csökkenjen 0.1-el, és ha nem volt éhes, akkor éhezzen meg.
        • Készíts toString metódust az osztályhoz.
        • A main metódusban hozz létre két macskát a két különböző konstruktorral, és próbáld
            meg megetetni őket. Az etetés sikerességéről írj információt konzolra.
        • Mindkét macska futkosson, és utána írd ki szövegesen az objektumokat
 */

    private String nev;
    private double tomeg;
    private boolean ehesE;

    public Macska(String nev, double tomeg, boolean ehesE) {
        this.nev = nev;
        this.tomeg = tomeg;
        this.ehesE = ehesE;
    }

    public Macska(String nev, double tomeg) {
        this(nev, tomeg, true);
    }

    public boolean eszik(double kajaMennyiseg) {
        if (ehesE&&(kajaMennyiseg>=0.1&&kajaMennyiseg<=0.5)) {
            tomeg += kajaMennyiseg;
            ehesE = false;
            return true;
        }
        return false;
    }

    //• Az osztálynak legyen egy void futkos metódusa, ami nem vár paramétert. A macska
    //            súlya csökkenjen 0.1-el, és ha nem volt éhes, akkor éhezzen meg.

    public void futkos() {
        this.tomeg -= 0.1;
        this.ehesE = true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("(Név: "+nev);
        sb.append(", Tömeg: "+tomeg);
        sb.append(", Éhes: "+ehesE+")");
        // " [Név: Cili, Tömeg: 3.2, Éhes: true] "
        return sb.toString();
    }
}
