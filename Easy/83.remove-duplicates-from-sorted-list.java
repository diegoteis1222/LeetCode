package Easy;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start

//Definition for singly-linked list.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;

        ListNode copia = head;
        List<Integer> list = new ArrayList<>();

        while (copia != null && copia.next != null) {

            if (copia.val != copia.next.val) {
                list.add(copia.val);
            }
            copia = copia.next;
        }

        if (copia.next == null) {
            list.add(copia.val);
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

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
// @lc code=end
