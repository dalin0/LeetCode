package hot100.No_121买卖股票的最佳时机;

import java.util.regex.Matcher;

/**
 * @题目：
 *      给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *      你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *      返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */


/**
 * @思路：
 *      1、设置一个指针，专门用来指较小的值的下标
 *      2、对数组进行一次遍历，进行比较，将 i 所指的数与 指针 所指的数进行比较，若较小则将 i 的值赋予 指针
 *      3、若是 i 所指值大于指针所指值，进行  prices[i] - prices[in]与max比较取最大值
 */

public class maxProfit {

    public static int maxProfit(int[] prices) {
        int in = 0, out = 0;
        for (int i = 0; i < prices.length; i++) {
           if (prices[i] <= prices[in]){
               in = i;
           }else{
               out = Math.max(prices[i] - prices[in], out);
           }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
