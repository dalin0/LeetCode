package hot100.test;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LeetCode0808_有重复字符串的排列组合 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<String> set = new HashSet<>();
        char str[] = s.toCharArray();
        dfs(set, 0, s.length() - 1, str);
        System.out.println(set.toString());
    }

    public static void dfs(HashSet<String> set, int left, int right,char[] str){
        if(left == right){
            set.add(new String(str));
        }
        for(int i = left; i <= right; i++){
            swap(str, i, left);
            dfs(set, left + 1, right, str);
            swap(str, i, left);
        }
    }
    public static void swap(char[] str, int x, int y){
        char t = str[x];
        str[x] = str[y];
        str[y] = t;
    }

}
