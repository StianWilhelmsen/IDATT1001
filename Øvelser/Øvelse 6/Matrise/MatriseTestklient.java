package Matrise;

public class MatriseTestklient {
    private static int[][] matrix = {{2, 1}, {1, 1}};
    private static int[][] matrix2 = {{2, 1}, {1, 1}};
    public static MatriseRegning matrix_1 = new MatriseRegning(matrix);
    public static MatriseRegning matrix_2 = new MatriseRegning(matrix2);

    public static void main(String[] args) {

        System.out.println(matrix_1.toString());
        System.out.println(matrix_2.toString());

        System.out.println(matrix_1.addere(matrix_2).toString());
        System.out.println(matrix_1.multiply(matrix_2).toString());
        System.out.println(matrix_1.Transpose().toString());
    }
}