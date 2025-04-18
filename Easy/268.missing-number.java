package Easy;
/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

import java.util.Arrays;

// @lc code=start
class Solution {

    /**
     * @param nums array de numeros dado
     * @return que numero falta en el array
     */
    public int missingNumber(int[] nums) {

        Arrays.sort(nums); // ordena los numero

        for (int i = 0; i < nums.length; i++) { // recorre los numeros de array
            if (i < nums[i]) { // si i es menor que el siguiente numero devuelve i
                return i; 
            }
        }

        return nums.length; // si no es el anterior si o si es el ultimo
    }
}
// @lc code=end
