package blatt11;

import java.util.Arrays;

public class BubbleSort {
    //a)
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2};
        swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
