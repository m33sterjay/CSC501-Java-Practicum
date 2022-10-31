import java.util.Scanner;

public class SubractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // if number1 < number2, swap number1 with number2
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
            /*
             * if x is greater than y;
             * let there be z, that is equal to x
             * let x now be equal to y
             * let y now be equal to z, end.
             */// x is now equal to y, y is now equal to x
        }
        // prompt the student to answer, "what is number1 - number2?"
        System.out.print("What is " + number1 + " - " + number2 + " ? ");
        int answer = input.nextInt();

        // grade the answer and display the result
        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("You're answer is wrong.");
        System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
    }
}