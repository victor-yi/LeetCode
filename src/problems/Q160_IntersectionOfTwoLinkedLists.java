package problems;

public class Q160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode na = headA;
        ListNode nb = headB;
        while (na != nb) {
            na = na != null ? na.next : headB;
            nb = nb != null ? nb.next : headA;
        }
        return na;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
