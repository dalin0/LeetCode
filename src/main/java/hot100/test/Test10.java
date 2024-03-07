package hot100.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test10 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        TreeSet treeSet = new TreeSet();
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            for(int i = 0; i < num; i++){
                int x = sc.nextInt();
                set.add(x);
            }
            treeSet.addAll(set);

            for(Object t : treeSet){
                System.out.println(t);
            }
        }

    }
}
