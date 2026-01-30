package Easy;
/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    /**
     * @param list1 primer ListNode
     * @param list2 segundo ListNode
     * @return un ListNode que junta los dos anteriores ordenados
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode actual1 = list1;
        ListNode actual2 = list2;
        List<Integer> list = new ArrayList<>();

        while (actual1 != null && actual2 != null) {

            int num1 = actual1.val;
            int num2 = actual2.val;

            if (num1 < num2) {
                list.add(actual1.val);
                actual1 = actual1.next;
            } else {
                list.add(actual2.val);
                actual2 = actual2.next;
            }
        }

        if (actual1 == null) {
            while (actual2 != null) {
                list.add(actual2.val);
                actual2 = actual2.next;
            }
        } else {
            while (actual1 != null) {
                list.add(actual1.val);
                actual1 = actual1.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int num : list) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }
}
// @lc code=end
