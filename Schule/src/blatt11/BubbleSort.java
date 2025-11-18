package blatt11;

import java.util.Arrays;

public class BubbleSort {
    //a)
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2};
        swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
