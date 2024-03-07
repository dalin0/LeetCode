package hot100.No_001两数之和;

import java.util.HashMap;

/**
 * @题目：给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * 示例：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */


/**
 * @思路：
 *      1、遍历数组的同时通过 map 结构记录每个数字的下标
 *      2、判断当前位置的数字是不是满足条件： target - nums[i] 的值是不是在我们之前遍历的结果之中
 *          即： map 中包含了 target - nums[i]
 *      3、如果包含了，就将该 nums[i]在 map 中对应的下标，以及当前数字的下标保存在新申请的数组中
 *      4、最后返回该数组
 */

/**
 * @讲解链接：
 *      https://www.bilibili.com/video/BV1tK4y1u7bo?spm_id_from=333.851.header_right.history_list.click&vd_source=52b395a10caa9649f10cfbd6b0b6651f
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                num[0] = i;
                num[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return num;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{3,2,4};
        int target = 6;
        int[] list = twoSum(numbers, target);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
