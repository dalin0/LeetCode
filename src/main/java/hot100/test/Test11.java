package hot100.test;

import java.util.HashMap;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            for(int i = 0; i < s.length(); i++){
                if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), i);
                }
            }
            System.out.println(map.size());
        }
    }
}
