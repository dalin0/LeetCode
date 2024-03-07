package hot100.排序大全.插入排序;

public class InsertSort {

    /**
     * @时间复杂度：
     *              算法稳定性： 稳定
     *              最好的时间复杂度： O(n)
     *              最坏的时间复杂度： O(n^2)
     *              空间复杂度： O(1)
     */

    public static void insertSort(int[] A){
        int i, j, temp;
        for (i = 1; i < A.length; i++){
            if(A[i] < A[i - 1]){
                temp = A[i];
                for (j = i - 1; j >= 0 && A[j] > temp; j--){
                    A[j + 1] = A[j];
                }
                A[j + 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = new int[] {49, 38, 65, 97, 76, 13, 27, 49};
        insertSort(A);
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
}
