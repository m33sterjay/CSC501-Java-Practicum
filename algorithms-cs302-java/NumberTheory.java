import java.util.Arrays;

public class NumberTheory {
    public static void main(String[] args) {
        int[][] matrix = new int[2][100];
        matrix[0] = triangleNumber();
        matrix[1] = squareNumber();

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                if (matrix[0][cols] == matrix[1][cols]) {
                    System.out.print(matrix[0][cols] + " ");
                }
            }
        }
    }
    /*
     * System.out.println("Triangle numbers between 0 - 100: " + Arrays.toString(matrix[0]));
     * System.out.println();
     * System.out.println("Square numbers between 0 - 100: " + Arrays.toString(matrix[1]));
     */

    public static int[] triangleNumber() {
        int[] triNumbers = new int[100];

        for (int i = 0; i < 100; i++) {
            int number = (i * (i + 1)) / 2;
            triNumbers[i] = number;
        }
        return triNumbers;
    }

    public static int[] squareNumber() {
        int[] squareNumbers = new int[100];

        for (int i = 0; i < 100; i++) {
            int number = (int) Math.pow(i, 2);
            squareNumbers[i] = number;
        }
        return squareNumbers;
    }
}
