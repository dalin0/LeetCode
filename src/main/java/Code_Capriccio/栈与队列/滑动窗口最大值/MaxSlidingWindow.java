package Code_Capriccio.栈与队列.滑动窗口最大值;

import java.util.Deque;
import java.util.LinkedList;

public class MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] resNum = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            // 队列对左边的，小于了滑动窗口的左边界的时候，要去除
            while (!deque.isEmpty() && deque.getFirst() < i - k) {
                deque.pollFirst();
            }
            if (i >= k - 1) {
                resNum[index++] = nums[deque.getFirst()];
            }
        }
        return resNum;
    }
}
