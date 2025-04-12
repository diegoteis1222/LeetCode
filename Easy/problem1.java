package Easy;

/**
 * * Given an array of integers nums and an integer target, return indices of
 * the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 */
public class problem1 {
    /**
     * @param nums   array de numeros
     * @param target numero que queremos sumando dos numeros del array
     * @return los dos numeros que sumados dan el target
     * @see https://leetcode.com/problems/two-sum/description/
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i])
                    return new int[] { i, j }; // Buena forma de devolver
            }
        }
        return new int[] {};
    }
}
