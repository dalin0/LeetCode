package Code_Capriccio.哈希表.有效的字母异位词;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
//        char[] sc = s.toCharArray();
//        char[] tc = t.toCharArray();
//        Arrays.sort(sc);
//        Arrays.sort(tc);
//        System.out.println(sc);
//        System.out.println(tc);
//        System.out.println(sc == tc);
//        String ssc = new String(sc);
//        String stc = new String(tc);
//        System.out.println(ssc == stc);
//        System.out.println(ssc.equals(stc));


    }
    public boolean isAnagram(String s, String t) {
        int[]  hash = new int[26];
        for (int i = 0; i < s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            hash[s.charAt(i) - 'a']--;
        }
//        for (int i = 0; i < 26; i++) {
//            if (hash[i] != 0) return false;
//        }
        for (int count : hash) {
            if (count != 0) return false;
        }
        return true;
    }
}
