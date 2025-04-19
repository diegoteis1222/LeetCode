public class pruebas {

    // clase ListNode
    public class ListNode {
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

    static public int hammingWeight(int n) {
        
        String paco = Integer.toBinaryString(n);

        System.out.println(paco);
        return 0;
    }

    public static void main(String[] args) {
        hammingWeight(11);
    }

}
