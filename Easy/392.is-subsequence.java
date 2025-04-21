package Easy;
/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {

        boolean sub = false;

        String[] letters = s.split("");

        for (int i = 0; i < letters.length; i++) {
            sub = false;
            if (t.contains(letters[i])) {
                sub = true;
            }
        }

        return sub;
    }
}
// @lc code=end
