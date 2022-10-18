import java.util.Scanner;

public class ModExponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer for 'n': ");
        int n = input.nextInt();
        System.out.print("Input an integer > 0 for mod: ");
        int d = input.nextInt();
        System.out.print("Input an integer for the exponent: ");
        int e = input.nextInt();

        int result = n;
        for (int i = 1; i < e; i++) {
            result *= returnMod((n * result), d);
        }

        System.out.println(n + " to the " + e + "th power, mod " + d + " is " + result);
    }

    public static int returnMod(int n, int d) {
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
        return r;
    }
}
