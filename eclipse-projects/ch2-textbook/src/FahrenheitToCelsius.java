import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		try (
        Scanner input = new Scanner(System.in)) {
            //prompt user for temp in Fahrenheit
            System.out.print("enter a degree in fahrenheit: ");
            double fahrenheit = input.nextDouble();
            //convert fahrenheit to celsius
            double celsius = (5.0/9)/*5 / 9 = 0 in java*/ * (fahrenheit - 32);
            //display result
            System.out.println(fahrenheit + " degrees fahrenheit is equivalent to " + celsius + " degrees celsius"); // (input) degrees fahrenheit is equivalent to (variable) degrees celsius
        }

	}

}
