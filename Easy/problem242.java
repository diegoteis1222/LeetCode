package Easy;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 */
public class problem242 {

    /**
     * @param s primera palabra dada
     * @param t segunda palabra dada
     * @return si es un anagrama devuelve true, si no false
     * @see https://leetcode.com/problems/valid-anagram/description/
     */
    static public boolean isAnagram(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        if (first.length != second.length) {
            return false;
        }

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }
}
