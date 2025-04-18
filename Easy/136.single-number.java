package Easy;
/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

import java.util.Arrays;

// @lc code=start
class Solution {
    /**
     * @param nums arrays de numeros dado
     * @return  el numero que que no aparece 2 veces
     */
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums); // ordena el array 

        for (int i = 0; i < nums.length - 1; i += 2) { // recorre el array de dos en dos
            if (nums[i] != nums[i + 1]) { // si el numero en i no es igual a su siguiente lo devuelve
                return nums[i];
            }
        }

        return nums[nums.length - 1]; // es el ultimo numero si lo anterior no funciona
    }
}
// @lc code=end

