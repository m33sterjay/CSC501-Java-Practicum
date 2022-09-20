import java.util.Scanner;
//Project - Chapter 3 - CSC501-OL - Jared Robbins
public class Exercise03_13 {
    /*
     * A program to compute tax based on user input variables and given tax rates
     * User input variables:
     * Filing status: {0 - Single, 1 - Married Filing Jointly or Qualified
     * Widow(er), 2 - Married Filing Separately, 3 - Head of Household}
     * Taxable Income
     */// Marginal tax rates given in Table 1 on project worksheet, based on 2009
       // Federal Tax rates. end.
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to enter their filing status and taxable income - assign as int &
        // double; filingStatus , taxableIncome
        System.out.println(
                "Filing Status: 0 - Single, 1 - Married Filing Jointly or Qualifying Widow(er), 2 - Married Filing Separately, 3 - Head of Household");
        System.out.print("Enter your filing status: ");
        int filingStatus = input.nextInt();

        System.out.print("Enter your taxable income (ex. 50000.00): ");
        double taxableIncome = input.nextDouble();
        // Create "if-else" chain to determine and display tax amount based on filing
        // status, and then nested "if-else" chain for each filing status based on
        // marginal tax rates given
        // if (filingStatus == (0,1,2,3))
        // if (taxableIncome <= (marginal tax rate))
        // tax = (formula)
        // else if ... etc
        // else if ... etc

        double tax = 0;

        final double MAX_10_PERCENT00 = 8350.00 * .10;
        final double MAX_10_PERCENT01 = 16700 * .10;
        final double MAX_10_PERCENT02 = MAX_10_PERCENT00;
        final double MAX_10_PERCENT03 = 11950.00 * .10;

        final double MAX_15_PERCENT00 = (33950.00 - 8351.00) * .15;
        final double MAX_15_PERCENT01 = (67900.00 - 16701.00) * .15;
        final double MAX_15_PERCENT02 = MAX_15_PERCENT00;
        final double MAX_15_PERCENT03 = (45500.00 - 11951.00) * .15;

        final double MAX_25_PERCENT00 = (82250.00 - 33951.00) * .25;
        final double MAX_25_PERCENT01 = (137050.00 - 67901.00) * .25;
        final double MAX_25_PERCENT02 = (68525.00 - 33951.00) * .25;
        final double MAX_25_PERCENT03 = (117450.00 - 45501.00) * .25;

        final double MAX_28_PERCENT00 = (171550.00 - 82251.00) * .28;
        final double MAX_28_PERCENT01 = (208850.00 - 137051.00) * .28;
        final double MAX_28_PERCENT02 = (104425.00 - 68525.00) * .28;
        final double MAX_28_PERCENT03 = (190200.00 - 117451.00) * .28;

        final double MAX_33_PERCENT00 = (372950.00 - 171551.00) * .33;
        final double MAX_33_PERCENT01 = (372950.00 - 208851.00) * .33;
        final double MAX_33_PERCENT02 = (186475.00 - 104426.00) + .33;
        final double MAX_33_PERCENT03 = (372950.00 - 190201.00) + .33;

        if (filingStatus == 0) {
            if (taxableIncome <= 8350.00)
                tax = taxableIncome * .10;
            else if (taxableIncome <= 33950.00)
                tax = ((taxableIncome - 8351.00) * .15) + MAX_10_PERCENT00;
            else if (taxableIncome <= 82250.00)
                tax = ((taxableIncome - 33951.00) * .25) + MAX_15_PERCENT00 + MAX_10_PERCENT00;
            else if (taxableIncome <= 171550.00)
                tax = ((taxableIncome - 82251.00) * .28) + MAX_25_PERCENT00 + MAX_15_PERCENT00 + MAX_10_PERCENT00;
            else if (taxableIncome <= 372950.00)
                tax = ((taxableIncome - 171551.00) * .33) + MAX_28_PERCENT00 + MAX_25_PERCENT00 + MAX_15_PERCENT00
                        + MAX_10_PERCENT00;
            else
                tax = ((taxableIncome - 372951.00) * .35) + MAX_33_PERCENT00 + MAX_28_PERCENT00 + MAX_25_PERCENT00
                        + MAX_15_PERCENT00 + MAX_10_PERCENT00;
        } else if (filingStatus == 1) {
            if (taxableIncome <= 16700.00)
                tax = taxableIncome * .10;
            else if (taxableIncome <= 67900.00)
                tax = ((taxableIncome - 16701.00) * .15) + MAX_10_PERCENT01;
            else if (taxableIncome <= 137050.00)
                tax = ((taxableIncome - 67901.00) * .25) + MAX_15_PERCENT01 + MAX_10_PERCENT01;
            else if (taxableIncome <= 208850.00)
                tax = ((taxableIncome - 137051.00) * .28) + MAX_25_PERCENT01 + MAX_15_PERCENT01 + MAX_10_PERCENT01;
            else if (taxableIncome <= 372950.00)
                tax = ((taxableIncome - 208851.00) * .33) + MAX_28_PERCENT01 + MAX_25_PERCENT01 + MAX_15_PERCENT01
                        + MAX_10_PERCENT01;
            else
                tax = ((taxableIncome - 372951.00) * .35) + MAX_33_PERCENT01 + MAX_28_PERCENT01 + MAX_25_PERCENT01
                        + MAX_15_PERCENT01 + MAX_10_PERCENT01;
        } else if (filingStatus == 2) {
            if (taxableIncome <= 8350.00)
                tax = taxableIncome * .10;
            else if (taxableIncome <= 33950.00)
                tax = ((taxableIncome - 8351.00) * .15) + MAX_10_PERCENT02;
            else if (taxableIncome <= 68525.00)
                tax = ((taxableIncome - 33951.00) * .25) + MAX_15_PERCENT02 + MAX_10_PERCENT02;
            else if (taxableIncome <= 104425.00)
                tax = ((taxableIncome - 68525.00) * .28) + MAX_25_PERCENT02 + MAX_15_PERCENT02 + MAX_10_PERCENT02;
            else if (taxableIncome <= 186475.00)
                tax = ((taxableIncome - 104426.00) * .33) + MAX_28_PERCENT02 + MAX_25_PERCENT02 + MAX_15_PERCENT02
                        + MAX_10_PERCENT02;
            else
                tax = ((taxableIncome - 186476.00) * .35) + MAX_33_PERCENT02 + MAX_28_PERCENT02 + MAX_25_PERCENT02
                        + MAX_15_PERCENT02 + MAX_10_PERCENT02;
        } else if (filingStatus == 3) {
            if (taxableIncome <= 11950.00)
                tax = taxableIncome * .10;
            else if (taxableIncome <= 45500.00)
                tax = ((taxableIncome - 11951.00) * .15) + MAX_10_PERCENT03;
            else if (taxableIncome <= 117450.00)
                tax = ((taxableIncome - 45501.00) * .25) + MAX_15_PERCENT03 + MAX_15_PERCENT03;
            else if (taxableIncome <= 190200.00)
                tax = ((taxableIncome - 117451.00) * .28) + MAX_25_PERCENT03 + MAX_15_PERCENT03 + MAX_10_PERCENT03;
            else if (taxableIncome <= 372950.00)
                tax = ((taxableIncome - 190201.00) * .33) + MAX_28_PERCENT03 + MAX_25_PERCENT03 + MAX_15_PERCENT03
                        + MAX_10_PERCENT03;
            else
                tax = ((taxableIncome - 372951.00) * .35) + MAX_33_PERCENT03 + MAX_28_PERCENT03 + MAX_25_PERCENT03
                        + MAX_15_PERCENT03 + MAX_10_PERCENT03;
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // display tax amount. end.
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
	}

}
