     Due Monday by 11:59pm Points 15 Submitting a file upload File Types java

Using only the functions, methods, or structures, listed below you must complete the code also given below. The code should read in an integer and print out the integer in reverse order.

You can use the following: 
- System.out.print(), 
- the modulus function (%), 
- the division function (/), 
- a while loop, 
- at most one if statement (no else), 
- and a break statement (if needed).

You are not allowed to use any other functions, methods, or structures.

import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int number = input.nextInt();

        // YOUR CODE HERE


    }

}

The number passed in will always be an integer that is greater than 0 and less than 2147483647 (exclusive).

After you have working code you need to create a method called "ReverseInteger" that accepts an integer as an argument, and then move your working code into that method. Your code should work identically to when you didn't have the method as it does after you have created your method.

The code that you submit must use the template given and you must submit a .java file. Code that does not compile or that is submitted in the incorrect format will receive a 0.
