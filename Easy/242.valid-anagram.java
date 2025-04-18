package Easy;
/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    /**
     * @param s primera palabra dada
     * @param t segunda palabra dada
     * @return si es un anagrama devuelve true, si no false
     */
    static public boolean isAnagram(String s, String t) {

        char[] first = s.toCharArray(); 
        char[] second = t.toCharArray();
        // crea arrays de chars de los Strings

        if (first.length != second.length) { // si no son igual de largos devuelve false
            return false;
        }

        Arrays.sort(first);
        Arrays.sort(second);
        // ordena los arrays de chars

        for (int i = 0; i < first.length; i++) { // recorre los arrays
            if (first[i] != second[i]) { // si las letras no son iguales devuelve false
                return false;
            }
        }

        return true; // si pasa todo lo anterior es true
    }
}
// @lc code=end

