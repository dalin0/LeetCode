package hot100.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Test {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();

        return list3;
    }

    public static void main(String[] args) {
       ListNode list1 = new ListNode();
       ListNode list2 = new ListNode();
       Test test = new Test();
       test.insert(list1, 1);
       test.insert(list1, 2);
       test.insert(list1, 4);
       while(list1 != null){
           System.out.println(list1.val);
           list1 = list1.next;
       }


    }
    // 链表插入方法
    public void insert(ListNode head, int val){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ListNode m = new ListNode(val);
        ListNode p = head;
        m.next = p.next;
        p.next = m;
    }
}
