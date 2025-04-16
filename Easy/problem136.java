package Easy;

import java.util.Arrays;

/**
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 */
public class problem136 {

    /**
     * @param nums arrays de numeros dado
     * @return  el numero que que no aparece 2 veces
     * @see https://leetcode.com/problems/single-number/description/
     */
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
