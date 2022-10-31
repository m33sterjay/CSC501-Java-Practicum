import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt inputs and store variables
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        // display output of method call within print method call
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
    }

    // when called, given two integers, n1 && n2, execute the following:
    public static int gcd(int n1, int n2) {
        /** Translation:
         * This method takes two integers,'n1' && 'n2' and compares their remainders when divided by a variable, 'k'
         * while the value of 'k' is <= both 'n1' && 'n2',
         * starting at a value of 'k' = 2, the method divides 'n1' && 'n2' by 'k'
         * * if the remainder of this division is '0', a variable 'gcd' is assigned the value of 'k'
         * either way, after this division, the value of 'k' is incremented by 1
         * This continues until the value of 'k' is <= 'n1' OR 'n2'
         * At which point the method return the value of 'gcd' to "main" */
        int gcd = 1;
        int k = 2;
        // while k <= n1 AND k <= n2, do the following:
        while (k <= n1 && k <= n2) {
            // if the remainder of ' k| n1' AND ' k| n2' are both equivalent to '0', do the following:
            if (n1 % k == 0 && n2 % k == 0) {
                // assign value of 'k' to 'gcd'
                gcd = k;
            }
            // increment 'k' by one
            k++;
        }
        // return value of 'gcd'
        return gcd;
    }
}
