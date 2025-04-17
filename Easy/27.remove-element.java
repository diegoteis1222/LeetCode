package Easy;
/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    /**
     * @param nums Array de numeros dado
     * @param val  valor a eliminar
     * @return la cantidad de veces eliminado el numero
     */
    public static int removeElement(int[] nums, int val) {
        int cont = 0; // contador

        for (int i = 0; i < nums.length; i++) { // recorre el array

            if (nums[i] != val) { // si el numero en posicion i no es el valor
                nums[cont] = nums[i]; // el numero en posicion del contador para a ser el numero en i
                cont++;
            }
        }
        return cont;
    }
}
// @lc code=end

