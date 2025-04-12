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

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };

        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;

        System.out.println("Índice de " + target1 + ": " + searchInsert(nums, target1)); // Output: 2
        System.out.println("Índice de " + target2 + ": " + searchInsert(nums, target2)); // Output: 1
        System.out.println("Índice de " + target3 + ": " + searchInsert(nums, target3)); // Output: 4
        System.out.println("Índice de " + target4 + ": " + searchInsert(nums, target4)); // Output: 0
    }
}
