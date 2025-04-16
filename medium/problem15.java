package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem15 {

    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> motherList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[i] + nums[j] + nums[j] == 0) {

                    motherList.add(Arrays.asList(nums[i], nums[j], nums[j + 1]));
                    
                }

            }
        }

        return motherList;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));

    }
}

// motherList.add(Arrays.asList(nums[i], nums[j], nums[h]));