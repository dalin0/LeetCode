package hot100.No_003最长不重复子串;

import java.util.HashMap;
import java.util.HashSet;

/**
 *  1. 滑动窗口，当没有重复字符时，right加入，如果有，left收缩，直到没有
 *  Time:   O(n)
 *  Space:  O(|E|)
 *
 *  2.DP(动态规划)
 *  Time:   O(n^2)
 *  Space:  O(1)
 *
 */
public class longestSubString {

    /**
     * @解法一： 运用HasMap
     * @过程： 1、首先对字符串s进行遍历 ---> for(int i = 0; i < s.length(); i++)
     *         2、然后取出 i 位置的字符赋予 变量c ---> char c = s.charAt(i)
     *         3、判断 map 中是否含有该位置的字符 ---> map.containsKey(c)
     *         4、如果有就将改变 start 的值， 比较当前c的位置加一的值与 start 的大小，大的赋予 start ---> start = Math.max(map.get(c)+1,start)
     *         5、如果 map 中没有该字符，就比较当前位置和 start的距离，将更大的赋予max_len变量 ---> man_len = Math.max(max_len, i - start + 1)
     *              因为 map 中没有该字符，所以将该字符的下标存入 map ---> map.put(c,i)
     * @return
     */
    public static int lengthOfLongestSubstring(String s){
        int max_len = 0, start = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // 遍历字符串
        for(int i = 0; i < s.length(); i++){
            // 取出i位置的字符
            char c = s.charAt(i);
            // 如果map中有i位置的字符c
            if(map.containsKey(c)){
                start = Math.max(map.get(c)+1, start);
            }
            max_len = Math.max(max_len, i - start + 1);
            // 如果没有就将i位置的字符的下标i存入map
            map.put(c, i);
        }
        return max_len;
    }

    /**
     * 解法二： 使用HashSet，运用滑动窗口解法
     * @过程：  1、循环遍历
     *          2、先判断 set 中是否有当前字符，若没有就将其添加进 set 中，然后right++，length++，比较length和max_len的最大值赋予max_len
     *          3、若 set 中有该字符，则开始判断 left 下标处的字符，从 left 处开始删除，直到 set中没有 right 出的字符， left--，length--
     *          4、直到 set 中没有 right 处的字符时跳出循环，这时将 right 处的字符加入 set 中， length++, right++
     *          5、一次循环结束
     * @return
     */
    public int lengthOfLongestSubstring2(String s){
        int left = 0,right = 0;
        int length = 0,max_len = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                length++;
                max_len = Math.max(length, max_len);
                right++;
            }else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                    length--;
                }
                set.add(s.charAt(right));
                length++;
                right++;
            }
        }
        return max_len;
    }

};



