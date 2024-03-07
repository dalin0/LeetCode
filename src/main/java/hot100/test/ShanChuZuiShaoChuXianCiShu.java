package hot100.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

public class ShanChuZuiShaoChuXianCiShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            int minNum = Integer.MAX_VALUE;
            for(int i = 0; i < str.length(); i++){
                if(map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }else{
                    map.put(str.charAt(i), 1);
                }
            }
            for(Integer v : map.values()){
                minNum = Math.min(v, minNum);
            }
            for (int i = 0; i < str.length(); i++){
                if(map.get(str.charAt(i)) != minNum){
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}
