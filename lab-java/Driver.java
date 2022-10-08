/** Lab07 - CS501 - Jared Robbins
 * Given an array of integers called 'nums', return:
 * - a pair of indices such that the numbers add up to
 * - the maximum possible value
 * Only one pair of indices will add up to the maximum possible value
 * - cannot use the same index twice
 * The indices can appear in any order */
public class Driver {
    public static void main(String[] args) {
        int[] nums = { 5, 10, 3, 6, 7, 8, 9 };
        int index1 = 0, index2 = 0;

        java.util.Arrays.sort(nums);
        index1 = nums[nums.length - 1];
        index2 = nums[nums.length - 2];

        System.out.println("[" + index1 + "," + index2 + "]");

    }
}
