package hot100.No_020有效的括号;

import java.util.Stack;

/**
 * @题目：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合
 */

/**
 * @思路：
 *          1、申请一个栈空间
 *          2、遍历字符串，若字符串为空则入栈，若是不为空就判断是不是为三个又括号中的一个
 *          3、若是的话就取栈顶元素，然后与当前遍历到的 i 的位置的字符串比较，若是匹配的话就出栈
 *          4、出栈后就 continue ，直接再次循环
 *          5、若是不匹配则入栈，这样就可以造成直接 false
 */


public class isValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!stack.empty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')){
                // 判断当前位置的字符有没有匹配的上的左括号
                Character top = stack.peek();
                if((top.equals('(') && s.charAt(i) == ')') || (top.equals('[') && s.charAt(i) == ']') ||
                        (top.equals('{') && s.charAt(i) == '}')){
                    // 栈顶元素已经跟当前第 i 个位置的元素进行了匹配，因此移除掉
                    stack.pop();
                    continue;
                }else{
                    return stack.empty();
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.empty();
    }
}
