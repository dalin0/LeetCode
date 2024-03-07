package Code_Capriccio.数组.螺旋矩阵II;

public class GenerateMatrix {
    public static void main(String[] args) {

    }
    static public int[][] generateMatrix(int n) {
        int[][] num = new int[n][n];
        int start = 0;
        int offset = 1;
        int circle = n / 2;
        int i, j;
        int count = 1;
        while(circle-- > 0) {
            for (j = start; j < n - offset; j++){
                num[start][j] = count++;
            }
            for (i = start; i < n - offset; i++){
                num[i][j] = count++;
            }
            for (; j > start; j--){
                num[i][j] = count++;
            }
            for (; i > start; i--){
                num[i][j] = count++;
            }
            start++;
            offset++;
        }
        if (n % 2 == 1){
            num[start][start] = count;
        }
        return num;
    }
}
