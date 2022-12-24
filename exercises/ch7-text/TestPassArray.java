public class TestPassArray {
    public static void main(String[] args) {
        int[] a = { 1, 2 };

        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
/** Summary:
 * Example of how arrays are passed by 'reference' instead of 'value' like primitive type variables are.
 * In the method "swap()" above, the indices [0] && [1] are passed to "swap",
 * but since "swap" doesn't actually change the values of the indices themselves, there is no change to locations [0] && [1]
 * In "swapFirstTwoInArray()" the array [a] itself is passed to the method and the method writes over the previous
 * values, changing them and succeeding in swapping the numbers. */
/** KEY TAKEAWAYS:
 * - Arrays are 'passed by reference' which means that there is only one object created and the values that pass
 * between methods is a reference pointer to the actual value of the array in memory. The values aren't being copied
 * like they are with primitive type variables like, int, double, etc. */
