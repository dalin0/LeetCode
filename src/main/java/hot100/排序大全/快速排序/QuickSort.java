package hot100.排序大全.快速排序;

public class QuickSort {

    public static void quickSort(int[] A, int low, int high){
        if(low < high){
            int pivot = Parition(A, low, high);
            quickSort(A, pivot + 1, high);
            quickSort(A, low, pivot - 1);
        }
    }

    public static int Parition(int[] A, int low, int high){
        int pivot = A[low];
        while (low < high){
            while(low < high && pivot <= A[high]) --high;
            A[low] = A[high];
            while(low < high && pivot >= A[low]) ++low;
            A[high] = A[low];
        }
        A[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] A = new int[] {49, 38, 65, 97, 76, 13, 27, 49};
        quickSort(A,0,7);
        for (int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
}
