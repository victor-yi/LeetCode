package problems;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(4);
        secondNode.next = thirdNode;
        node.next = secondNode;

        ListNode nodeA = new ListNode(1);
        ListNode secondNodeA = new ListNode(3);
        ListNode thirdNodeA = new ListNode(4);
        secondNodeA.next = thirdNodeA;
        nodeA.next = secondNodeA;

        printListNode(node);
        printListNode(nodeA);
        printListNode(mergeTwoLists(node, nodeA));

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 != null && l2 == null) {
            return l1;
        } else if (l1 == null && l2 != null) {
            return l2;
        }

        ListNode node = new ListNode(Integer.MIN_VALUE);
        ListNode current = node;
        while (true) {
            if (l1 != null && l2 != null) {
                if (l2.val >= l1.val) {
                    current.next = l1;
                    current = current.next;
                    if (l1.next == null) {
                        current.next = l2;
                        break;
                    } else {
                        l1 = l1.next;
                    }
                } else {
                    current.next = l2;
                    current = current.next;
                    if (l2.next == null) {
                        current.next = l1;
                        break;
                    } else {
                        l2 = l2.next;
                    }
                }
            } else {
                break;
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
        ListNode(int x) { val = x; }
    }
}
