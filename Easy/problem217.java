import java.util.Arrays;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 */
public class problem217 {

    /**
     * @param nums array de ints dado
     * @return true si hay algun numero duplicado, false si no lo hay
     * @see https://leetcode.com/problems/contains-duplicate/description/
     */
    static public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
