import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) {
		try (
        Scanner input = new Scanner(System.in)) {
            // input annual interest rate
            System.out.print("Enter the annual interest rate: ");
            double annualInterestRate = input.nextDouble();
            // input number of loan years
            System.out.print("Enter number of years for loan: ");
            int numberOfYears = input.nextInt();
            // input loan amount
            System.out.print("Enter total loan amount: ");
            double loanAmount = input.nextDouble();
            // calculate monthly rate;
                // input in %, need to convert to decimal by /100, then /12 for monthly rate == 1200
            double monthlyInterestRate = annualInterestRate / 1200.0;
            // calculate monthly payment;
                // monthlyPayment = loanAmount * monthlyInterestRate / 1 - (1 / 1 + Math.pow(1 + monthlyInterestRate, numberOfYears * 12)
            double monthlyPayment = loanAmount * monthlyInterestRate / 1 - (1.0 / 1 + Math.pow(1 + monthlyInterestRate, numberOfYears * 12.0));
            // calculate total payment
                // totalPayment = monthlyPayment * numberOfYears * 12
            double totalPayment = monthlyPayment * numberOfYears * 12.0;
            // display the monthly payment
            System.out.println("The monthly payment is $" + /*casting as int to two decimals*/(int)(monthlyPayment * 100 + 0.5) / 100.0);
            // display the total payment
            System.out.println("The total payment amount is $" + /* casting as int to two decimals */(int)(totalPayment * 100 + 0.5) / 100.0);
        }
	}
}
