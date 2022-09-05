import java.util.Scanner;
// Ch2 - Elementary Programming: Q2.2
public class ComputeTheVolumeOfACylinder { 
// A program that reads in the radius and length of a cylinder and computes the area and volume based on given formulas
/* Given formulas:
 * Area = radius * radius * 3.14159
 * Volume = area * length */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double PI = 3.14159;
            // Prompt radius of cylinder, store as double: radius
            // Prompt length of cylinder, store as double: length
            System.out.print("Enter the radius and length of a cylinder (ex. 12 10): ");
            double radius = input.nextDouble();
            double length = input.nextDouble();
            // Compute area of cylinder, store as double: area
                // area = radius * radius * PI;
            double area = radius * radius * PI;
            // Compute volume of cylinder, store as double: volume
                // volume = area * length;
            double volume = area * length;
            // Display results
                // "The area is ()"
                // "The volume is ()"
            System.out.println("The area is " + (int)(area * 100 + 0.5) / 100.0);
            System.out.println("The volume is " + (int)(volume * 100 + 0.5) / 100.0);
        }
    }
}