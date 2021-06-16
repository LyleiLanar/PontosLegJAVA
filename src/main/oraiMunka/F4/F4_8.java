package main.oraiMunka.F4;

import java.util.Scanner;

public class F4_8 {

    public static void main(String[] args) {
        kiirVelemeny(beker());
    }

    public static int beker() {
        System.out.println("Kérem add meg az osztályzatot!");
        Scanner sc = new Scanner(System.in);
        int szam = Integer.parseInt(sc.nextLine());
        return szam;
    }
    public static void kiirVelemeny(int erdemjegy){
        switch (erdemjegy){
            case 1:
                System.out.println("Szobafogság a kamrában!");
                break;
            case 2:
                System.out.println("Szobafogság");
                break;
            case 3:
                System.out.println("Ennél jobbat várok tőled!");
                break;
            case 4:
                System.out.println("Majdnem!");
                break;
            case 5:
                System.out.println("Vehetesz fagyit!");
                break;
            default:
                System.out.println("Hibás adat!");
        }
    }


}
