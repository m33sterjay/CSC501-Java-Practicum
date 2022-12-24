import java.util.Scanner;
public class ComputeAreaWithConstant {

	public static void main(String[] args) {
	       final double PI = 3.14159; //declare a constant
	        try (//create a Scanner object
			Scanner input = new Scanner(System.in)) {
				//prompt user for radius
				System.out.print("Enter a number for radius: ");
				double radius = input.nextDouble();
				//calculate area
				double area = radius * radius * PI;
				//display result
				System.out.println("The area of circle with radius " + radius + " is " + area);
			}
	}

}
