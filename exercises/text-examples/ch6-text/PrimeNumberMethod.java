public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        // method call to "printPrimeNumbers" to display the values of the first 50 prime numbers
        printPrimeNumbers(50);
    }

    // when called, given an integer, 'numberOfPrimes', do the following:
    public static void printPrimeNumbers(int numberOfPrimes) {
        // define the maximum number of prime numbers for the program to display on one line
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        // while 'count' is less than 'numberOfPrimes', do the following:
        while (count < numberOfPrimes) {
            // if the method call of "isPrime", when passed the variable, 'number', returns 'true', do the following:
            if (isPrime(number)) {
                // increment count by one
                count++;
                // if the remainder count % NUMBER_OF_PRIMES_PER_LINE is EVEN, display number on a new line with 5 spaces after
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                } else { // else, display number on the same line with 5 spaces after
                    System.out.printf("%-5d", number);
                }
            } // increment 'number' by 1
            number++;
        }
    }

    // when called, given an int, 'number' execute the following and return a boolean value:
    public static boolean isPrime(int number) {
        // for int, 'divisor' assigned value of '2', while divisor is <= number/2, increment divisor by 1, AFTER executing the following:
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            // if number % divisor is equivalent to 0, do the following:
            if (number % divisor == 0) {
                // return boolean 'false'
                return false;
            }
        } // else, return boolean 'true'
        return true;
    }
}
/** Translation: A program that will display the first 50 prime numbers,
 * evenly spaced 5 spaces apart, in rows of 10 and columns of 5.
 * By breaking it apart into 3 different 'problems' it makes the code easier to debug.
 * Instead of having a large lump of code to weed through, you can easily find
 * the 'sub-problem' of the program should you need to edit or change it
 */