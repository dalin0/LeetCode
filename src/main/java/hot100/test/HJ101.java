package hot100.test;

import java.util.*;

public class HJ101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            Integer[] num = new Integer[n];
            for(int i = 0 ; i < n; i++){
                num[i] = in.nextInt();
            }
            Arrays.sort(num);
            int res = in.nextInt();
            if(res == 0){
                for(int i = 0; i < n; i++){
                    System.out.println(num[i] + " ");
                }
            }else if(res == 1){
                for (int i = num.length - 1; i >= 0; i--) {
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}
