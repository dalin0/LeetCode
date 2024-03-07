package Code_Capriccio.哈希表.四数相加;

import java.util.HashMap;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1) {
            for (Integer j : nums2) {
                int sumAB = i + j;
                if (map.containsKey(sumAB)) {
                    map.put(sumAB, map.get(sumAB) + 1);
                } else {
                    map.put(sumAB, 1);
                }
            }
        }
        for (Integer k : nums3) {
            for (Integer l : nums4) {
                int sumCD = -(k + l);
                if (map.containsKey(sumCD)) {
                    res += map.get(sumCD);
                }
            }
        }
        return res;
    }
}
