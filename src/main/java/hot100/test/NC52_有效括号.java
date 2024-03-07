package hot100.test;

import java.util.Scanner;
import java.util.Stack;

public class NC52_有效括号 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
    }


    public static boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.empty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                Character top = stack.peek();
                if((top.equals('(') && s.charAt(i) == ')') || (top.equals('{') && s.charAt(i) == '}') || (top.equals('[') && s.charAt(i) == ']')){
                    stack.pop();
                    continue;

                }
            }
            stack.push(s.charAt(i));
        }
        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
