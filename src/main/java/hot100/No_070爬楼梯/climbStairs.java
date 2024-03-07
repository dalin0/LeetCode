package hot100.No_070爬楼梯;

public class climbStairs {
    // 对于 i 阶台阶，到达 i 阶台阶的上一次状态是什么
    /**
     * 第一种： i - 1 阶
     *  1:  i - 1 - 1
     *  2:  i - 1 - 2
     */

    /**
     * 第二种： i - 2 阶
     */
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            // 对于阶梯数目为 i 的方法总数， 他是从 i - 1 跳了一步的方式加上 i - 2 跳了两步过来的
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    /**
     * @方法二： 递归
     */
    private int[] dp;

    private int sum(int x){
        if(x <= 2) return x;
        if(dp[x] != -1) return dp[x];
        dp[x - 1] = sum(x - 1);
        dp[x - 2] = sum(x - 2);
        return sum(x - 1) + sum(x - 2);
    }

    public int climbStairs2(int n) {
        dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = -1;
        }
        return sum(n);
    }
}
