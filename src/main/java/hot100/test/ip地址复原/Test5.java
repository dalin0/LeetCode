package hot100.test.ip地址复原;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static boolean checkValid(String s){
        if (s.length() == 0){
            return false;
        }
        if (s.length() > 1 && s.charAt(0)=='0'){
            return false;
        }
        if (s.length() > 3){
            return false;
        }
        int x = Integer.parseInt(s);
        if (x > 255){
            return false;
        }
        return true;
    }
    public static void dfs(int index,int block,String now,List<String> list,String s){
        if (block == 3){
            if (checkValid(s.substring(index,s.length()))){
                now = now + s.substring(index,s.length());
                list.add(now);
                return;
            }
        }
        for (int i = index; i < s.length(); i++) {
            String x = s.substring(index,i);
            System.out.println("x:" + x);
            if (checkValid(x)){
                String zancun = now;
                System.out.println("zancun:" + zancun);
                now = now + x + ".";
                System.out.println("now_2:" + now);
                dfs(i,block+1,now,list,s);
                now = zancun;
            }
        }
    }
    public static List<String> restoreIpAddresses(String s) {
        // 长度小于4，返回空数组
        if (s.length() < 4){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
//        int[] visited = new int[s.length()];
        for (int i = 0; i <= 3; i++) {
            String now = s.substring(0,i);
            if (checkValid(now)){
                System.out.println("检查：" + now);
                now = now + ".";
                // dfs传入 i ， block表示块，xxx.xxx.xxx.xxx四个块
                dfs(i,1,now,list,s);
            }else{
                continue;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(s);
        List<String> list = new ArrayList<>();
        list = restoreIpAddresses(s);
        System.out.println(list);
    }
}
