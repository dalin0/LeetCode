package Code_Capriccio.有序数组的平方;

import java.util.Arrays;
import java.util.Scanner;

public class sortedSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        int i = 0;
        while(sc.hasNextLine()) {
            nums[i++] = sc.nextInt();
        }
        sortedSquares(nums);
    }
    static public int[] sortedSquares(int[] nums) {
        int k = nums.length - 1;
        int i = 0, j = nums.length - 1;
        int[] res = new int[nums.length];
        while(i <= j){
            if(nums[i] * nums[i] < nums[j] * nums[j]) {
                res[k--] = nums[j] * nums[j];
                j--;
            } else {
                res[k--] = nums[i] * nums[i];
                i++;
            }
        }
        return res;
    }
}
