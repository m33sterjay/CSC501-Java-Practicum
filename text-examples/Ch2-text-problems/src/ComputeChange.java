import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        // input amount in dollars and cents
        System.out.print("Enter amount in dollars and cents: ");
        double totalAmount = input.nextDouble();
        // calculate total number of cents
        int remainingAmount = (int)(totalAmount * 100); /* casting as int, because we can't convert from double (totalAmount)
        to int (remainingAmount), but we need the remaining amount and coins to be ints */
        // calculate max number of dollars
        int maxDollars = remainingAmount / 100;
        remainingAmount %= 100;
        // calculate max number of quarters from remaining
        int maxQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        // calculate max number of dimes from remaining
        int maxDimes = remainingAmount / 10;
        remainingAmount %= 10;
        // calculate max number of nickels from remaining
        int maxNickels = remainingAmount / 5;
        remainingAmount %= 5;
        // calculate max number of pennies from remaining
        int maxPennies = remainingAmount / 1;
        // display the results
        System.out.print("The minimum amount of coins for your change is " + maxDollars + " dollars: " + maxQuarters + " quarters: " + maxDimes + " dimes: " + maxNickels + " nickels: & " + maxPennies + " pennies.");

	}

}
