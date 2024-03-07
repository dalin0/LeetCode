package hot100.test;

import java.util.*;

public class HJ27查找兄弟单词 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();// n个单词
            String[] str = new String[n];
            for(int i = 0; i < n; i++){// 单词
                str[i] = in.next();
            }
            String res = in.next();// 目标单词
            int k = in.nextInt();// 第几个目标单词
            int count = 0;
            List<String> list = new ArrayList<>();
            char[] s = res.toCharArray();
            for(int i = 0; i < n; i++){
                if(!str[i].equals(res) && res.length() == str[i].length()){
                    char[] str1 = str[i].toCharArray();

                    Arrays.sort(s);
                    Arrays.sort(str1);
                    if (new String(s).equals(new String(str1))){
                        list.add(str[i]);
                        count++;
                    }
                }
            }
            Collections.sort(list);
            System.out.println(count);
            if(k <= count){
                System.out.println(list.get(k - 1));
            }
        }
    }
}
