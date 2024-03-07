package hot100.test;

import java.util.Scanner;
import java.util.Stack;

public class leetCode1614_括号最大嵌套深度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int count = 0;
        int maxNum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
                maxNum = Math.max(count, maxNum);
            }else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return maxNum;
    }
}
