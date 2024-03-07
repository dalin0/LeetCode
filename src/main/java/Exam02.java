import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        for(int i = 0; i < s1.length(); i++){
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
            }else if('A' <= s1.charAt(i) && s1.charAt(i) <= 'Z'){
                if (s1.charAt(i) - 'A' > s2.charAt(i) - 'A'){
                    System.out.println(s1);
                    break;
                }else if(s1.charAt(i) - 'A' == s2.charAt(i) - 'A'){
                    continue;
                }
            }else if(s1.charAt(i) == '.'){
                continue;
            }
        }
    }
}
