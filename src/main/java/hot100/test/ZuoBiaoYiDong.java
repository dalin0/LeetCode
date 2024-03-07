package hot100.test;

import java.util.Scanner;

public class ZuoBiaoYiDong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            String[] chars = input.split(";");
            int x = 0;
            int y = 0;
            for(int i = 0; i < chars.length; i++){
                String str = "";
                if(chars[i] == null || chars[i] == "" || chars[i].trim().length() == 0){
                    continue;
                }
                str = chars[i].substring(0, 1);
                int str2;
                try{
                    str2 = Integer.parseInt(chars[i].substring(1));
                }catch (Exception e){
                    continue;
                }
                if("A".equals(str)){
                    x -= str2;
                }else if("D".equals(str)){
                    x += str2;
                }else if("W".equals(str)){
                    y += str2;
                }else if("S".equals(str)){
                    y -= str2;
                }
            }
            System.out.println(x + "," + y );
        }
    }
}
