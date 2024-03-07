package Code_Capriccio.链表.删除链表中的倒数第N个节点;

import java.util.List;

public class RemoveNthFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode node = new ListNode(0, head);
        ListNode slow = head, fast = head;
        while(n-- > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return node.next;
    }
}
