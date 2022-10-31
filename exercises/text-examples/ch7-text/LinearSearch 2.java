public class LinearSearch {
    public static void main(String[] args) {
        int[] list = { 1, 4, 4, 2, 5, -3, 6, 2 };
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);

        System.out.printf("%d\n%d\n%d\n", i, j, k);
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
/** TAKEAWAYS :
 * - Searches the array one by one and when it finds a match to 'key' it returns that indice
 * - If it does not find a match, it returns '-1' */