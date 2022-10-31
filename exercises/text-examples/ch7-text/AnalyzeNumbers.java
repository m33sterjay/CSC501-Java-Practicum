import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt user to enter the number of items to analyze
        System.out.print("Enter the number of items: ");
        // assign 'n' as the variable to store input
        int n = input.nextInt();
        // initialize array [numbers], value of 'n' is used as the size of the array
        double[] numbers = new double[n];
        // initializing a double data type, 'sum' to be used later
        double sum = 0;
        // prompt user to enter the numbers to be analyzed
        System.out.print("Enter the numbers: ");
        // 'i' is set to 0; while 'i' is less than 'n', increment 'i' by one each loop
        for (int i = 0; i < n; i++) {
            // each iteration, array[index 'i'] stores the 'nextDouble' input value by user
            numbers[i] = input.nextDouble();
            // sum is equal to: sum + the current iterations value of 'i'
            sum += numbers[i];
        }
        // double variable, 'average' = 'sum' divided by 'n'
        // at this point, 'sum' equals the total of all indices of [numbers], and 'n' is the # of items declared by user
        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            // for each iteration, if the value of the 'i' index of [numbers] is greater than 'average', do the following:
            if (numbers[i] > average) {
                // increment 'count' by one **counting the number of elements greater than the average**
                count++;
            }
        }
        // display the results
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
/** Summary:
 * A program that takes an input of a number of 'items' and outputs an
 * analysis of the average of the items along with the number of items
 * that are greater than the average. */
/** KEY TAKEAWAYS:
 * - initializing array : double[] numbers = new double[n];
 * - using a variable to declare the size of the array
 * - using 'for loop' to assign values to array indices
 * - operating on all the values in the array with 'sum' */