import java.util.Arrays;
import java.util.Scanner;

/** Ch8 graded project, CS501 - Locate the Largest Element - Jared Robbins
 * A program that takes dimensions for a two-dimensional array && array values, as input from the user,
 * and outputs the index coordinates for the location of that value in the array. */
public class Project_Ch_8 {
    public static void main(String[] args) {
        // fill array with values
        double[][] matrix = fillMultiArrayWithInput();
        // printMultiArray(matrix); //test

        // display the contents of the array
        System.out.println( // call locateLargest to search array for values and compare
                "The location of the largest element is at: " + Arrays.toString(locateLargest(matrix)));
    }

    public static int[] locateLargest(double[][] matrix) {
        // step through each row in the array and compare the values in the row for the largest
        double index1 = 0;
        double index2 = 0;
        double largestEl = 0;
        double largestTemp = 0;
        int[] matrixCoordinates = new int[2];

        // loop through row index
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            // compare largest element from previous row to current largest element
            largestEl = largestEl >= largestTemp
                    ? largestEl
                    : largestTemp;
            // loop through column index
            for (int colIndex = 0; colIndex < matrix[rowIndex].length; colIndex++) {
                // assign a value to compare
                index1 = matrix[rowIndex][colIndex];
                // loop back through column index
                for (int compareCol = 0; compareCol < matrix[rowIndex].length; compareCol++) {
                    // assign a 2nd value to compare
                    index2 = matrix[rowIndex][compareCol];
                    // don't compare the same index
                    if (index1 == index2) {
                        continue;
                    } else {
                        // compare the two current values and assign as the current largest row element
                        largestTemp = index1 >= index2
                                ? index1
                                : index2;
                    }
                }
            }
        }
        // locate matrix location of largest element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == largestEl) {
                    // write these values to a new single dimension array
                    matrixCoordinates[0] = i;
                    matrixCoordinates[1] = j;
                } else {
                    continue;
                }
            }
        } // return this array to main
        return matrixCoordinates;

    }

    // fill array with values
    public static double[][] fillMultiArrayWithInput() {
        Scanner input = new Scanner(System.in);
        // user input size of array and values of array
        System.out.println("Enter the number of rows and columns of the array (ex: 5 6): ");
        int rowIndex = input.nextInt();
        int colIndex = input.nextInt();
        double[][] matrix = new double[rowIndex][colIndex]; // adjust as needed
        System.out.println("Enter values for " + matrix.length + " rows and " + matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }

    /*
     * public static void printMultiArray(double[][] matrix) { // edit arguments as needed
     * // int[][] matrix = new int[0][0]; // adjust these values as needed
     * for (int row = 0; row < matrix.length; row++) {
     * for (int column = 0; column < matrix[row].length; column++) {
     * System.out.print(matrix[row][column] + " ");
     * }
     * System.out.println();
     * }
     * }
     */
}
// fill array with values
// user input size of array and values of array
// call locateLargest to search array for values and compare
// step through each row in the array and compare the values in the row for the largest
// loop through row index
// compare largest element from previous row to current largest element
// loop through column index
// assign a value to compare
// loop back through column index
// assign a 2nd value to compare
// don't compare the same index
// store the largest value of each row as a variable
// compare the two current values and assign as the current largest row element
// compare the largest values to determine the largest element
// locate matrix location of largest element
// write these values to a new single dimension array
// return this array to main
// display the contents of the array