import java.util.Scanner;

public class exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] value = str.split(";");
        String[] a1 = value[0].split(",");
        String[] a2 = value[1].split(",");
        String[] a3 = value[2].split(",");
        String[] x = value[3].split(",");
        String[] b = value[4].split(",");
        String[] o = value[5].split(",");
        double[] sum = new double[3];
        for (int i = 0; i < a1.length; i++) {
            sum[0] += Double.parseDouble(a1[i]) * Integer.parseInt(x[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            sum[1] += Double.parseDouble(a2[i]) * Integer.parseInt(x[i]);
        }
        for (int i = 0; i < a3.length; i++) {
            sum[2] += Double.parseDouble(a3[i]) * Integer.parseInt(x[i]);
        }
        boolean flag = check(o[0], sum[0], Double.parseDouble(b[0])) && check(o[1], sum[1], Double.parseDouble(b[1]))
                && check(o[2], sum[2], Double.parseDouble(b[2]));
        System.out.print(flag + " ");
        double res = Math.max(sum[0] - Double.parseDouble(b[0]),
                Math.max(sum[1] - Double.parseDouble(b[1]), sum[2] - Double.parseDouble(b[2])));
        System.out.println((int)res);

    }
    public static boolean check(String o, double sum, double target) {
        if(o.equals(">")) return sum > target;
        else if(o.equals(">=")) return sum >= target;
        else if(o.equals("<")) return sum < target;
        else if(o.equals("<=")) return sum <= target;
        else if(o.equals("=")) return sum == target;
        return true;
    }
}
