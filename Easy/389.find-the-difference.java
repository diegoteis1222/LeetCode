package Easy;
/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {

        char[] primero = s.toCharArray();
        char[] segundo = t.toCharArray();

        Arrays.sort(primero);
        Arrays.sort(segundo);

        for (int i = 0; i < s.length(); i++) {

            if (primero[i] != segundo[i]) {
                return segundo[i];
            }
        }
        return segundo[segundo.length - 1];
    }
}
// @lc code=end
