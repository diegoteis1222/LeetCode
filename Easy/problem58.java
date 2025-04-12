package Easy;

/**
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * 
 * A word is a maximal substring consisting of non-space characters only.
 */
public class problem58 {

    /**
     * @param s Frase que se le da
     * @return cantidad de letras de la ultima palabra de la frase dada
     * @see https://leetcode.com/problems/length-of-last-word/description/
     */
    public static int lengthOfLastWord(String s) {

        String[] split = s.split(" ");
        String last = split[split.length - 1];

        int cont = 0;

        for (int i = 0; i < last.length(); i++) {
            cont++;
        }

        return cont;
    }
}
