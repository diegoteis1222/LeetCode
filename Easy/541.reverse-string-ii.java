package Easy;
/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {

        String toReverse = s.substring(0, k);

        String endWord = s.substring(k);

        char[] letters = toReverse.toCharArray();

        char[] clon = letters.clone();

        int cont = 0;

        for (int i = letters.length - 1; i >= 0; i--) {

            letters[i] = clon[cont];
            cont++;
        }

        String startWord = new String(letters);

        return startWord + endWord;

    }
}
// @lc code=end
