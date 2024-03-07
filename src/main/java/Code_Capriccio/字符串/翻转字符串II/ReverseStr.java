package Code_Capriccio.字符串.翻转字符串II;

import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 3;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int left = 0, right = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i += 2*k) {
            left = i;
            right = Math.min(s.length() - 1, left + k - 1);
            for (int j = left; j <= right; j++) {
                stack.push(chars[j]);
            }
            while (!stack.isEmpty()) {
                chars[left++] = stack.pop();
            }
        }
        s = new String(chars);
        return s;
    }
}
