package hot100.test;

import java.util.Arrays;
import java.util.Scanner;

public class TestTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] target = str.toCharArray();
        Arrays.sort(target);
        System.out.println(target);
    }
}
