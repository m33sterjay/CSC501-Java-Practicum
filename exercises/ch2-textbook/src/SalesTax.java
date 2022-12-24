import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		try (
        Scanner input = new Scanner(System.in)) {
            //request purchase amount from user
            System.out.print("Enter purchase amount: ");
            double purchaseAmount = input.nextDouble();
            //calculate sales tax
            double tax = purchaseAmount * 0.06;
            //display result
            System.out.println("The amount of sales tax for a purchase of " + purchaseAmount + " at a sales tax rate of 6% is $" + (int)(tax * 100) / 100.0);
        }

	}

}
