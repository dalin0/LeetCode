package Code_Capriccio.栈与队列.删除字符串中所有相邻重复项;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                while (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                    stack.pop();
                }
                continue;
            }
            stack.push(s.charAt(i));
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res;
    }
}
