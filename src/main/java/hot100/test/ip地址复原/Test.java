package hot100.test.ip地址复原;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static boolean checkValid(String s){
        if(s.length() == 0) return  false;
        if(s.length() > 1 && s.charAt(0) == '0') return false;
        if(s.length() > 3) return false;
        int x = Integer.parseInt(s);
        if(x > 255) return false;
        return true;
    }

    public static void dfs(int index, int block, String now, List<String> list, String s){
        if(block == 3){
            if(checkValid(s.substring(index, s.length()))){
                now = now + s.substring(index, s.length());
                list.add(now);
                return ;
            }
        }

        for(int i = index; i < s.length(); i++){
            String x = s.substring(index, i);
            if(checkValid(x)){
                String zc = now;
                now = now + x + ".";
                dfs(i, block + 1, now , list, s);
                now = zc;
            }
        }
    }

    public static List<String> restoreIpAddresses(String s) {
        if(s.length() < 4) return new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i <= 3; i++){
            String now = s.substring(0, i);
            if(checkValid(now)){
                now = now + ".";
                dfs(i, 1, now, list, s);
            }else{
                continue;
            }
        }
        return list;
    }
}
