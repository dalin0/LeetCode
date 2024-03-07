package hot100.No_234回文链表;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode left;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        // 将所有的结点的值另存在数组中
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while(left < right){
            if(list.get(left) != list.get(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
