package problems;

public class Q84_RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(2);
        secondNode.next = thirdNode;
        node.next = secondNode;

        node = deleteDuplicates(node);
        printListNode(node);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = new ListNode(head.val);
        ListNode current = node;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                int duplicateValue = head.val;
                head = head.next.next;
                while (head != null && head.val == duplicateValue) {
                    head = head.next;
                }
                if (head == null) {
                    current.next = head;
                }
            } else {
                current.next = head;
                current = current.next;
                head = head.next;
            }
        }

        return node.next;
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

        ListNode(int x) {
            val = x;
        }
    }
}
