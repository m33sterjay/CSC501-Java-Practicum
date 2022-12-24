public class TestSearchAndSort {
    public static void main(String[] args) {
        double[] list = { 1, 9, 4.5, 6.6, 5.7, -4.5 };
        double[] copy = { list.length };
        SearchAndSort.selectionSort(list);
        System.out.println(list);
    }
}
