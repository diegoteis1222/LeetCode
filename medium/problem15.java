package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem15 {

    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
    
        List<List<Integer>> motherList = new ArrayList<>();
    
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
    
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
    
                for (int h = j + 1; h < nums.length; h++) {
                    if (h > j + 1 && nums[h] == nums[h - 1]) continue;
    
                    if (nums[i] + nums[j] + nums[h] == 0) {
                        motherList.add(Arrays.asList(nums[i], nums[j], nums[h]));
                    }
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
