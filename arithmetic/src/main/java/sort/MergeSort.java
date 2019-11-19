package sort;

/**
 * Created by sunxianping on 2019-11-15.
 * 归并排序
 */
public class MergeSort {

    public static void sort(int[] arr){

        sortProcess(arr, 0, arr.length - 1);
    }

    public static void sortProcess(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        sortProcess(arr, left , mid);
        sortProcess(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int index_left = left;
        int index_right = mid + 1;


        int count = 0;
        while (index_left <= mid && index_right <= right) {
            if (arr[index_left] <= arr[index_right]) {
                temp[count++] = arr[index_left++];
            }else{
                temp[count++] = arr[index_right++];
            }
        }

        if(index_left>mid){
            for(int i=index_right;i<=right;i++) {
                temp[count++] = arr[i];
            }
        }

        if (index_right > right) {
            for(int i=index_left;i<=mid;i++) {
                temp[count++] = arr[i];
            }
        }

        for (int aTemp : temp) {
            arr[left++] = aTemp;
        }

    }


    public static void main(String[] args) {
        int[] arr = Utils.getRandomArray(25, 100);
        Utils.printArray(arr);
        System.out.println();
        sort(arr);
        Utils.printArray(arr);

    }
}
