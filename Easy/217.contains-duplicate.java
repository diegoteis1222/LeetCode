package Easy;
/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    /**
     * @param nums array de ints dado
     * @return true si hay algun numero duplicado, false si no lo hay
     */
    static public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums); // ordena el array

        for (int i = 0; i < nums.length - 1; i++) { // recorre todos los numeros del array menos el ultimo (ya se hace el bucle)
            if (nums[i] == nums[i + 1]) { // si el numero anterior es igual al siguiente devuelve true
                return true;
            }
        }

        return false; // si no devuelve false
    }
}
// @lc code=end

