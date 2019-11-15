package sort;

/**
 * Created by sunxianping on 2019-11-15.
 * 归并排序
 */
public class MergeSort {

    public static void sort(int[] arr){

    }

    public static void sortProcess(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + (right - left) >> 2;
        sortProcess(arr, left , mid);
        sortProcess(arr, mid + 1, right);

    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];


    }
}
