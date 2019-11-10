package problems;

public class Q24_SwapNodesInPairs {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        thirdNode.next = fourthNode;
        secondNode.next = thirdNode;
        node.next = secondNode;
        node = swapPairs(node);
        printListNode(node);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode copy = head;
        ListNode last = head;
        int i = 1;
        while (head != null && head.next != null) {
            ListNode first = head;
            head = head.next;
            first.next = head.next;
            head.next = first;
            if (i == 1) {
                copy = head;
            } else {
                last.next = head;
            }
            i++;
            head = first.next;
            last = first;
        }

        return copy;
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
