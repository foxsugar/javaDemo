package sort;

/**
 * Created by sunxianping on 2019-11-15.
 *
 * 插入排序 类似扑克牌码牌过程
 * 时间复杂度 O(n2)
 * 额外空间复杂度O(1)
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    Utils.swap(arr, i, j);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = Utils.getRandomArray(20, 100);
        sort(arr);
        Utils.printArray(arr);
    }

}
