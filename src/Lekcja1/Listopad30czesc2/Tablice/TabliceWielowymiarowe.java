package Lekcja1.Listopad30czesc2.Tablice;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2},
                {2, 4, 8},
                {4, 8, 16},};
        int[] r0 = matrix[0];
        int c01 = r0[1];
        System.out.println(c01);
        int c21 = matrix[2][1];
        System.out.println(c21);
        int c = matrix[1][1];
        System.out.println(c);
        int c1 = matrix[0][0];
        System.out.println(c1);

    }
}
