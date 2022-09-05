import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.6
public class SumTheDigitsInAnInteger {
// A program that reads an integer between 0 and 1000 and sums digits of intger
    // Hint: use % operator to extract digits and use / operator to remove the digit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt for integer between 0 and 1000, store as int: number
        System.out.print("Input a whole number between 0 and 1000: ");
        int number = input.nextInt();
        // Isolate the last digit of integer and add to sum, store as int: sum
        int sum = number % 10;
        // Compute 'number' in such a way to isolate the next digit
        number /= 10;
        // Isolate next digit, add to 'sum'
        sum += number % 10;
        // Advance 'number'
        number /= 10;
        // Add final digit to 'sum'
        sum += number;
        // Display 'sum'
            // "The sum of the digits is ()"
        System.out.println("The sum of the digits is " + sum);
    }
}