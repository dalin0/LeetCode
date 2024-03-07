package hot100.test;

import java.util.ArrayList;
import java.util.HashMap;

public class Test9 {
    public static int[] twoSum (int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] list = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                list[1] = i + 1;
                list[0] = map.get(target - numbers[i]) + 1;
                break;
            }
            map.put(numbers[i], i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{3,2,4};
        int target = 6;
        int[] list = twoSum(numbers, target);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
