package Easy;
/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {

        if (n <= 0) 
            return false; // si el numero es 0 o menor de 0 devuelve false

        int[] factores = { 2, 3, 5 }; // numeros para saber si un numero es feo

        for (int factor : factores) { // por cada numero en factores
            while (n % factor == 0) { // mientras el resto de la division sea 0
                n /= factor; // lo divide por el factor
            }
        }

        return n == 1; // si se cumple lo anterior el numero deberia ser 1 para el final
    }
}
// @lc code=end
