package hot100.排序大全.希尔排序;

public class ShellSort {

    public static void shellSort(int[] A){
        int d, i, j , temp;
        for(d = A.length/2; d >= 1; d = d/2){
            for (i = d + 1; i < A.length; i++) {
                if(A[i] < A[i - d]){
                    temp = A[i];
                    for (j = i - d; j >= 0 && temp < A[j]; j -= d){
                        A[j+d] = A[j];
                    }
                    A[j + d] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] A = new int[] {49, 38, 65, 97, 76, 13, 27, 49};
        shellSort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
