package hot100.排序大全.快速排序;

public class QuickTest {

    public static void quickSort(int[] A, int low, int high){
        if(low < high){
            int pivot = Parition(A, low , high);
            quickSort(A, pivot + 1, high);
            quickSort(A, low, pivot - 1);
        }
    }

    public static int Parition(int[] A, int low, int high){
        int pivot = A[low];
        while(low < high){
            while(low < high && pivot <= A[high]) --high;
            A[low] = A[high];
            while(low < high && pivot >= A[low]) ++low;
            A[high] = A[low];
        }
        A[low] = pivot;
        return low;
    }

}
