package Easy;

/**
 * Given the head of a singly linked list, reverse the list, and return the
 * reversed list.
 * 
 * La clase ListNode es dada por LeetCode
 */
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

public class problem206 {

    /**
     * @param head ListNode dado
     * @return el mismo ListNode pero invertido
     * @see https://leetcode.com/problems/reverse-linked-list/description/
     */
    public static ListNode reverseList(ListNode head) {

        ListNode reversed = null;
        ListNode actual = head;

        while (actual != null) {
            ListNode siguiente = actual.next;
            actual.next = reversed;
            reversed = actual;
            actual = siguiente;
        }

        return reversed;
    }
}
