package hot100.No_005最长回文子串;

/**
 * @题目： 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * @样例：
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 *
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 */

public class longestPalindrome {

    public static String longestPalindrome(String s) {
        int start = 0, max = 0, end = 0;
        int[][] dp = new int[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = 1;
        }
        for(int i = 0 ; i < s.length(); i++){
            for(int j = 0; j < i; j++){
                // 如果i 和 j 位置上的字符相同的条件下：
                // i == j + 1 => i 和 j相邻   或者   j的后一位和i的前一位字符也想同
                if (s.charAt(i) == s.charAt(j)){
                    if(i - j < 3){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i - 1][j + 1];
                    }
                    dp[i][j] = 1;
                }
                if(dp[i][j] == 1 && (i - j + 1 > max)){
                    max = i - j + 1;
                    start = j;
                    end = i;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * @方法二:
     * @param args
     */


    /**
     * @思路：动态规划（空间换时间）
     *      1、设置一个状态容器（一个 boolean的二维数组）
     *      2、初始化（每个单个的字符都是一个最小长度的回文串， dp[i][i] = 1）
     *      3、状态转移方程
     *      4、得到结果
     *      总体思路： 将 i = 1 到 i < len； j = 0 到 j < i 的状态容器填满
     *                当状态容器为 true 的时候，判断这个时候 i 和 j 的距离，
     *                i - j + 1 为当前成立的回文串的长度，然后与设置的最大长度相比取最大值
     *                如果 dp[i] 和 s[j] 相等， i - j >= 3 的时候，还要判断 i - 1 和 j + 1
     *                位置上的字符是否相等，则 dp[i][i] = dp[i - 1][j + 1]
     */

    /**
     * @讲解链接：https://www.bilibili.com/video/BV1AA411B7XV?spm_id_from=333.337.search-card.all.click&vd_source=52b395a10caa9649f10cfbd6b0b6651f
     * @param args
     */
    /**
     * @将状态容器填满
     */
    public static String longestPalindrome2(String s) {
        int len = s.length();
        if(len == 1){
            return s;
        }
        boolean[][] dp = new boolean[len][len];// 设置一个状态容器
        for (int i = 0; i < len; i++){// 初始化状态容器，将指针 i 和 j 指向同一个字符的位置设置为 true
            dp[i][i] = true;
        }
        int start = 0;
        int max = 1;
        char[] c = s.toCharArray();// 这里表达的是从 i 到 j 的一个子串
        for (int i = 1; i < len; i++){
            for(int j  = 0; j < i; j++){
                 if(c[i] != c[j]){
                     dp[i][j] = false;
                 }else{
                     // 当 s.charAt(i) == s.charAt(j)的时候，判断 i - 1 == j + 1
                     // 也就是说 i - j = 2
                     if( i - j < 3){
                         dp[i][j] = true;
                     }else{
                         dp[i][j] = dp[i - 1][j + 1];
                     }
                 }
                 if(dp[i][j] && i - j + 1 > max){
                     max = i - j + 1;
                     start = j;
                 }
            }
        }
        return s.substring(start, start + max);
    }

    public static void main(String[] args) {
        String s = "baba";
        System.out.println(longestPalindrome2(s));
    }
}
