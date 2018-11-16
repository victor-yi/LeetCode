package problems;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        ListNode secondNode = new ListNode(4);
        ListNode thirdNode = new ListNode(3);
        secondNode.next = thirdNode;
        node.next = secondNode;
        
        printListNode(removeNthFromEnd(node, 2));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (n == 0) {
            return head;
        }

        List<ListNode> list = new ArrayList<>();

        while (head != null) {
            list.add(head);
            head = head.next;
        }

        if (list.size() == n) {
            return list.get(0).next;
        } else {
            if (n == 1) {
                list.get(list.size() - n - 1).next = null;
            } else {
                list.get(list.size() - n - 1).next = list.get(list.size() - n + 1);
            }
        }

        return list.get(0);
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
