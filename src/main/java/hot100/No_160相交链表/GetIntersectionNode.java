package hot100.No_160相交链表;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class GetIntersectionNode {

    /**
     * @解题思路：
     *          双指针，两个指针同时遍历，当指针指向为 null 的时候就切换到另外一个链表的头结点继续判断，
     *          直到两个指针指向同一个结点的时候就表示两个链表有相同的结点，这时退出循环直接返回当前的结点。
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while(p != q){
            p = (p == null ? headB : p.next);
            q = (q == null ? headA : q.next);
        }
        return q;
    }
}
