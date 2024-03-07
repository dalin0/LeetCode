package Code_Capriccio.链表.翻转链表;

public class reverseList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 双指针法
     */
//    public ListNode reverseList(ListNode head) {
//        if (head == null) return null;
//        ListNode nextNode;
//        ListNode now = head;
//        ListNode pre = null;
//        while (now != null){
//            // 暂存下一个结点
//            nextNode = now.next;
//            now.next = pre;
//            pre = now;
//            now = nextNode;
//        }
//        return pre;
//    }

    /**
     * 递归法
     * @return
     */
    public static ListNode reverse(ListNode pre, ListNode cur){
        if (cur == null) return pre;
        ListNode nowNode = cur.next;
        cur.next = pre;
        return reverse(cur, nowNode);
    }
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }
}
