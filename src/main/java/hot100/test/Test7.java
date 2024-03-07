package hot100.test;

import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static int length(String s){
        int start = 0, max_len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            max_len = Math.max(max_len, i - start + 1);
            map.put(s.charAt(i), i);
        }

        return max_len;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(length(s));
    }
}
