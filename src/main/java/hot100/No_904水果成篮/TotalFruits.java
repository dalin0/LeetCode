package hot100.No_904水果成篮;

import java.util.HashMap;

public class TotalFruits {

    /**
     * @思路： 双指针；
     * 1、用两个指针，i = 0 和 j = 0；
     * 2、插入一个元素，如果我们没有违背题目要求的性质，就计算一个目前这个子数组的长度
     * 3、
     */

    public static int totalFruit(int[] fruits) {
        int max_num = 0;
        int left = 0, right = 1;
        if(fruits.length <= 2){
            return fruits.length;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        while(left < fruits.length){
            int count = 0;
            int flag = 2;
            for(int i = left; i < fruits.length; i++){
                if(map.containsKey(fruits[i])){
                    count++;
                }else{
                    flag--;
                    if(flag < 0) {
                        break;
                    }
                    map.put(fruits[i], i);
                    right = i;
                    count++;
                }
            }
            max_num = Math.max(count, max_num);
            left = right;
            map.clear();
        }
        return max_num;
    }

    public static void main(String[] args) {
        int[] fruits = new int[]{1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }
}
