public class HF1 {
    public static void main(String[] args) {

        //1. feladat
        long hossz = (long) Byte.MAX_VALUE + Short.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println("Hossz: " + hossz);

        //2. feladat
        double kulonbseg = Double.MAX_VALUE - Float.MAX_VALUE;
        System.out.println("Különbség: " + kulonbseg);

        //3. feladat
        int decimal = 21;
        System.out.println(decimal + " -> " + Integer.toBinaryString(decimal));

    }

}
