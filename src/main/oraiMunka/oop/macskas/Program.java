package main.oraiMunka.oop.macskas;

public class Program {
    public static void main(String[] args) {

        Macska cili = new Macska("Cili", 3.5, true);

        Macska macska666 = new Macska("Kormi", 3.7);
        Macska macska667 = new Macska("Béla", 1.7);

//        System.out.println(cili.eszik(0.9));
//        System.out.println(cili.eszik(0.1));
        System.out.println(cili.toString());

        if(cili.eszik(0.1)){
            System.out.println("Sikerers etetés");
        }else{
            System.out.println("Nem sikeres az etetés");
        }

        // kifejezés ? utasítás : utasítás;
        System.out.println(cili.toString());
        String msg = cili.eszik(0.2) ?  "Sikerers etetés" : "Nem sikeres az etetés";
        System.out.println(msg);

        cili.futkos();
        System.out.println(cili);

        msg = cili.eszik(0.2) ?  "Sikerers etetés" : "Nem sikeres az etetés";
        System.out.println(msg);
        System.out.println(cili);

        cili.futkos();
        System.out.println(cili);

        cili.futkos();
        System.out.println(cili);

        System.out.println(macska666);
        macska666.futkos();
        System.out.println(macska666);
        System.out.println(macska667);
        macska667.futkos();
        System.out.println(macska667);
    }

}
