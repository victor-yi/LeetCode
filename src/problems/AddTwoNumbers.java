package problems;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        ListNode secondNode = new ListNode(4);
        ListNode thirdNode = new ListNode(3);
        secondNode.next = thirdNode;
        node.next = secondNode;

        ListNode nodeA = new ListNode(5);
        ListNode secondNodeA = new ListNode(6);
        ListNode thirdNodeA = new ListNode(1);
        secondNodeA.next = thirdNodeA;
        nodeA.next = secondNodeA;

        printListNode(addTwoNumbers(node, nodeA));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(Integer.MIN_VALUE);
        ListNode first = l1;
        ListNode second = l2;
        ListNode current = node;
        int ascent = 0;
        while (first != null || second != null) {
            int i = first == null ? 0 : first.val;
            int j = second == null ? 0 : second.val;
            ascent = ascent + i + j;

            current.next = new ListNode(ascent % 10);
            current = current.next;
            ascent = ascent / 10;

            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }

        if (ascent > 0) {
            current.next = new ListNode(ascent);
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
        ListNode(int x) { val = x; }
    }

}