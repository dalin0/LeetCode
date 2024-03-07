package Code_Capriccio.哈希表.快乐数;

import java.util.HashSet;

public class IsHappy {
    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            if (getSum(n) == 1){
                return true;
            }else {
                if (set.contains(getSum(n))){
                    return false;
                }
            }
            set.add(getSum(n));
        }
    }
}
