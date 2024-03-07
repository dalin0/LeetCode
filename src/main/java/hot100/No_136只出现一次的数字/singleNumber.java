package hot100.No_136只出现一次的数字;

import java.util.Arrays;

public class singleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        // 1 1 2 2 4
        int key = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(i % 2 == 0){
                key += nums[i];
            }else{
                key -= nums[i];
            }
            System.out.println(key);
        }
        return key;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
