import java.util.Scanner;
// Ch4 Project: Phone Keypads - CSC501 - Jared Robbins
public class Exercise04_15 {
    /**
     * A program that reads a string of letters input by the user and displays a
     * corresponding number
     * related to that digit based on the international standard letter/number
     * mapping concept given
     */// [ABC = 2][DEF = 3][GHI = 4][JKL = 5][MNO = 6][PQRS = 7][TUV = 8][WXYZ
       // =9][else = invalid input]
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // prompt user to input a letter, store as String; letterString
        // "Enter a letter: "
        System.out.print("Enter a letter: ");
        String letterString = input.next();
        // convert to uppercase for simplicity, letterString.toUpperCase(); letterUpper
        String letterUpper = letterString.toUpperCase();
        // read the input and store as char; letterChar
        // char letterChar = charAt(0); --> test this
        int letterChar = letterUpper.charAt(0);
        // evaluate letterChar with boolean expression and if-else statement to determine
        // the number and display the result
        // if ((letterChar >= 65 && letterChar <= 90)
        // if (letterChar >= 65 && letterChar <= 67)
        // System.out.println("The corresponding number is 2");
        // else if etc.

        boolean validateChar = (letterChar >= 65 && letterChar <= 90);
        boolean dial2 = letterChar >= 65 && letterChar <= 67;
        boolean dial3 = letterChar >= 68 && letterChar <= 70;
        boolean dial4 = letterChar >= 71 && letterChar <= 73;
        boolean dial5 = letterChar >= 74 && letterChar <= 76;
        boolean dial6 = letterChar >= 77 && letterChar <= 79;
        boolean dial7 = letterChar >= 80 && letterChar <= 83;
        boolean dial8 = letterChar >= 84 && letterChar <= 86;
        boolean dial9 = letterChar >= 87 && letterChar <= 90;

        if (validateChar) {
            if (dial2)
                System.out.println("The corresponding number is 2");
            else if (dial3)
                System.out.println("The corresponding number is 3");
            else if (dial4)
                System.out.println("The corresponding number is 4");
            else if (dial5)
                System.out.println("The corresponding number is 5");
            else if (dial6)
                System.out.println("The corresponding number is 6");
            else if (dial7)
                System.out.println("The corresponding number is 7");
            else if (dial8)
                System.out.println("The corresponding number is 8");
            else if (dial9)
                System.out.println("The corresponding number is 9");
            else
                System.out.printf("%s is an invalid input", letterString);
        } else
            System.out.printf("%s is an invalid input", letterString);
	}

}
