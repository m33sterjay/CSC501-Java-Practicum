public class Increment {
    public static void main(String[] args) {
        int x = 1;
        // display value of x BEFORE method call
        System.out.println("Before the call, x is " + x);
        // call method 'increment' and pass it the variable 'x'
        increment(x);
        // display value of x AFTER method call
        System.out.println("After the call, x is " + x);
    }

    // upon call, when passed an integer 'n', execute the following:
    public static void increment(int n) {
        // increment 'n' by one
        n++;
        // display value of 'n'
        System.out.println("n inside the method is " + n);
    }
}// this method doesn't return a value, and doesn't affect the variable 'x'
 // the value of 'x' is "PASSED BY VALUE" to the variable 'n' inside the 'increment' method
 // 'x' itself stays in the 'main' method, which is why the value doesn't change after the method call
