package Code_Capriccio.哈希表.赎金信;

import java.util.HashMap;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                map.put(magazine.charAt(i), 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.containsKey(ransomNote.charAt(i))) {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
            } else {
                map.put(ransomNote.charAt(i), -1);
            }
        }

        for (Integer value : map.values()) {
            if (value < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 哈希数组方式解题
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            hash[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            hash[ransomNote.charAt(i) - 'a']--;
        }
        for (int i : hash) {
            if (i < 0) {
                return false;
            }
        }
        return true;
    }

}
