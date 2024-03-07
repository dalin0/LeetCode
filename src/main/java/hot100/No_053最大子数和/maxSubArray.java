package hot100.No_053最大子树和;

import java.util.regex.Matcher;

/**
 * @题目：给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 */

/**
 * @思路： 1、先设置两个变量，一个最大值，一个连续区间中数字的总和
 *         2、然后开始遍历，遍历的时候就进行相加，若是相加之后的数，小于 当前位置的数
 *         3、用max（）函数比较，小于则重新从 当前数开始计算区间
 *         4、然后将得到的区间数的总和与最大值进行比较
 *
 *
 * @总结： 开始遍历，从第一个开始相加，相加后与当前位置的数进行比较，大于当前位置数则保留（比较当前位置和相加总数的大小）
 *         若是相加之后小于当前位置的数，则放弃相加之后的数，从当前位置的数开始重新计算区间
 */

/**
 * @链接： https://www.bilibili.com/video/BV1vm4y1U7tR/
 */

public class maxSubArray {

    public int maxSubArray(int[] nums) {
        int sum = -10001;
        int max = -10001;
        for (int i = 0; i < nums.length; i++) {
            //判断要不要将当前的 i 放入sum表示的区间
            sum = Math.max(sum + nums[i], nums[i]);
            // 将当前的sum 和 max 进行比较
            max = Math.max(sum, max);
        }
        return max;
    }

}
