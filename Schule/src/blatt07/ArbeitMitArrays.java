package blatt07;

public class ArbeitMitArrays {
    //Aufgabe a)
    /**
     * Gibt einen beliebiegen Int-Array aus
     * @param arr der beliebeige Int-Array
     */
    public static void printArray (int [] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ] ");
    }

    //Aufgabe b)
    /**
     * Gibt eienen beliebigen Double-Array aus
     * @param arr der beliebeige double-Array
     */
    public static void printArray (double [] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }  else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ] ");



    }

    /**
     * Gibt einen beliebigen boolean-Array aus
     * @param arr der beliebige boolean-Array
     */
    public static void printArray (boolean[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }  else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ] ");
    }

    /**
     * Gibt einen beliebigen char-Array aus
     * @param arr der beliebige char-Array
     */
    public static void printArray (char[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ] ");

    }

    /**
     * Gibt einen beliebigen String-Array aus
     * @param arr der beliebige String-Array
     */
    public static void printArray (String[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ] ");
    }

    public static int istSortiert (int [] arr) {

    }


    public static void main(String[] args) {
        int [] arr = new int [] {2, 3, 45, 12, 45,};
        printArray(arr);

        double [] arr2 = new double [] {1.0, 2.0, 3.0, 4.0, 5.0};
        printArray(arr2);

        boolean [] arr3 = new boolean [] {true, false, true, false, true, true};
        printArray(arr3);

        char [] arr4 = new char[] {'c', 'h', 'k', 'w'};
        printArray(arr4);

        String [] arr5 = new String[] {"Ich ", "mag ", "5 ","Eier ", "Bitte" };
        printArray(arr5);





    }
}
