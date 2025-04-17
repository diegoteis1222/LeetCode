package Easy;
/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    /**
     * @param s Frase que se le da
     * @return cantidad de letras de la ultima palabra de la frase dada
     */
    public static int lengthOfLastWord(String s) {

        String[] split = s.split(" "); // convierte en array de palabras la frase
        String last = split[split.length - 1]; // crea un string con la ultima palbra

        int cont = 0; // contador

        for (int i = 0; i < last.length(); i++) { //recorre la palabra
            cont++; // por cada letras suma 1 al contador
        }

        return cont;
    }
}
// @lc code=end
