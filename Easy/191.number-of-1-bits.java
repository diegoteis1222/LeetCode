package Easy;
/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {

    /**
     * @param n numero dado
     * @return la cantidad de bit del numero dado
     */
    static public int hammingWeight(int n) {

        int cont = 0; // contador

        while (n > 0) { // minetras el numero no sea 0
            int bit = n % 2; // el bit es el resto de dividir el numero entre 2
            if (bit == 1) { 
                cont++; // si el bit es 1 suma uno al contador
            }
            n /= 2; // divide el numero entre 2

        }

        return cont; 

    }

}
// @lc code=end
