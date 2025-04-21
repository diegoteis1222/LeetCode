package Easy;
/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {

    /**
     * @param s Array de letras al que se le da la vuelta
     */
    public void reverseString(char[] s) {

        int cont = 0;

        char[] clon = s.clone();

        for (int i = s.length - 1; i >= 0; i--) {

            s[i] = clon[cont];
            cont++;
        }

    }
}
// @lc code=end
