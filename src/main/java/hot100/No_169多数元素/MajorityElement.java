package hot100.No_169多数元素;

import java.util.HashSet;

import static java.util.Arrays.sort;

public class MajorityElement {

    /**
     * @思路：  Arrays.sort（nums）
     *          return nums[nums.length / 2];
     * @param nums
     * @return
     */

    public static int majorityElement(int[] nums) {
        int count = 1;
        int res = 0;
        sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                count++;
                if (count > nums.length / 2){
                    res = nums[i];
                    break;
                }
            }else {
                count = 1;
                set.add(nums[i]);
                if (count > nums.length / 2){
                    res = nums[i];
                    break;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1};
        System.out.println(majorityElement(nums));
    }
}
