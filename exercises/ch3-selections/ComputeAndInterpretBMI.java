import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double LB_TO_KG = 0.45359237;
        final double INCH_PER_METER = 0.0254;
        // prompts the user to enter a weight in pounds and heigh in inches
        // displays BMI
        // 1 lb = .45359237kg -- 1 in = .0254m
        /*
         * BMI < 18.5 - Underweight
         * 18.5 <= BMI < 25.0 - Normal
         * 25.0 <= BMI < 30.0 - Overweight
         * 30.0 <= BMI - Obese
         */// display BMI and interpretation

        System.out.print("Enter a weight(lb) and height(in) (ex. 150 60): ");
        double weightInPounds = input.nextDouble();
        double weightInKilos = weightInPounds * LB_TO_KG;
        double heightInInches = input.nextDouble();
        double heightInMeters = heightInInches * INCH_PER_METER;
        double bodyMassIndex = (int) ((weightInKilos / Math.pow(heightInMeters, 2)) * 100 + 0.5) / 100.0;
        System.out.println("Your BMI is " + bodyMassIndex + ".");

        if (bodyMassIndex < 18.5) {
            System.out.println("Your BMI is considered Underweight.");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25.0) {
            System.out.println("Your BMI is considered Normal.");
        } else if (bodyMassIndex >= 25.0 && bodyMassIndex < 30.0) {
            System.out.print("Your BMI is considered Overweight.");
        } else if (bodyMassIndex >= 30.0) {
            System.out.print("Your BMI is considered Obese");
        }
    }
}