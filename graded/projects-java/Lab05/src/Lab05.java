
import java.util.Scanner;

// CS501-ol - Lab06 - Jared Robbins
/** Reverse Integer:
 * A program that reads an input integer between (0 < x < 2147483647) &&
 * prints out the integer in reverse order, using only the following:
 * * System.out.print(), the modulus function (%), the division function (/), a while loop,
 * * at most one if statement (no else), and a break statement (if needed).
 * CHALLENGE:
 * Create a method called 'ReverseInteger' that accepts an integer as an argument
 * and move working code into the method. Ensure code works identically as before */
public class Lab05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input prompt, assign as int; number
        System.out.println("Enter a number to reverse:");
        // reads input and isolates last digit
        int number = input.nextInt();

        ReverseInteger(number);
        System.out.print("\n");
    }

    public static void ReverseInteger(int number) {
        final int MAX_INT_INPUT = 2147483647;
        int sort = 0;

        while (number > 0) {
            if (number >= MAX_INT_INPUT) {
                System.out.print("INVALID INPUT");
                break;
            }
            // assigns it as first digit in the output & repeats for the length of string
            sort = number % 10;
            number = number / 10;
            System.out.print(sort);
        }
    }
}