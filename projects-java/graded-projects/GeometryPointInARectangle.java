import java.util.Scanner;

// Project - Ch3 - CSC501-OL - Jared Robbins
public class GeometryPointInARectangle {
    /*
     * A program that determines if two coordinates fall within a rectangle with
     * given bounds
     * User input:
     * X and Y value coordinates
     * Bounds of rectangle:
     * Horizontal - distance to (0,0) is <= 5
     * Vertical - distance to (0,0) is <= 2.5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for (x,y) coordinates, save as double; coordinateX , coordinateY
        System.out.print("Enter x & y coordinates (ex. 5.0 7.5): ");
        double coordinateX = input.nextDouble();
        double coordinateY = input.nextDouble();
        // Determine if coordinates are within rectangle
        // boolean checkX = coordinateX >= -5 && coordinateX <= 5;
        // boolean checkY = coordinateY >= -2.5 && coordinateY <= 2.5;
        // if (checkX == true && checkY == true)
        boolean checkX = coordinateX >= -5.0 && coordinateX <= 5.0;
        boolean checkY = coordinateY >= -2.5 && coordinateY <= 2.5;
        // Display result
        // System.out.println( checkX && checkY ? "Point (" + coordinateX + " , " +
        // coordinateY + ") is in the rectangle" : "Point (" + coordinateX + " , " +
        // coordinateY + ") is NOT in the rectangle")
        System.out.println(
                checkX && checkY
                        ? "Point (" + coordinateX + " , " + coordinateY + ") IS in the rectangle"
                        : "Point (" + coordinateX + " , " + coordinateY + ") IS NOT in the rectangle");
    }
}