package Easy;
/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    /**
     * @param nums array de numeros dado
     * @return la cantidad de elementos unicos, elimina los duplicados de un array
     */
    public static int removeDuplicates(int[] nums) {
        int cont = 1; // contador

        for (int i = 0; i < nums.length; i++) { // recorre el array
            if (nums[i] != nums[cont - 1]) { // si el numero en i es igual al contador - 1
                nums[cont] = nums[i]; // el numero en la posicion del contador se vuelve el de la posicion i
                cont++; 
            }
        }
        return cont;
    }
}
// @lc code=end
