package Code_Capriccio.哈希表.三数之和;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<List<Integer>> resList = new ArrayList<>();
        resList = threeSum(nums);
        for (List e : resList) {
            System.out.println(e);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        Arrays.sort(nums);
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] > 0) return resList;
           // 去重a
           if (i > 0 && nums[i] == nums[i - 1]){
               continue;
           }
           int left = i + 1;
           int right = nums.length - 1;
           while (left < right) {
               // 去重left
               if (nums[i] + nums[left] + nums[right] < 0){
                   left++;
               }
               // 去重right
               else if (nums[i] + nums[left] + nums[right] > 0) {
                   right++;
               }else {
                   resList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                   // 去重逻辑应该放在一个三元组找到之后
                   while (right > left && nums[right] == nums[right - 1]) right--;
                   while (right > left && nums[left] == nums[left + 1]) left++;
                   right--;
                   left++;
               }
           }
       }
        return resList;
    }
}
