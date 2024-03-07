import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.*;

public class exam04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] a = new int[m][2];
        for (int i = 0; i < m; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.comparing(o -> o[0]));
        List<PriorityQueue<Integer>> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).isEmpty() || list.get(j).peek() <= a[i][0]){
                    list.get(j).offer(a[i][1]);
                    flag = false;
                    break;
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
            if (flag) {
                pq.offer(a[i][1]);
                list.add(pq);
            }
        }
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            int len = list.get(i).size();
            if(len <= n) {
                res++;
            }else {
                res += len % n == 0 ? (len / n) : (len / n + 1);
            }
        }
        System.out.println(res);
    }
}
