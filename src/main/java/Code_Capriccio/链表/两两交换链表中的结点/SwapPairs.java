package Code_Capriccio.链表.两两交换链表中的结点;

import Code_Capriccio.链表.翻转链表.reverseList;

public class SwapPairs {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val){}
        ListNode(int val, ListNode next){}
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode pre = node;
        ListNode cur = head;
        ListNode nextNode;
        while (cur != null) {
            if(cur.next == null) break;
            nextNode = cur.next;
            pre.next = cur.next;
            cur.next = nextNode.next;
            nextNode.next = cur;
            pre = cur;
            cur = cur.next;
        }
        return node.next;
    }
}
