package hot100.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            int count = 0;
            int num = 0;
            int x = 0;
            for(int i = s.length() - 1; i >= 0; i--){
                if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                    num = s.charAt(i) - '0';
                }else if('a' <= s.charAt(i) && s.charAt(i) <= 'f'){
                    num = s.charAt(i) - 'a' + 10;
                }else if('A' <= s.charAt(i) && s.charAt(i) <= 'F'){
                    num = s.charAt(i) - 'A' + 10;
                }else{
                    break;
                }
                count = (int) (count + num * Math.pow(16, x));
                x++;
            }
            System.out.println(count);
        }
    }
}
