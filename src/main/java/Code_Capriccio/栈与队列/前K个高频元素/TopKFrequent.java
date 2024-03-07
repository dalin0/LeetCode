package Code_Capriccio.栈与队列.前K个高频元素;

import java.util.*;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // 统计数字出现频率
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        // 找出出现频率最多的k个数, 在优先队列中存储二元组
        // 出现次数按从对头到队尾的顺序是从大到小排，出现次数最多的在对头（相当于打顶堆）
        PriorityQueue<int[]> queue = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(new int[] {entry.getKey(), entry.getValue()});
        }
        int[] resNum = new int[k];
        for (int i = 0; i < k; i++) {
            resNum[i] = queue.poll()[0];
        }
        return resNum;
    }
}
