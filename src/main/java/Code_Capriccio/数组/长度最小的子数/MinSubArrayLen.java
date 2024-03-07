package Code_Capriccio.长度最小的子数;

import java.util.Scanner;

public class MinSubArrayLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(minSubArrayLen2(target, nums));
    }
//    static public int minSubArrayLen(int target, int[] nums) {
//        System.out.println("target: " + target);
//        int res = Integer.MAX_VALUE;
//        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] >= target) {
//                System.out.println(nums[i]);
//                return 1;
//            }
//            int total = nums[i];
//            for(int j = i + 1; j < nums.length; j++){
//                total += nums[j];
//                System.out.println("total: " + total);
//                System.out.println("nums[i]: " + nums[i]);
//                System.out.println("nums[j]: " + nums[j]);
//                if(total >= target){
//                    if(res > j - i) {
//                        res = j - i + 1;
//                        System.out.println("j - i: " + res);
//                        break;
//
//                    }
//                }
//            }
//        }
//        if(res == Integer.MAX_VALUE) {
//            return 0;
//        }else if (nums[nums.length - 1] >= target){
//            return 1;
//        }else {
//            return res;
//        }
        static public int minSubArrayLen2(int target, int[] nums) {
            int left = 0;
            int total = 0;
            int res = Integer.MAX_VALUE;
            for(int right = 0; right < nums.length; right++){
                total += nums[right];
                while (total >= target){
                    res = Math.min(right - left + 1, res);
                    total -= nums[left];
                    left++;
                }
            }
            return res == Integer.MAX_VALUE ? 0 : res;
        }

}
