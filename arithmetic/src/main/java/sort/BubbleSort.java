package sort;

/**
 * Created by sunxianping on 2019-11-15.
 * 冒泡排序
 */
public class BubbleSort {

    public static int[] sort(int[] array){
        for(int i=0;i<array.length;i++) {
            for(int j=i;j<array.length;j++) {
                if(array[j] < array[i]){
                    Utils.swap(array, i , j);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = Utils.getRandomArray(10, 100);
        sort(array);
        Utils.printArray(array);
    }
}
