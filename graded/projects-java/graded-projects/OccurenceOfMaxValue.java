import java.util.Scanner;

//Ch5 Graded Project - CS501-OL - Jared Robbins
/** Occurence of Max Value:
 * A program that receives a string of integers as an input,
 * reads, counts, and evaluates them to find the largest integer,
 * counts it's occurences, and outputs the largest integer and occurence count values */

public class OccurenceOfMaxValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt for input
        System.out.print("Enter numbers, enter 0 as final number (ex. 1 2 3 0): ");
        // assign first number as current max and set count to 1; int max , int countOccurence
        int max = input.nextInt();
        int countOccurence = 0;
        // read subsequent inputs and compare to current max, if greater, assign as max and reset count
        for (int check = max; check != 0; check = input.nextInt()) {
            if (check > max) {
                max = check;
                countOccurence = 1;
            } else if (check == max) {
                countOccurence++;
            } else if (check < max) {
                continue;
            } else
                break;
        } // output max && countOccurence values
        System.out.printf("The largest number is %d\n", max);
        System.out.printf("The occurrence count of the largest number is %d\n", countOccurence);
    }
}