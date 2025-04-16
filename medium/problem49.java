package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem49 {
    static public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> motherList = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            char[] first = strs[i].toCharArray();

            Arrays.sort(first);

            for (int j = 0; j < strs.length; j++) {

                char[] second = strs[j].toCharArray();

                Arrays.sort(second);

                if (Arrays.equals(first, second)) {
                    new ArrayList<>().add(second);
                }

            }

        }

        return motherList;

    }

    public static void main(String[] args) {

        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagrams(strs));
    }
}
// motherList.add(Arrays.asList(nums[i], nums[j], nums[h]));