package main.oraiMunka.F5;

public class F5_2 {
    public static void main(String[] args) {

        int dim = 4;
        int szam = 1;
        int[][] matrix = new int[dim][dim];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = szam;
                szam++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < matrix[3].length; i++) {
            System.out.print(matrix[3][i] + " ");
        }

    }
}
