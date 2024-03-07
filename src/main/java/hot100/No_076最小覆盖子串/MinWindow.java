package hot100.No_076最小覆盖子串;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {

    /**
     * @视频讲解： https://www.bilibili.com/video/BV1Ld4y1N7QE
     * @Date: 2022/8/21
     */

    /**
     * @解题思路：
     *              1、设置一个左指针和一个右指针，再设置一个计数器（值为目标字符串的长度）
     *              2、申请一个 map 数组，统计目标字符串中每个字符的个数
     *              3、右指针不断向右移动，若所指字符存在 map 中，就将该字符个数减一
     *              4、当计数器为 0 时，移动左指针，一直到左指针所指字符存在 map 中
     *              5、保存目前覆盖子串长度，这时计数器因为不为 0 所以再次移动右指针，直到计数器再次为 0
     *              6、不断重复直到结束
     */
    public static String minWindow(String s, String t) {
        //双指针
        if(s == null || t == null || t.length() > s.length()){
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        // 统计目标字符串中每个字符出现的次数
        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }else{
                map.put(t.charAt(i), 1);
            }
        }
        int start = 0, end = 0;
        int count = t.length();
        int resL = -1;
        int resR = Integer.MAX_VALUE - 1;
        // 开始进行双指针移动覆盖目标子串中的字符
        while(end < s.length()){
            // 首先要判断 end 所指的字符是否在 map 中，若是在的话就将该字符个数减一，若该字符个数大于0的话就将计数器减一
            if(map.containsKey(s.charAt(end))){
                if (map.get(s.charAt(end)) > 0){
                    count--;
                }
                map.put(s.charAt(end), map.get(s.charAt(end)) - 1);
            }
            if(count == 0){
                while (!map.containsKey(s.charAt(start)) || map.get(s.charAt(start)) < 0){
                    if (map.containsKey(s.charAt(start))){
                        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                    }
                    start++;
                }
                // 结算
                if ((end - start) < (resR - resL)){
                    resL = start;
                    resR = end;
                }
                // 移动 start 指针, 遍历下一个可能性
                if (map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start), map.get(s.charAt(start)) + 1);
                    count++;
                }
                start++;
            }
            end++;
        }
        return resL == -1 ? "" : s.substring(resL, resR + 1);
    }

    public static void main(String[] args) {
        String s = "aa";
        String t = "aa";
        System.out.println(minWindow(s, t));
    }
}
