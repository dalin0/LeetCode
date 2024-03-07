package hot100.No_283移动零;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int[] num = new int[nums.length + 1];
        int k = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                num[k--] = num[i];
            }
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] != 0){
                num[k--] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = num[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
