import java.util.Scanner;

public class DivisionAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer for n: ");
        int n = input.nextInt();
        System.out.println("Input an integer > 0 for d: ");
        int d = input.nextInt();
        theDivisionAlgorithm(n, d);
    }

    public static void theDivisionAlgorithm(int n, int d) {
        int q = 0;
        int r = n;

        if (n >= 0) {
            while (r >= d) {
                q = q + 1;
                r = r - d;
            }
        } else if (n < 0) {
            while (r < 0) {
                q = q - 1;
                r = r + d;
            }
        }
        System.out.println(n + " div " + d + " = " + q);
        System.out.println(n + " mod " + d + " = " + r);
    }
}
