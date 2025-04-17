package Easy;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    /**
     * @param nums   array de numeros
     * @param target numero objetivo que obtenemos sumando dos numeros del array
     * @return los dos numeros que sumados dan el target
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) { // recorrer el array entero

            for (int j = i + 1; j < nums.length; j++) { // recorrerlo de nuevo pero evitanto sumarse a si mismo

                if (nums[j] == target - nums[i]) // si el numero en posicion j es igual a restar al numero objetivo el numero en posicion

                    return new int[] { i, j }; // Buena forma de devolver
            }
        }
        return new int[] {}; // por si acaso
    }
}
// @lc code=end
