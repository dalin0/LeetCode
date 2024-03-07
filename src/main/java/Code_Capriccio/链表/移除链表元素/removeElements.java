package Code_Capriccio.链表.移除链表元素;

import java.util.List;

public class removeElements {
    class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
//        if(head == null && head.val == val) return head.next;
//        ListNode cur = head;
//        while(cur.next != null) {
//            while(cur.next != null && cur.next.val == val) {
//                cur.next = cur.next.next;
//            }
//            cur = cur.next;
//        }
//        return head;
        // 添加虚拟节点，pre 和 cur
        if(head == null) return null;
        ListNode node = new ListNode(-1, head);
        ListNode pre = node;
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return node.next;
//        if (head == null) {
//            return head;
//        }
//        // 因为删除可能涉及到头节点，所以设置dummy节点，统一操作
//        ListNode dummy = new ListNode(-1, head);
//        ListNode pre = dummy;
//        ListNode cur = head;
//        while (cur != null) {
//            if (cur.val == val) {
//                pre.next = cur.next;
//            } else {
//                pre = cur;
//            }
//            cur = cur.next;
//        }
//        return dummy.next;
    }
}
