public class ch7Exercises {
    public static void main(String[] args) {
        // Exercise07_02();
    }

    /** Reverse the numbers entered.
     * write a program that reads 10 integers and displays them in reverse order. */
    public static void Exercise07_02() {
        // declare && initialize array
        int[] list = new int[10];
        int swap = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = i;

        } // display array contents in reverse order
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[(list.length - 1) - j]);
        }
        System.out.println();
    }
}
