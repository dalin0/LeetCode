package hot100.No_704二分查找;

public class search {

    /**
     * @题目： 二分查找
     * @param nums
     * @param target
     * @return
     */

    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid;
        while(start <= end){
            mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
