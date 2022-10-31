import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.4
public class ConvertPoundsToKilograms {
/* A program that converts pounds to kilograms.
   Prompts user input for # of pounds */// 1 pound = 0.454 kg
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Prompt user for # of pounds, store as double: pounds
            System.out.print("Enter a number in pounds (ex. 45): ");
            double pounds = input.nextDouble();
            // Convert pounds to kilograms, store as double: kilograms
                // double kilograms = pounds * 0.454;
            double kilograms = pounds * 0.454;
            // Display results
                // () pounds is () kilograms
            System.out.println((int)(pounds * 100 + 0.5) / 100.0 + " pounds is " + (int)(kilograms * 100 + 0.5) / 100.0 + " kilograms");
        }
    }
}