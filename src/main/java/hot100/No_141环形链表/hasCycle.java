package hot100.No_141环形链表;

public class hasCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * @思路：
     *          1、设置一个快指针，一个慢指针，快指针每次走两步，慢指针一次走一步
     *          2、设置一个循环，fast不为空时，若fast == slow的时候，链表有环
     * @param head
     * @return
     */

    /**
     * @讲解链接： https://www.bilibili.com/video/BV1R5411b7nJ?spm_id_from=333.337.search-card.all.click&vd_source=52b395a10caa9649f10cfbd6b0b6651f
     * @param head
     * @return
     */

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
