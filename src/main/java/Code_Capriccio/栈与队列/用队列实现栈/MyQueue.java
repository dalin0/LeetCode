package Code_Capriccio.栈与队列.用队列实现栈;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {

    Deque<Integer> que1;

    public MyQueue() {
        que1 = new ArrayDeque<>();
    }

    public void push(int x) {
        que1.addLast(x);
    }

    public int pop() {
        int size = que1.size();
        size--;
        while (size-- > 0) {
            que1.addLast(que1.peekFirst());
            que1.pollFirst();
        }
        int res = que1.pollFirst();
        return res;
    }

    public int top() {
        return que1.pollFirst();
    }

    public boolean empty() {
        return que1.isEmpty();
    }
}
