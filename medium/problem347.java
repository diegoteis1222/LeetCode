package medium;

import java.util.Arrays;

public class problem347 {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        int cont = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                cont++;
            }
        }

        return nums;
    }
}
