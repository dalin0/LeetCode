package hot100.NO_448找到所有数组中消失的数字;

import java.util.*;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            map.put(nums[i], nums[i]);
//        }
//        List<Integer> num = new LinkedList<>();
//        int k = 0;
//        for(int i = 1; i <= nums.length; i++){
//            if(!map.containsKey(i)){
//                num.add(i);
//            }
//        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        List<Integer> num = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++){
            if (!set.contains(i)){
                num.add(i);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
