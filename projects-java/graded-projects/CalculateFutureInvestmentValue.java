import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    // Write a program that will calculate and output Future Investment Value based on given formula.
    /** Variables provided by user:
     * Investment amount
     * Annual interest rate, and
     * Number of years */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for Investment Amount, stored as double: investmentAmount
        System.out.print("Enter your investment amount value (ex. 100.00): ");
        double investmentAmount = input.nextDouble();
        // Prompt user for Annual Interest Rate, stored as double: annualInterestRate
        System.out.print("Enter the expected Annual Interest Rate (ex. 4.25): ");
        double annualInterestRate = input.nextDouble();
        // Prompt user for Length of Investment, stored as int: numberOfYears
        System.out.print("Enter your expected Length of Investment in years (ex. 20): ");
        int numberOfYears = input.nextInt();
        // Calculate Monthly Interest Rate, stored as double: monthlyInterestRate
            // double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyInterestRate = annualInterestRate / 1200;
        // Calculate Future Investment Value, stored as double: futureInvestmentValue
            // double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12.0);
        // Display Future Investment Value
            /* The Future Investment Value of your inital investment amount of (), 
            assuming an annual interest rate of () over () years, is ().*/
        System.out.println("The Future Investment Value of your initial investment is $" + (int)(futureInvestmentValue * 100 + 0.5) / 100.0 + ".");
        System.out.println("This assumes an initial Investment Amount of $" + (int)(investmentAmount * 100 + 0.5) / 100.0 + ",");
        System.out.println("and an Annual Interest Rate of " + annualInterestRate + "% over " + numberOfYears + " years.");
    }
}