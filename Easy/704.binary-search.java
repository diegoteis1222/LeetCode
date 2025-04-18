package Easy;
/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

import java.util.Arrays;

// @lc code=start
class Solution {

    /**
     * @param nums   array de numeros dado
     * @param target numero a buscar
     * @return la posicion del numero encontrado, en caso de no estar, devuelve -1
     */
    public int search(int[] nums, int target) {

        Arrays.sort(nums); // ordenao el array

        int start = 0;
        int end = nums.length - 1;
        // variables necesarias

        while (start <= end) { // mientras inicio sea mayor que final
            int mid = (start + end) / 2; // cre la variable mid siendo la mitad de la suma de fin mas inicio

            if (nums[mid] == target) { // si el numero del array en la posicion mid es el buscado devuelve su posicion 
                return mid;
            } else if (nums[mid] < target) { // si el numero del array en la posicion mid es menor, el inicio se vuelve la mitad mas 1
                start = mid + 1;
            } else {
                end = mid - 1; // si no el final se vuelve la mitad - 1
            }

        }

        return -1;
    }
}

// @lc code=end
