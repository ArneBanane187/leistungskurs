package blatt11;

import java.util.Arrays;

public class BubbleSort {
    //a)

    /**
     * Methode zum vertauschen zweier Elemente in einem Array
     * @param arr Array in dem getaushct wird
     * @param i  Zum vertauschendes Element
     * @param j getauschtes Element
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //b)

    /**
     * Methode zun sortieren eines Array. Jedes einzelne Element wird getauscht und die richtige Stelle gestellt.
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[] { 10, 2, 5, 0, -23, 6, -9};
        swap(arr, 0, arr.length - 1);
        blatt07.ArbeitMitArrays.printArray(arr);
        bubbleSort(arr);
        blatt07.ArbeitMitArrays.printArray(arr);

        //c)
        System.out.println(blatt07.ArbeitMitArrays.istSortiert(arr));
    }
}

//d) n = 8 => 28
//e) Ja. Wenn in einem Durchlauf kein Tausch passiert, ist der Array sortiert -> sofort Stop.
