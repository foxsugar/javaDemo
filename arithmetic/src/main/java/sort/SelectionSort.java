package sort;

/**
 * Created by sunxianping on 2019-11-15.
 * 选择排序 和冒泡不同的是最后交换
 * 时间复杂度 O(n2)
 * 额外空间复杂度O(1)
 */
public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int t = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[j];
                if (temp < t) {
                    index = j;
                    t = temp;
                }
            }
            Utils.swap(array, i, index);
        }
    }

    public static void main(String[] args) {
        int[] arr = Utils.getRandomArray(10, 100);
        sort(arr);
        Utils.printArray(arr);
    }
}
