/**
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class problem28 {

    /**
     * @param haystack palabra dada
     * @param needle lo que buscar en la palabra
     * @return la posicion donde se esta la palabra buscada, si no hay esta será -1
     * @see https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
     */
    static public int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }
}
