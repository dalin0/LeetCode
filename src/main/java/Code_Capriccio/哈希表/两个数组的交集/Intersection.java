package Code_Capriccio.哈希表.两个数组的交集;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        int k = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                resSet.add(nums2[i]);

            }
        }
        int[] res = new int[resSet.size()];
        for (Integer element : resSet) {
            res[k++] = element;
        }
        return res;
    }

    /**
     * 利用hash数组解决
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection2(int[] nums1, int[] nums2) {
        int[] hash1 = new int[1002];
        int[] hash2 = new int[1002];
        for (int i = 0; i < nums1.length; i++) {
            hash1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            hash2[nums2[i]]++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1002; i++) {
            if (hash1[i] > 0 && hash2[i] > 0) {
                list.add(i);
            }
        }
        int index = 0;
        int[] res = new int[list.size()];
        for (Integer e : list) {
            res[index++] = e;
        }
        return res;

    }
}
