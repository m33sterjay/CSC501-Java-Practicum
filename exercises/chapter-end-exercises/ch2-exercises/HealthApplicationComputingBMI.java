import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.14
public class HealthApplicationComputingBMI {
/** A program that calculates BMI from input values
 * Input values:
    * Weight in lb's
    * Height in inches  
 */// BMI formula: BMI = weight(kg) / height(m)^2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double POUNDS_PER_KILO = 0.45359237;
        final double INCHES_PER_METER = 0.0254;
        // Prompt user for weight (lbs) & height (in), store as double: weightInPounds , heightInInches
        System.out.print("Enter your weight in pounds and height in inches (ex. 110.0 68) ");
        double weightInPounds = input.nextDouble();
        double heightInInches = input.nextDouble();
        // Compute conversion of weight from pounds to kg, store as double: weightInKilos
            // double weightInKilos = weightInPounds * POUNDS_PER_KILO;
        double weightInKilos = weightInPounds * POUNDS_PER_KILO;
        // Compute conversion of height from inches to meters, store as double: heightInMeters
            // double heightInMeters = heightInInches * INCHES_PER_METER;
        double heightInMeters = heightInInches * INCHES_PER_METER;
        // Calculate BMI value, store as double: bodyMassIndex - cast to one decimal place
            // double bodyMassIndex = weightInKilos / Math.pow(heightInMeters , 2);
        double bodyMassIndex = weightInKilos / Math.pow(heightInMeters, 2);
        // Display result
            // BMI is ()
        System.out.println("Your BMI is: " + (int)(bodyMassIndex * 10 + 0.5) / 10.0);
    }
}