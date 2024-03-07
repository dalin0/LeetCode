package Code_Capriccio.哈希表.四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    /**
     * 四数之和，在三数之和的基础上添加一个下标，多嵌套一个for循环，然后对前两个单独去重
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] > target) {
                return resList;
            }
            // 对下标i的数进行去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int k = i + 1; k < nums.length; k++) {
                if (k > i + 1 && nums[k] == nums[k - 1]) {
                    continue;
                }
                int left = k + 1, right = nums.length - 1;
                while ( left < right) {
                    int sum = 0;
                    sum = nums[i] + nums[k] + nums[left] + nums[right];
                    if (left < right && sum > target) {
                        right--;
                    }else if (left < right && sum < target) {
                        left++;
                    }else {
                        resList.add(Arrays.asList(nums[i], nums[k], nums[left], nums[right]));
                        // 找到第一个四元组时则开始对left 和 right 所指的数进行去重
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return resList;
    }
}
