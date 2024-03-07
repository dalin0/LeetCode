package hot100.test.ip地址复原;

import java.util.Stack;

public class Test2 {

    public static boolean magicString(String s){
        if(s.length() == 0) return true;
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'c'){
                stack.push(s.charAt(i));
            }else{
                if(!stack.empty()){
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "cmcmccmcmcccmmmm";
        System.out.println(magicString(s));
    }
}
