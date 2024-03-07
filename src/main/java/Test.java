import java.util.Scanner;

public class Test {
    static String noStr ;
    public static StringBuffer ssr = new StringBuffer();
    public static char[][] zidian = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r'},{'s','t'},{'u','v'},{'w','x'},{'y', 'z'}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        noStr = sc.nextLine();
        combine(0, str, "");
        System.out.println(ssr);
    }

    public static void combine(int n, String str, String t){
        boolean flag;
        if(str.length() == t.length()){
            if(judge(t)){
                ssr.append(t + ",");
            }
        }else{
            int num = str.charAt(n) - '0';
            char[] s = zidian[num];
            for(int i = 0; i < s.length; i++){
                combine(n + 1, str, t + s[i]);
            }
        }
    }
    public static boolean judge(String s){
        for(int i = 0; i < noStr.length(); i++){
            String s1 = String.valueOf(noStr.charAt(i));
            if(!s.contains(s1)){
                return true;
            }
        }
        return false;
    }
}
