package hot100.test;

import java.util.ArrayList;
import java.util.List;

public class FindMaxArray {
    public static int FindGreatest(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        int curSum = 0;
        int maxSum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNum){
                maxNum = array[i];

            }
        }
        System.out.println("");
        if(maxNum <= 0){
            return maxNum;
        }

        for (int i = 0; i < array.length; i++) {
            if(curSum <= 0){
                curSum = array[i];
            }else{
                curSum = curSum + array[i];
            }
            if(curSum > maxSum){
                maxSum = curSum;
            }
        }
        return maxSum;
    }

    /**
     * @方法二：动态规划
     */
    public static int dp_Max(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int len = array.length;
        int[] dp = new int[len];
        dp[0] = array[0];
        int res = 0;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(array[i] + dp[i - 1], array[i]);
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(FindGreatest(array));
//        System.out.println(dp_Max(array));
    }
}
