package Easy;

/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class problem35 {

    /**
     * @param nums array de numeros dado
     * @param target numero a buscar 
     * @return si está devuelve su posicion, si no devuelve donde debería estar
     * @see https://leetcode.com/problems/search-insert-position/
     */
    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
