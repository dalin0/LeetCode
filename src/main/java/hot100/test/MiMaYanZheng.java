package hot100.test;


import java.util.Scanner;

public class MiMaYanZheng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            int countNum = 0;
            int countCharUp = 0;
            int countCharDown = 0;
            int countElse = 0;
            if(str.length() <= 8){
                System.out.println("NG");
                break;
            }
            for(int i = 0; i < str.length(); i++){
                if('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                    countNum = 1;
                }else if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                    countCharDown = 1;
                }else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                    countCharUp = 1;
                }else{
                    countElse = 1;
                }
            }
            // 判断子字符串是否重复
            int flag = 0;
            for(int i = 0; i <= str.length() - 6; i++){
                for(int j = i + 3; j <= str.length() - 3; j++){
                    if(str.charAt(i) == str.charAt(j) && str.charAt(i + 1) == str.charAt(j + 1) && str.charAt(i + 2) == str.charAt(j + 2)){
                        flag++;
                    }if(flag != 0){
                        break;
                    }
                }
                if(flag != 0){
                    break;
                }
            }
            if(flag == 1){
                System.out.println("NG");
            }else{
                if(countNum + countCharUp + countCharDown + countElse >= 3){
                    System.out.println("OK");
                }else{
                    System.out.println("NG");
                }
            }

        }
    }
}
