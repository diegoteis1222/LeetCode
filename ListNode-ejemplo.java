import java.util.ArrayList;
import java.util.List;

//Ejemplo de ListNode echo por IA, solo para entender ListNode, no entregar!!
class Solution {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode actual = head;
        List<Integer> list = new ArrayList<>();

        while (actual != null) {
            list.add(actual.val);
            actual = actual.next;
        }

        int i = 0;

        while (i < list.size()) {
            if (i > 0 && list.get(i) == list.get(i - 1)) {
                list.remove(i);
            } else {
                i++;
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

    public static void main(String[] args) {
        // Crear una lista enlazada de ejemplo: 1 -> 2 -> 2 -> 3 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Lista original:");
        printList(head); // Imprime la lista original: 1 -> 2 -> 2 -> 3 -> 3 -> null

        // Eliminar duplicados
        head = deleteDuplicates(head);

        System.out.println("Lista después de eliminar duplicados:");
        printList(head); // Debería imprimir: 1 -> 2 -> 3 -> null
    }

    // Para usar ListNode
    static class ListNode {
        int val;
        ListNode next;

        // Constructor
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Para mostrar un ListNode
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}