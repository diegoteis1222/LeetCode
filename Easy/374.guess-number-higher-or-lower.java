package Easy;
/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is higher than the picked number
 *         1 if num is lower than the picked number
 *         otherwise return 0
 *         int guess(int num);
 */

class Solution {

    static int pick = 42; // solo sirve para testear

    /**
     * Esta funcion es dada por LeetCode
     * @param num numero dado para comprobar
     * @return 0 si es igual, -1 si es mayor y 1 si es menor
     */
    static int guess(int num) {
        if (num == pick)
            return 0;
        if (num > pick)
            return -1;
        return 1;
    }

    /**
     * Este metodo usa binary shearch
     * @param n numero que le damos
     * @return // devuelve el numero si lo adivinamos
     */
    public int guessNumber(int n) {

        int start = 0;
        int end = n;
        // variables necesarias

        while (start <= end) { // recorre todos los numeros hasta llegas al indicado
            int mid = start + (end - start) / 2; // mejor forma de llegar al medio

            int target = guess(mid); // almacena si es acertado o no

            if (target == 0) { // si es acertado devuelve el numero
                return mid;
            } else if (target == 1) { // si es menor hace que el inicio sea la mitad del numero + 1
                start = mid + 1;
            } else {
                end = mid - 1; // si es mayor hace que el final sea la mitad del numero - 1
            }

        }

        return -1;

    }
}
// @lc code=end
