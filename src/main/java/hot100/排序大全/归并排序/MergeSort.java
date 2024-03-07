package hot100.排序大全.归并排序;

public class MergeSort {

    /**
     * @思路：先拆分再合并
     *
     * @讲解链接：https://www.bilibili.com/video/BV1Sv411B7F7?spm_id_from=333.337.search-card.all.click&vd_source=52b395a10caa9649f10cfbd6b0b6651f
     */

    public static void mergeSort(int[] A, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(A, low, mid);
            mergeSort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }

    public static void merge(int[] A, int low, int mid, int high){
        // 确定s1 和 s2 的位置， s2 为第二个归并段的开头
        int s1 = low, s2 = mid + 1;
        int[] ret = new int[high - low + 1];
        int i = 0; // 表示ret数组的下标
        while(s1 <= mid && s2 <= high){
            // 这里如果没有等于号就是不稳定的
            ret[i++] = A[s1] <= A[s2] ? A[s1++] : A[s2++];

        }
        while (s1 <= mid){
            ret[i++] = A[s1++];
        }
        while(s2 <= high){
            ret[i++] = A[s2++];
        }
        // 将 ret 中的元素拷贝到 A 数组中
        for (int j = 0; j < ret.length; j++) {
            A[j + low] = ret[j];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[] {49, 38, 65, 97, 76, 13, 27, 49};
        mergeSort(A, 0, A.length - 1);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
