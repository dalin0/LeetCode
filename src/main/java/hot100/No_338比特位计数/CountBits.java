package hot100.No_338比特位计数;

public class CountBits {

    public static int[] countBits(int n) {
        int[] nums = new int[n + 1];
        int k = 0;
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num = i;
            while(num > 0){
                if (num % 2 == 1){
                    count++;
                    num /= 2;

                }else{
                    num /= 2;
                }
            }
            nums[k++] = count;
        }
        return nums;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] num = new int[n + 1];
        num = countBits(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(num[i]);
        }
    }
}
