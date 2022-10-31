public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
        System.out.println("Sum from 35 to 49 is " + sum(35, 49));

    }

    public static int sum(int i1, int i2) {
        // int result, initialized at constant 0
        int result = 0;
        // int i set to value of i1; while i is <= value of i2; increment i by one
        for (int i = i1; i <= i2; i++)
            // every successful loop, value of i is added to 'result' and then assigned to 'result'
            result += i;
        // return the value of result to method caller
        return result;
    }
}