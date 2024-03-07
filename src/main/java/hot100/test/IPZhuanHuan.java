package hot100.test;

import java.util.Scanner;

public class IPZhuanHuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            String[] chars = s.split(".");
            String str = "";
            for(int i = 0; i < chars.length; i++){
                int num = Integer.parseInt(chars[i]);
                // 转化成二进制
                while(num != 0){
                    int x = num;
                    num = num / 2;
                    str = str + Integer.toString(x);
                }
            }
        }
    }
}
