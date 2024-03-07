package hot100.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;

public class Test2 {
    public static int lengthOfLongestSubstring(String s){
        int start = 0;
        int max_len = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                start = Math.max(map.get(s.charAt(i)) + 1, start);
            }else {
                max_len = Math.max(i - start + 1, max_len);
            }
            map.put(s.charAt(i), i);
        }
        return max_len;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int left = 0, right = 0;
        int len = 0, max_len = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                len++;
                right++;
                max_len = Math.max(len, max_len);
            }else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                    len--;
                }
                set.add(s.charAt(right));
                right++;
                len++;
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring1(s));
    }
}
