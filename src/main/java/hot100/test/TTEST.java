package hot100.test;

import java.util.Scanner;

public class TTEST {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            String[] chars = s.split(".");

            for(int i = 0; i < chars.length; i++){
                System.out.println(chars[i]);
            }
//            String str = "";
//            for(int i = 0; i < chars.length; i++){
//                int num = Integer.parseInt(chars[i]);
//                // 转化成二进制
//                while(num != 0){
//                    int x = num % 2;
//                    num= num / 2;
//                    str = Integer.toString(x) + str;
//                }
//                for(int j = str.length(); j < 8; j++){
//                    str = "0" + str;
//                }
//                System.out.println(str);
//            }
//            System.out.println(str);
        }
    }
}
