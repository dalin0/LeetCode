package Code_Capriccio.链表.环形链表II;

import Code_Capriccio.链表.删除链表中的倒数第N个节点.RemoveNthFromEnd;
import jdk.internal.org.objectweb.asm.util.CheckAnnotationAdapter;

import java.util.HashMap;
import java.util.List;

public class DetectCycle {
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
    public static void main(String[] args) {
        char[] s = new char[0];
        int n = s.length;
        String s1 = null;
        int m = s1.length();
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                ListNode index1 = fast;
                ListNode index2 = head;
                while(index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index2;
            }
        }
        return  null;
    }
}
