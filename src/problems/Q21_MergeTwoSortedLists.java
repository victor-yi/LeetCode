package problems;

public class Q21_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }

        ListNode node = new ListNode(Integer.MIN_VALUE);
        ListNode current = node;
        while (l1 != null && l2 != null) {
            if (l2.val >= l1.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 == null ? l2 : l1;

        return node.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
