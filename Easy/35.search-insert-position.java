package Easy;
/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    /**
     * @param nums   array de numeros dado
     * @param target numero a buscar
     * @return si está devuelve su posicion, si no devuelve donde debería estar
     */
    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) { // recorre el array de numeros
            if (nums[i] == target) { // si el numero en i es el que buscamos lo devuelve
                return i;
            } else if (nums[i] > target) { // si el numero en i es mayor que el buscado lo devuelve
                return i;
            }
        }
        return nums.length; // si no es el anterior, es el ultimo
    }
}
// @lc code=end
