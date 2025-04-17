package Easy;
/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    /**
     * @param haystack palabra dada
     * @param needle   lo que buscar en la palabra
     * @return la posicion donde se esta la palabra buscada, si no hay esta será -1
     */
    static public int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) { // si el string contiene la palabra buscado
            return haystack.indexOf(needle); // devuelve su indice
        }

        return -1;
    }
}
// @lc code=end

