package hot100.test;

import java.util.Scanner;

public class HJ106_字符串逆序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            for(int i = s.length() - 1; i >= 0; i--){
                System.out.print(s.charAt(i));
            }
        }
    }
}
