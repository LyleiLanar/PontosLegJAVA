package main.algoritmusok;

public class Csere {
    public static void main(String[] args) {

        String pirosPohar = "bor";
        String kekPohar = "víz";

        System.out.println("Csere előtt");
        System.out.println("Piros pohár: " + pirosPohar);
        System.out.println("Kék pohár: " + kekPohar);

        //******************************************************
        String cserePohar = pirosPohar;
        pirosPohar = kekPohar;
        kekPohar = cserePohar;
        //******************************************************

        System.out.println("Csere utána");
        System.out.println("Piros pohár: " + pirosPohar);
        System.out.println("Kék pohár: " + kekPohar);

     /*
     piros pohár: bor
     kék pohár: víz

     |
     V

     piros pohár: víz
     kék pohár: bor


      */

        // a := b
        // b := a


    }
}
