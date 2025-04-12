package Easy;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The
 * relative order of the elements should be kept the same. Then return the
 * number of unique elements in nums.
 * 
 * Consider the number of unique elements of nums to be k, to get accepted, you
 * need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * unique elements in the order they were present in nums initially. The
 * remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * 
 */
public class problem26 {
    /**
     * @param nums array de numeros dado
     * @return la cantidad de elementos unicos, elimina los duplicados de un array
     * @see https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
     */
    public static int removeDuplicates(int[] nums) {
        int cont = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[cont - 1]) {
                nums[cont] = nums[i];
                cont++;
            }
        }
        return cont;
    }
}
