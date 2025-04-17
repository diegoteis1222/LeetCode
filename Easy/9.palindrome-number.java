package Easy;
/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    /**
     * @param x el numero dado
     * @return true si es palindromo, false si no lo es
     */
    public boolean isPalindrome(int x) {

        StringBuilder num = new StringBuilder(String.valueOf(x)); // crea un stringbuilder con el numero

        String reversed = num.reverse().toString(); // crea un string con el stringbuilder dado la vuelta

        return String.valueOf(x).equals(reversed); // devuelve la comparacion de x siendo string con el string invertido

    }
}
// @lc code=end
