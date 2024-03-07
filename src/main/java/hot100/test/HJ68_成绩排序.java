package hot100.test;

import java.util.*;

public class HJ68_成绩排序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        HashMap<String, Integer> map = new HashMap<>();
//        TreeMap<String, Integer> map1 = new TreeMap<>(Comparator.<Integer>reverseOrder());
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int num = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int score = in.nextInt();
                map.put(name, score);
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            List<Map.Entry<String, Integer>> list1 = new ArrayList<>(map.entrySet());
            Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>(){
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            if(num == 1){
                for(Map.Entry<String, Integer> e : list){
                    System.out.println(e.getKey() + " " + e.getValue());
                }
            }else if(num == 0){
                for (Map.Entry<String, Integer> e : list1){
                    System.out.println(e.getKey() + " " + e.getValue());
                }
            }

        }
    }
}
