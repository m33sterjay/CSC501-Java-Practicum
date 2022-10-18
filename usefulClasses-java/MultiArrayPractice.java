import java.util.Scanner;

public class MultiArrayPractice {
    public static void main(String[] args) {
        printMultiArray(fillMultiArrayWithInput());
    }

    public static int[][] fillMultiArrayWithInput() {
        int[][] matrix = new int[10][10]; // adjust as needed
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void fillMultiArrayWithRandomValues(String[] args) {
        int[][] matrix = new int[0][0]; // adjust these values as needed
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    }

    public static void printMultiArray(int[][] matrix) { // edit arguments as needed
        // int[][] matrix = new int[0][0]; // adjust these values as needed
        System.out.println();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void sumMultiArray(String[] args) {
        int[][] matrix = new int[0][0]; // adjust these values as needed
        int total = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
    }

    public static void colSumMultiArray(String[] args) {
        int[][] matrix = new int[0][0]; // adjust these values as needed

        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            System.out.println("Sum for column " + column + " is " + total);
        }
    }

    public static void compareRowSumMultiArray(String[] args) {
        int[][] matrix = new int[0][0]; // adjust these values as needed
        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
            }
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.print("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }

    public static void shuffleMultiArray(String[] args) {
        int[][] matrix = new int[0][0]; // adjust these values as needed

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);
                // swap matrix[i][j] with matrix[i1][j1];
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = swap;
            }
        }
    }
}
