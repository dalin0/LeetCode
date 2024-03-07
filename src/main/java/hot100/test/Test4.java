package hot100.test;

import java.util.HashMap;

public class Test4 {

    public static boolean areAlmostEqual(String s1, String s2) {
        int m = -1, n = -1;
        int count = 0;
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(m == -1) m = i;
                if(m != -1 && m != i){
                    n = i;
                }
            }
        }
        if(count == 0) return true;
        if(count == 2 && s1.charAt(m) == s2.charAt(n) && s1.charAt(n) == s2.charAt(m)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean areAlmostEqual1(String s1, String s2) {
        char[] str = new char[4];
        if(s1.length() != s2.length()) return false;
        int count = 0;
        int k = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                continue;
            }else{
                str[k++] = s1.charAt(i);
                System.out.println("no1:" + k);
                System.out.println(str[k - 1]);
                str[k++] = s2.charAt(i);
                System.out.println("no2:" + k);
                System.out.println(str[k - 1]);
                count++;
            }
        }
        if(count == 0) return true;
        if (count == 2){
            if (str[0] == str[3] && str[1] == str[2]){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "caa";
        String s2 = "aaz";
        System.out.println(areAlmostEqual(s1, s2));
    }
}
