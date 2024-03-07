package hot100.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class HJ14_字符串排序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            String[] str = new String[n];
            for(int i = 0; i < n; i++){
                str[i] = in.next();
            }
            Arrays.sort(str);
            for(String v : str){
                System.out.println(v);
            }
        }
    }
}
