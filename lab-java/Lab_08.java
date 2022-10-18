/** Lab_08-CS501 - Jared Robbins
 * A program that, given an array of integers, returns two indices of the numbers
 * such that they add up to a target value.
 * - Only one pair of indices add up to the target value
 * - Cannot use the same index twice
 * - Answer: the two correct indices in any order */
public class Lab_08 {
    public static void main(String[] args) {
        int[] nums = { 5, 10, 3, 2, 7, 8, 9 };

        int target = 14;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            index1 = nums[i];
            for (int j = 0; j < nums.length; j++) {
                index2 = nums[j];
                if (index1 == index2) {
                    continue;
                } else if (index1 + index2 == target) {
                    break;
                } else
                    continue;
            }
        }
        // Your code here
        System.out.println("[" + index1 + "," + index2 + "]");
    }
}
