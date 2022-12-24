public class TestpassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        // display values of 'num1' & 'num2' before method call
        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
        // method call, pass variables 'num1' && 'num2' to "swap" method
        swap(num1, num2);
        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    // upon method call, given two integers 'n1' and 'n2', execute the following:
    public static void swap(int n1, int n2) {
        System.out.println("\tInside the swap method");
        // display values of 'n1' && 'n2' prior to swapping
        System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
        // swapping algorithm
        int temp = n1;
        n1 = n2;
        n2 = temp;
        // display values of 'n1' && 'n2' after swapping
        System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}
