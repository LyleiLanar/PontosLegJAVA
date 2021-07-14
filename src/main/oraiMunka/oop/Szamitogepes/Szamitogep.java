package main.oraiMunka.oop.Szamitogepes;

public class Szamitogep {
        /*
        2. Írj osztályt, ami egy Szamitogep objektumot valósít meg.
        • A számítógép adattagjai a következőek legyenek: szabad memória MB-ban (double), be
            van -e kapcsolva (boolean).
        • Készíts két konstruktort is az osztályhoz. Az egyik általános legyen, ami minden adattagot
            a paraméterlistából állít be, a másik egy alapértelmezett konstruktor legyen, ami
            1024 MB memóriával, kikapcsolva hozza létre a gépet.
        • Az osztálynak legyen egy void kapcsol metódusa, ami nem vár paramétert. Ha a gép ki
            van kapcsolva, akkor kapcsolja be, egyébként kapcsolja ki.
        • Az osztálynak legyen egy boolean programMasol metódusa, ami egy program méretét
            várja paraméternek MB-ban (double). Ha a program ráfér még a gépre, és a gép be van
            kapcsolva, úgy csökkenjen a szabad memória a program méretével. A metódus térjen
            vissza boolean változóval, hogy sikeres volt -e a másolás.
        • Készíts toString metódust az osztályhoz.
        • A main metódusban hozz létre két számítógépet a fenti konstruktorokkal. Mindkét gép
            kikapcsolt állapotban kezdjen. Az alapértelmezett gépet kapcsold be, és másold rá először
            800 MB, aztán 400 MB programot. A másik gépre másolj 1 MB programot. A
            másolások eredményeit írd ki.
        • Mindkét objektumot írd ki szövegesen.
 */

    private double szabadMemoria;
    private boolean beVanEKapcsolva;

    public Szamitogep(double szabadMemoria, boolean beVanEKapcsolva) {
        this.szabadMemoria = szabadMemoria;
        this.beVanEKapcsolva = beVanEKapcsolva;
    }

    public Szamitogep() {
        this(1024, false);
    }

    /*Az osztálynak legyen egy void kapcsol metódusa, ami nem vár paramétert. Ha a gép ki
            van kapcsolva, akkor kapcsolja be, egyébként kapcsolja ki.*/

    public void kapcsol() {

        this.beVanEKapcsolva = !this.beVanEKapcsolva;

//        if (this.beVanEKapcsolva){
//            this.beVanEKapcsolva = false;
//        } else {
//            this.beVanEKapcsolva = true;
//        }
    }

    /*
    Az osztálynak legyen egy boolean programMasol metódusa, ami egy program méretét
            várja paraméternek MB-ban (double). Ha a program ráfér még a gépre, és a gép be van
            kapcsolva, úgy csökkenjen a szabad memória a program méretével. A metódus térjen
            vissza boolean változóval, hogy sikeres volt -e a másolás.
     */
    public boolean programMasol(double programMeret) {
        if (szabadMemoria > programMeret && beVanEKapcsolva) {
            szabadMemoria -= programMeret;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        // "[szh: ***Mb; bekapcsolva: true]"

        StringBuilder sb = new StringBuilder();

        sb.append("[szh: ");
        sb.append( szabadMemoria );
        sb.append( " Mb; ");
        sb.append( "bekapcsolva: " );
        sb.append(beVanEKapcsolva);
        sb.append("]");

        return sb.toString();

    }


}
