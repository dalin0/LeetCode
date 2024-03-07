package Code_Capriccio.哈希表.两数之和;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                res[0] = i;
                res[i] = map.get(target - nums[i]);
            }
                map.put(nums[i], i);
        }
        return res;
    }

}
