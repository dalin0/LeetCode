package hot100.No_206反转链表;

public class test {

     static class Node {

        public int val;
        public Node next;

    }

    public static void main(String[] args) {
        Node head = new Node();
        Node p = head;
        p.val = 1;
        for (int i = 2; i < 21; i++) {
            Node node = new Node();
            p.next = node;
            node.val = i;
            p = p.next;
        }
//        Node now = head;
//        while(now != null) {
//            System.out.println(now.val);
//            now = now.next;
//        }
        Node test = reverse(head);
        while (test != null) {
            System.out.println(test.val);
            test = test.next;
        }
    }
    public static Node reverse(Node head){
        if(head == null) return null;
        Node now = head;
        Node pre = null;
        while (now != null) {
            Node nextNode = now.next;
            now.next = pre;
            pre = now;
            now = nextNode;
        }
        return pre;
    }
}
