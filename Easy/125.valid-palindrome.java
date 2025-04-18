package Easy;
/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    /**
     * @param s string dado
     * @return true si es un palindromo, false si no lo es
     */
    static public boolean isPalindrome(String s) {

        String first = s.replaceAll("[^a-zA-Z0-9]", ""); // elimina todo lo que no sean caracteres alfanumericos

        StringBuilder reversed = new StringBuilder(first); // crea un stringbuilder con el string anterior
        reversed.reverse(); // le da la vuelva al string builder

        String second = reversed.toString(); // crea un string con el stringbuilder

        return first.toLowerCase().equals(second.toLowerCase()); // devuelve la comparacion de los strings
    }
}
// @lc code=end

