package blatt12;

import java.util.Arrays;

public class InsertionSort {
    //a)

    /**
     * Funktion zum sortieren eines Array durch erstellen eines neuen Arrays in sortierter Reihenfolge
     * @param arr erstellt und sortiert den neuen Array
     * @return
     */
    public static int[] insertionSort(int[] arr) {
        int[] arrSort = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < element) {
                    count++;
                }
            }
            arrSort[count] = element;
        }
        return arrSort;
    }

    //b)

    /**
     * Methode zum sortieren eines Array, indem Element im Array vertauscht werden ohne einen neuen Array zu erstellen
     * @param arr vertauscht Elemente im Array
     */
    public static void insertionSortInPlace(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j-1;
            while (i > -1 && arr[i] > key) {
                arr[i+1] = arr[i];
                i = i - 1;
            }
            arr[i+1] = key;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,-9,10};
        System.out.println(Arrays.toString(insertionSort(arr)));
        insertionSortInPlace(arr);
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
