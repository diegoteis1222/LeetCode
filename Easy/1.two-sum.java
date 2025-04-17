package Easy;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    /**
     * @param nums   array de numeros
     * @param target numero que queremos sumando dos numeros del array
     * @return los dos numeros que sumados dan el target
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
// @lc code=end
