package Easy;
/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /**
     * @param head ListNode dado
     * @return el mismo ListNode pero invertido
     */
    public static ListNode reverseList(ListNode head) {

        ListNode reversed = null; // crea un listnode nuevo
        ListNode actual = head; // crea un listnode que es igual al anterior

        while (actual != null) { // mientras no lleguemos al ultimo nodo de actual
            ListNode siguiente = actual.next; // guardamos el siguiente nodo temporalmente en un lisnode
            actual.next = reversed; // Invertimos el puntero: actual ahora apunta al anterior
            reversed = actual; // Movemos reversed al nodo actual
            actual = siguiente; // Avanzamos actual al siguiente nodo (guardado antes)
        }

        return reversed;
    }
}
// @lc code=end

