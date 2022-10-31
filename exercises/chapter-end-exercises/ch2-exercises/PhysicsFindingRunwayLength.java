import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.12
public class PhysicsFindingRunwayLength {
/** A program that calculates and outputs the minimum runway length needed for a plane to take off
* User input variables:
    * Airplane take-off speed - v m/s
    * Airplane acceleration - a m/s^2
 */// Formula given: length = v^2 / 2a
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for take-off speed in m/s, store as double: speedTakeOff
        // Prompt user for acceleration in (m/s)^2, store as double: acceleration
        System.out.print("Enter speed and acceleration values (ex. 57 4.5) ");
        double speedTakeOff = input.nextDouble();
        double acceleration = input.nextDouble();
        // Compute length of runway needed, store as double: lengthOfRunway
            // double lengthOfRunway = Math.pow(speedTakeOff, 2) / (2 * acceleration);
        double lengthOfRunway = Math.pow(speedTakeOff, 2) / (2 * acceleration);
        // Display output
            // "The minimum runway length for this airplane is ()"
        System.out.println("The minimum runway length for this airplane is " + (int)(lengthOfRunway * 100 + 0.5) / 100.0 + " meters");
    }
}