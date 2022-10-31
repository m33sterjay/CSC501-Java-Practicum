import java.util.Scanner;
// Case Study: 6.7
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompt for hex number, store as String, 'hex'
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();
        // display the decimal value for 'hex' by calling method "hexToDecimal" and pass the return value of "hex.toUpperCase", to hexToDecimal
        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase())); // convert 'hex' to uppercase, then move to "hexToDecimal"
    } /* call stack here would be:
        top: "toUpperCase"
        next: "hexToDecimal"
        last: "System.out.println" */

    // when called, and given a string value 'hex', return an integer after executing the following:
    public static int hexToDecimal(String hex) { // value of String 'hex' above, a string of 
        // 'decimalValue' assigned value of '0'
        int decimalValue = 0;
        // initialize i with value 0, while i is less than hex.length, increment i by one after executing:
        for (int i = 0; i < hex.length(); i++) {
            // char 'hexChar' value assigned as the the return value of "hex.charAt(i)" - the first letter of string
            char hexChar = hex.charAt(i);
            // 'decimalValue' assigned value of 'decimalValue' * 16 + return value of "hexCharToDecimal(hexChar)"
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        } // return value of 'decimalValue' to call method
        return decimalValue;
    }

    // when called, and given some char, 'ch', return an integer after executing:
    public static int hexCharToDecimal(char ch) {
        // if 'ch' is >= 'A' AND 'ch' is <= 'F', do the following:
        if (ch >= 'A' && ch <= 'F') {
            // return the int value of 'ch' + 10 - 'A'
            return 10 + ch - 'A';
        } else // else return 
            return ch - '0';
    }
}

/** Summary:
 * NOTE: hexadecimals are base-16 numbers, which use 0-9 + A-F as values
 * ***** instead of: 10n^4 + 10n^3 + 10n^2 + 10n^1 == 1111n // 16n^4 + 16n^3 + 16n^2 + 16n^1 = 17776n
 * A program to convert a hexidecimal string input to decimal value.
 * NOTE: how the method calls are used and nested within eachother
 * ***** also how String 'hex' is used in both "main" and "hexToDecimal"
 *  **** they both serve the same function but they are different variables
 * */