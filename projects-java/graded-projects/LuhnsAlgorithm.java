import java.util.Scanner;

// Ch6 graded project - CSC501 - Jared Robbins
public class LuhnsAlgorithm {
    /** Analysis:
     * A program that determines if a long integer input by the user
     * is a valid credit card number and outputs the result */
    /** Valid Card Criteria:
     * - between 13 && 16 digits
     * Must start with:
     * 4 - visa
     * 5 - masterCard
     * 37 - amEx
     * 6 - discover */
    /** Mod 10 Check:
     * - double every 2nd digit from right to left; if two-digit sum, add the two digits to get a single-digit number
     * - sum all numbers
     * - add the remaining 'odd' digits to sum
     * - divide sum by 10, if divides evenly, it is valid */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt for input, store as long; cardNumber
        System.out.print("Enter a credit card number: ");
        long cardNumber = input.nextLong();
        if (cardValidate(cardNumber)) {
            // output card number && 'valid' or 'invalid'
            System.out.printf("%d is " + mod10Check(cardNumber) + "\n", cardNumber);
        } else
            System.out.printf("%d is not a valid credit card number\n", cardNumber);
    }

    // cardValidate():
    public static boolean cardValidate(long cardNumber) {
        // validate initial card criteria; int length , int firstDigit
        int length = (int) (Math.log10(cardNumber) + 1);
        long firstDigit = cardNumber / (long) Math.pow(10, length - 1);
        if (firstDigit >= 3 && firstDigit <= 6) {
            if (firstDigit == 3) {
                long secondDigit = cardNumber / ((long) Math.pow(10, length - 2)) % 10;
                if (secondDigit == 7) {
                    return true;
                } else
                    return false;
            }
            return true;
        } else
            return false;
    }

    // mod10Check():
    public static String mod10Check(long cardNumber) {
        int firstDigit = 0;
        int secondDigit = 0;
        int digitSum = firstDigit + secondDigit;
        int oddDigit = 0;
        int firstSum = 0;
        int secondSum = 0;
        int finalSum = firstSum + secondSum;

        for (int i = 0; cardNumber > 0; i++) {
            // sum all 'other' digits, store as int; secondSum
            oddDigit = (int) (cardNumber % 10);
            secondSum += oddDigit;
            // read input, every 2nd digit starting from right * 2, store as int; firstSum - if number is double-digit, add digits
            firstDigit = (int) (((cardNumber % 100) / 10) * 2) / 10;
            secondDigit = (int) (((cardNumber % 100) / 10) * 2) % 10;
            firstSum += digitSum;
            // increment cardNumber reading location
            cardNumber /= 100;
        }
        // sum of 'firstSum' && 'secondSum', store as int; finalSum
        if (finalSum % 10 == 0) {
            // if 'finalSum' % 10 == 0, card number is valid
            return "valid";
        } else
            return "invalid";
    }
}
