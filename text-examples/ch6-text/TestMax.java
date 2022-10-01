public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        // int k is assigned the value of the max of variables i && j
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    // upon method call, given two integers, num1 && num2 - do the following:
    public static int max(int num1, int num2) {
        // 'result' is an int that has been initialized but yet to be defined
        int result;
        // if num1 > num 2, assign the value of num1 to 'result'
        if (num1 > num2)
            result = num1;
        // if num <= num2 assign the value of num2 to 'result'
        else
            result = num2;
        // return the value of 'result' to the caller
        return result;
    }
}