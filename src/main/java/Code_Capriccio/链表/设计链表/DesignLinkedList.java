package Code_Capriccio.链表.设计链表;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class DesignLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode (){}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.next = next;
            this.val = val;
        }
    }
    class MyLinkedList {
        int size;
        ListNode head;
        // 初始化
        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }
        public int get(int index) {
            if(index >= size || index < 0) return -1;
            ListNode cur = head;
            for(int i = 0 ; i <= index; i++){
                cur = cur.next;
            }
            return cur.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
            if(index > size) return ;
            if(index < 0) index = 0;

            ListNode cur = head;
            ListNode newNode = new ListNode(val);
            for(int i = 0 ; i < index; i++) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index >= size || index < 0) return;
            size--;
            ListNode cur = head;
            for(int i = 0 ; i < index; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }
}
