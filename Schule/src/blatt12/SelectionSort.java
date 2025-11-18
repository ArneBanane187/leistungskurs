package blatt12;

import java.util.Arrays;

public class SelectionSort {
    /**
     * Eine Methode zum sortieren eines Array. Man sucht das kleinste Element des Array und tauscht es auf die erste (nullte) Stelle usw.
     * @param arr Sucht und tauscht die kleinsten Elemente des Array.
     */
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = new int [] {10,3,-5,23,-9,3,6,2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
