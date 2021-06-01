public class D4 {
    public static void main(String[] args) {

        int vszam = (int) ((Math.random() * 4) + 1);

        if (vszam == 1) {
            System.out.println("Magdi");
        } else if (vszam == 2) {
            System.out.println("Juli");
        } else if (vszam == 3) {
            System.out.println("Zsófi");
        } else if (vszam == 4) {
            System.out.println("Vili");
        } else
            System.out.println("Patrik");
    }
}
