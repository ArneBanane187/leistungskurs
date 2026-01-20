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

    /**
     * Die Prozedur überprüft, ob das angegebene Array von klein nach groß sortiert ist
     * @param index Array
     * @return ausgabe als boolean (true/false)
     */
    public static boolean istSortiert (int [] index) {
        for (int i = 1; i <= index.length - 1; i++) {
            if (index[i-1] > index[i]) {
                return false;
            }
        }
        return true;
    }
    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach links (letzte Stelle wird zu zur ersten Stelle)
     * @param arr Array
     */
    public static void shiftLeft (int [] arr) {
        if (arr.length == 0) return;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
        int zwischenSpeicher = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = zwischenSpeicher;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }
    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach rechts (erste Stelle wird zu zur letzten Stelle)
     * @param arr Array
     */
    public static void shiftRight (int [] arr) {
        if (arr.length == 0) return;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
        int zwischenSpeicher = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = zwischenSpeicher;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }
    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach links (letzte Stelle wird mit 0 aufgefüllt)
     * @param arr Array
     */
    public static void shiftLeftAbsolute (int [] arr) {
        if (arr.length == 0) return;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
    }
    /**
     * Die Prozedur verschiebt das ganze Array um eine Stelle nach rechts (erste Stelle wird mit 0 aufgefüllt)
     * @param arr Array
     */
    public static void shiftRightAbsolute (int [] arr) {
        if (arr.length == 0) return;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
        System.out.print("[ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " | ");
            }
        }
        System.out.println(" ]");
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
