package Code_Capriccio.字符串.替换数字;

import java.util.Scanner;

public class insteadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println((int) '0');
//        System.out.println((int) '9');
        String s = sc.nextLine();
        insteadNum(s);
    }
    public static void insteadNum(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                sb.append("number");
            } else {
//                System.out.print(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
