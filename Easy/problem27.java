package Easy;

/**
 * Given an integer array nums and an integer val, remove all occurrences of
 * val
 * in nums in-place. The order of the elements may be changed. Then return the
 * number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to
 * get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val. The remaining elements of nums are not
 * important as well as the size of nums.
 * Return k.
 * 
 */
public class problem27 {
    /**
     * @param nums Array de numeros dado
     * @param val  valor a eliminar
     * @return la cantidad de veces eliminado el numero
     */
    public static int removeElement(int[] nums, int val) {
        int cont = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[cont] = nums[i];
                cont++;
            }
        }
        return cont;
    }
}
