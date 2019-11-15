package sort;

import java.util.Random;

/**
 * Created by sunxianping on 2019-11-15.
 * 工具
 */
public class Utils {

    /**
     * 交换
     *
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int a : array) {
            System.out.print(a);
            System.out.print("  ");
        }
    }

    public static int[] getRandomArray(int size, int max) {
        int[] a = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = rand.nextInt(max);
        }
        return a;
    }
}
