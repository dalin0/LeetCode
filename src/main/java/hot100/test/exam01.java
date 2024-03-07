package hot100.test;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private static String nums = "";
    public static void dfs(String s, ArrayList<String> res, int step, int index){
        String cur = "";
        if(step == 4){
            if(index != s.length()) return;
            res.add(nums);
        }else{
            for(int i = index; i < s.length(); i++){
                cur += s.charAt(i);
                int num = Integer.parseInt(cur);
                String temp = nums;
                if(num <= 255 && (cur.length() == 1 || cur.charAt(i) != '0')){
                    if(step - 3 != 0){
                        nums += cur + ".";
                    }else{
                        nums += cur;
                        dfs(s, res, step + 1, index + 1);
                        nums = nums.substring(0, nums.length() - cur.length());
                    }
                }
            }
        }
    }

    public static ArrayList<String> restoreIpAddresses(String s){
        ArrayList<String> res = new ArrayList<String>();
        dfs(s, res, 0, 0);
        return res;
    }

    public static void main(String[] args) {
        String s = "25525511135";
        ArrayList<String> list = new ArrayList<>();
        list = restoreIpAddresses(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
