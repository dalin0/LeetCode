package hot100.test;

import java.util.*;

public class HJ8_合并表记录 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                int x = in.nextInt();
                int y = in.nextInt();
                if(map.containsKey(x)){
                    map.put(x, y + map.get(x));
                }else{
                    map.put(x, y);
                }
            }
            for(Integer key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
