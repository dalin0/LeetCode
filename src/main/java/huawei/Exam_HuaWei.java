package huawei;

import java.util.*;

public class Exam_HuaWei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] str = new String[n][];
        for(int i = 0; i < n; i++){
            String[] str2 = sc.nextLine().split(" ");
            str[i] = str2;
        }
        // 输入结束
        HashMap<String, PriorityQueue<Integer[]>> map = new HashMap<>();
        int num = 1;
        for(String[] v : str){
            String key = v[0];
            String out = v[1];
            if(key.equals("IN")){
                String pri = v[2];
                Integer[] list = {num, Integer.parseInt(pri) };
                map.putIfAbsent(out, new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]));
                map.get(out).offer(list);
                num++;
            }else{
                Integer[] list = map.get(out).poll();
                if(list != null){
                    System.out.println(list[0]);
                }else{
                    System.out.println("NULL");
                }
            }
        }
    }
}

