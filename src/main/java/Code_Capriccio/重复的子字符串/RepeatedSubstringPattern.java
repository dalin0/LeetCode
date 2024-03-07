package Code_Capriccio.重复的子字符串;

public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        int[] next = new int[s.length()];
        getNext(next, s);
        // 字符串长度 % （字符串长度 - 最长前后缀长度） == 0
        if (next[s.length() - 1] != 0 && s.length() % (s.length() - next[s.length() - 1]) == 0) {
            return true;
        }
        return false;
    }

    /**
     * 获取字符串前缀表
     * @param next
     * @param s
     */
    public static void getNext(int[] next, String s) {
        int j = 0;
        next[0] = 0;

        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
    }
}
