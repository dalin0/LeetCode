
import java.util.*;
public class Exam {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String tag = sc.nextLine();
        String str = sc.nextLine();
        String[] value = str.split(" ");
        for (int i = 0; i < value.length; ) {
            String string1 = value[i + 2] + value[i + 1];
            int length = cul(string1);
            if (tag.equals(value[i])){
                for (int j = 0; j < length; j++) {
                    System.out.print(value[i + 3 + j] + " ");
                }
                break;
            }
            i += length + 3;
        }
    }
    public static int cul(String string){
        int res = 0, len = string.length();
        for (int i = 0; i < len; i++) {
            int num = 0;
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'F'){
                num = string.charAt(i) - 'A' + 10;
            }else {
                num = string.charAt(i) - '0';
            }
            res += num * Math.pow(16, len - 1 - i);
        }
        return res;
    }
}
