package Easy;

import java.util.Arrays;

/**
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class problem704 {

    /**
     * @param nums array de numeros dado
     * @param target numero a buscar
     * @return la posicion del numero encontrado, en caso de no estar, devuelve -1
     */
    public int search(int[] nums, int target) {

        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
