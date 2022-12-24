import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt the user to enter the filing status and taxable income and compute the
        // tax
        // enter 0 for single, 1 for married/jointly, 2 for married/separately, 3 for
        // Head of household
        System.out.println("Enter your filing status number ");
        System.out.println("0 for Single");
        System.out.println("1 for Married Filing Jointly or Qualified Widow(er)");
        System.out.println("2 for Married Filing Separately");
        System.out.print("3 for Head of Household: ");
        int filingStatus = input.nextInt();

        System.out.print("Enter your taxable income (ex. 50000.00): ");
        double taxableIncome = input.nextDouble();

        double tax = 0;

        if (filingStatus == 0) {
            if (taxableIncome <= 8350.00) {
                tax = .010 * taxableIncome;
            } else if (taxableIncome <= 33950.00) {
                tax = (.010 * 8350.00) + (.015 * (taxableIncome - 8350.00));
            } else if (taxableIncome <= 82250.00) {
                tax = (.10 * 8350.00) + (.15 * (33950 - 8350.00)) + (.25 * (taxableIncome - 33950.00));
            } else if (taxableIncome <= 171550.00) {
                tax = (.10 * 8350.00) + (.15 * (33950.00 - 8350.00)) + (.25 * (82250.00 - 33950.00))
                        + (.28 * (taxableIncome - 82251.00));
            } else if (taxableIncome <= 372950.00) {
                tax = (.10 * 8350.00) + (.15 * (33950 - 8350.00)) + (.25 * (82250.00 - 33950.00))
                        + (.28 * (171550.00 - 82251.00))
                        + (.33 * (taxableIncome - 171551.00));
            } else {
                tax = (.10 * 8350.00) + (.15 * (33950 - 8350.00)) + (.25 * (82250.00 - 33950.00))
                        + (.28 * (171550.00 - 82251.00))
                        + (.33 * (372950.00 - 171551.00)) + (.35 * (taxableIncome - 372951.00));
            }
        } else if (filingStatus == 1) {

        } else if (filingStatus == 2) {

        } else if (filingStatus == 3) {

        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}