public class BinarySearch {
    public static void main(String[] args) {
        int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
        int i = binarySearch(list, 2);
        int j = binarySearch(list, 11);
        int k = binarySearch(list, 12);
        int l = binarySearch(list, 1);
        int m = binarySearch(list, 3);

        System.out.printf("%d\n%d\n%d\n%d\n%d\n", i, j, k, l, m);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else
                low = mid + 1;
        }
        return -low - 1;
    }
}
/** Summary: **IMPORTANT - requires array to be SORTED**
 * A program that sorts an array by finding the mid point of the array, determines if 'key' < 'mid' or <
 * and then changes the 'high'/'low' values to search in the corresponding half.
 * It continues on like this until the 'key' is matched, or it determines the 'key' is not in the array,
 * at which point 'low' would equal the place above where the value of 'key' would be in the list
 * and returns -low - 1; which tells where 'key' would be located if it was in the array. */
/** TAKEAWAYS :
 * - binary search is equivalent to log_2n, need log_2n+1 comparisons to find 'key' */