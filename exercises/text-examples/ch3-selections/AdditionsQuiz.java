import java.util.Scanner;

public class AdditionsQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = (int) System.currentTimeMillis() % 10;
        int y = (int) (System.currentTimeMillis() / 10) % 10;

        System.out.print(
                "What is " + x + " + " + y + "? ");

        int answer = input.nextInt();

        System.out.println(
                x + " + " + y + " = " + answer + " is " + (x + y == answer));
    }
}