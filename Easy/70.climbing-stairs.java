package Easy;
/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {

        if (n <= 1) {
            return 1;
        }

        int peldaño1 = 1;
        int peldaño2 = 1;
        int formas = 0;

        for (int i = 2; i <= n; i++) {

            formas = peldaño1 + peldaño2;
            peldaño2 = peldaño1;
            peldaño1 = formas;
        }

        return formas;

    }
}
// @lc code=end
