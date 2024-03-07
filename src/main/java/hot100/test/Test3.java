package hot100.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test3 {

    public static int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i  = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
                System.out.println(stack.peek());
            }else{
                if(s.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                    stack.push('1');
                    System.out.println("左右匹配时：" + stack.peek());
                }else{
                    int count = 0;
                    while(stack.peek() != '('){
                        System.out.println(count);
                        count += stack.peek() - '0';
                        System.out.println("获取到的count的int值:" + count);
                        stack.pop();
                        System.out.println("弹出时count的值:" + count);
                        System.out.println("弹出时下一个栈顶的值：" + stack.peek());
                    }
                    stack.pop();
                    stack.push((char)((count << 1) + '0'));
                    System.out.println(stack.peek() - '0');
                }
            }

        }
        int res = 0;
        while(!stack.empty()){
            res += stack.peek() - '0';
            stack.pop();
        }
        return res;
    }


    public static void main(String[] args) {
        String s = "(()(()))";
        System.out.println(s);
        System.out.println(scoreOfParentheses(s));
    }
}
