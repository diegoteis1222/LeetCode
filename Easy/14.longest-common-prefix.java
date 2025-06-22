/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String prefijo = strs[0];

        for (int i = 0; i < strs.length; i++) {

            while (strs[i].indexOf(prefijo) != 0) {

                prefijo = prefijo.substring(0, prefijo.length() - 1);

                if (prefijo.isEmpty())
                    return "";
            }
        }

        return prefijo;
    }
}
// @lc code=end
