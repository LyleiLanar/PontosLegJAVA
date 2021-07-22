package main.oraiMunka.oop.inhAutok;

public class Jarmu {

    /*
        Csinálni kell egy jármű alap osztályt
        Utána csinálni kell egy autó osztályt, ami a jármű osztályból származik
        Csinálni kelle egy konkrét autó osztályt, ami az autó osztályból származik
        Lehessen kormányozni, váltani, gyorsítani-lassítani.
        Ki kell találni, hogy milyen adattagjai és metódusai legyenek az osztályainknak
        Ha valamelyik ezek közül specifikusabb, akkor azt a megfelelő osztályban kell létrehozni.
     */
    private int maxSebesseg;
    private int pilSebesseg; //km/h
    private int pilIrany; //-180...+180 között lehet, ha -178-12 = 170, ha 170+20 = -170
    private int tomeg;    //                             -190
    private String nev;   //

    public Jarmu(int tomeg, String nev, int maxSebesseg) {
        System.out.println("<JARMU> készítése");
        this.tomeg = tomeg;
        this.nev = nev;
        this.pilSebesseg = 0;
        this.pilIrany = 0;
        this.maxSebesseg = maxSebesseg;

    }

    public int getPilIrany() {
        return pilIrany;
    }

    public int getPilSebesseg() {
        return pilSebesseg;
    }

    //kormányoz segédmetódus
    private int egyszerusitIranyMod(int iranyMod) {
        if (iranyMod > 180 || iranyMod <= -180) {
            if ((iranyMod / 180) % 2 == 0) {
                iranyMod %= 180;
            } else {
                if (iranyMod < 0) {
                    iranyMod = 180 + (iranyMod % 180);
                } else {
                    iranyMod = -180 + (iranyMod % 180);
                }
            }
        }
        return iranyMod;
    }

    public void kormanyoz(int iranyMod) {

        iranyMod = egyszerusitIranyMod(iranyMod);

        int ujIrany = this.pilIrany + iranyMod;
        if (ujIrany <= -180) {
            this.pilIrany = ujIrany + 360;
        } else if (ujIrany > 180) {
            this.pilIrany = ujIrany - 360;
        } else {
            this.pilIrany = ujIrany;
        }
    }

    public void gyorsitas(int sebMod) {
        if (sebMod < 0) {
            sebMod = 0;
        }
        if (pilSebesseg + sebMod > this.maxSebesseg) {
            pilSebesseg = maxSebesseg;
        } else {
            this.pilSebesseg += sebMod;
        }
    }

    public void lassitas(int sebMod) {
        if (sebMod > 0) {
            sebMod = 0;
        }
        if (this.pilSebesseg + sebMod < 0) {
            this.pilSebesseg = 0;
        } else {
            this.pilSebesseg += sebMod;
        }
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "pilSebesseg=" + pilSebesseg +
                ", pilIrany=" + pilIrany +
                ", nev='" + nev + '\'' +
                '}';
    }
}
