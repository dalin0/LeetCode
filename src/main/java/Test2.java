import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()){
            if(s1.charAt(i) <= '9' && s1.charAt(i) >= '0'){
                if(s1.charAt(i) - '0' > s2.charAt(i) - '0'){
                    System.out.println(s1);
                    break;
                }else if(s1.charAt(i) - '0' == s2.charAt(i) - '0'){
                    continue;
                }else{
                    System.out.println(s2);
                    break;
                }
            }
        }
    }
}
