package Easy;
/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int ini = 0;

        for (int fin = 0; fin < nums.length; fin++) {
            if (nums[fin] != 0) {
                int temp = nums[fin];
                nums[fin] = nums[ini];
                nums[ini] = temp;
                ini++;
            }
        }
    }
}
// @lc code=end
