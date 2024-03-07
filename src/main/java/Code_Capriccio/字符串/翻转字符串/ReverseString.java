package Code_Capriccio.字符串.翻转字符串;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};  // 'h','e','l','l','o'
        int left = 0, right = s.length - 1;
        System.out.println(right);
        if (s.length % 2 == 1) {
            while(left != right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }else {
            for (int i = 0; i < s.length / 2; i++){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }

    /**
     * 用栈解决
     * @param s
     */
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            stack.push(s[i]);
        }
        char[] str = new char[s.length];
        for (int i = 0; i < stack.size(); i++) {
            s[i] = stack.pop();
        }
    }
}
