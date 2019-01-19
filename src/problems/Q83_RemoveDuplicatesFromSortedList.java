package problems;

public class Q83_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        secondNode.next = thirdNode;
        node.next = secondNode;

        node = deleteDuplicates(node);
        printListNode(node);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                if (current.next.next != null) {
                    current.next = current.next.next;
                } else {
                    current.next = null;
                }
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printListNode(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            sb.append(",");
            node = node.next;
        }
        System.out.println(sb.toString());
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
