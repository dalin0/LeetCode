package hot100.No_215数组中的第K个最大元素;

import java.util.*;

public class findKthLargest {

    public static int findKthLargest(int[] nums, int k) {
        /**
         * @方法一：
         *          调用库函数排序，直接输出第k大的数
         *          Arrays.sort(nums);
         *          return nums[nums.length - k];
         */

        /**
         * @方法二： 堆排序
         * @思路：
         *          1、根据堆的特性，比如拿小根堆解题，对顶元素永远是当前堆中最小的元素
         *          2、用nums构建一个小顶堆，让堆顶不停的poll() 弹出
         *          3、假设nums长度为 n ，就弹出 n-k 个元素，剩下的就是倒数 k 个最大的元素了
         *          4、此时的堆顶就是我们要找的第 k 大元素
         */
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // 小顶堆
        for (int item : nums){
            pq.add(item);
            // 不断往小顶堆里面加元素，当大于k个的时候，就在加元素的时候不断的弹出堆顶，因为他永远是最小的
            if (pq.size() > k){
                pq.poll(); // 取得当前堆顶元素并且将其从堆中删除
            }
        }
        System.out.println(pq);
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] nums = new int[] {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }

}
