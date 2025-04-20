package Easy;
/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {

    /**
     * @param n numero dado para contar sus bits
     * @return un array con el numero de bits de cada numero hasta llegar al indicado
     */
    public int[] countBits(int n) {

        int[] bin = new int[n + 1]; // creamos nuevo array

        for (int i = 0; i <= n; i++) { // recorremos el array tantas veces como n sea

            int cont = 0; // contador
            int num = i; // recogemos el valor de i 

            while (num > 0) { // minetras el numero no sea 0
                int bit = num % 2; // el bit es el resto de dividir el numero entre 2
                if (bit == 1) {
                    cont++; // si el bit es 1 suma uno al contador
                }
                num /= 2; // divide el numero entre 2
            }

            bin[i] = cont; // a la posicion del nuevo array en i le damos el valor del contador
        }

        return bin;
    }
}
// @lc code=end
