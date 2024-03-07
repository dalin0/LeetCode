package Code_Capriccio.移出元素;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Scanner s1 = new Scanner(s);

        int i = 0;
        int[] arr = new int[8];
        while (s1.hasNextInt()){
            arr[i++] = s1.nextInt();
        }
        int target;
        target = scanner.nextInt();
        scanner.nextLine();

        int res = removeElement2(arr, target);
        System.out.println(res);
        for (int k = 0; k < res; k++){
            System.out.print(arr[k] + " ");
        }
    }
    static public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == val){
                for(int j = i; j < len - 1; j++){
                    nums[j] = nums[j + 1];
                }
            }
            i--;
            len--;
        }
        return len;
    }
    static public int removeElement2(int[] nums, int val){
        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
