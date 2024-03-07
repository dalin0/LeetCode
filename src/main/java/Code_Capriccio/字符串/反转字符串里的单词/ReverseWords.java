package Code_Capriccio.字符串.反转字符串里的单词;

import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String s) {
        /**
         * 1、除去收尾以及中间的多余空格
         * 2、反转整个字符串
         * 3、反转各个单词
         */
        // 1、除去收尾以及中间的多余空格
        StringBuilder sb = removeSpace(s);
        // 2、反转整个字符串
        reverseString(sb, 0, sb.length() - 1);
        // 3、反转各个单词
        reverseEachWord(sb);
        return sb.toString();
    }

    /**
     * 1、除去收尾以及中间的多余空格
     */
    public StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            if (s.charAt(start) != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(s.charAt(start));
            }
            start++;
        }
        return sb;
    }
    /**
     * 2、反转整个字符串
     */
    public void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    /**
     * 3、反转各个单词
     */
    public void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 0;
        // 确定第一单词
        while (start < sb.length()) {
            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            end++;
            start = end;
        }
    }
}
