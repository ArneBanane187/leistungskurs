package blatt14;

import java.sql.SQLOutput;

public class MultiArrays {
    //a)

    /**
     * Gibt einen 2d IntArray aus
     * @param arr
     */
    public static void print2DArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //b)

    /**
     * Gibt einen 2d Double Array aus
     * @param arr
     */
    public static void print2DArray(double[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    /**
     * Gibt einen 2d Charr Array aus
     * @param arr
     */
    public static void print2DArray(char[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //c)

    /**
     * Gibt ein zufähligen 2d Int Array aus, welcher den Array mit zwei übergebenen Längen und zwei übergebenen Grenzen erstellt
     * @param a erste übergebene Länge
     * @param b zweite übergebene Länge
     * @param p erste übergebene Grenze
     * @param q zweite übergebene Grenze
     * @return
     */
    public static int[][] createRandom2DIntArray(int a,int b,int p,int q){
        int[][] arr = new int[a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*p+q);

            }
        }
        return arr;
    }
    //d)

    /**
     * Gibt einen zufähligen 2d Double Array aus mit den Zahlen zwischen 0 und 1
     * @param a erste übergebene Länge
     * @param b zweite übergebene Länge
     * @return
     */
    public static double[][] createRandom2DDoubleArray(int a,int b){
        double[][] arr = new double[a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(Math.random() + 0);
            }
        }
        return arr;
    }
    //e)

    /**
     * erstellt einen durchnommerierten 2d Int Array
     * @param a erste übergebene Länge
     * @param b zweite übergebene Länge
     * @return
     */
    public static int[][] createCountingArray(int a,int b){
        int [][]arr = new int[a][b];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count;
                count++;
            }
        }
        return arr;
    }

    //f)

    /**
     * erstellt einen leeren 2d Char Array mit vorgegebenen Längen
     * @param a erste übergebene Länge
     * @param b zweite übergebene Länge
     * @return
     */
    public static char[][] createEmpty2DCharArray(int a,int b){
        char [][]arr = new char[a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=' ';
            }
        }
        return arr;
    }
    //g)
    //public static char[][] istIdentisch(char[][] arr,char[][] arr2){


    //}




    public static void main(String[] args) {
        System.out.println("Ausgabe IntArray");
        int[][] arr = {{1,2},{3,4},{5,6}};
        print2DArray(arr);
        System.out.println("Ausgabe DoubleArray");
        double[][] arr2 = {{1.5,2,3.8},{3.7,4.0,3.4},{5.9,6.4}};
        print2DArray(arr2);
        System.out.println("Ausgabe CharArray");
        char[][] arr3 = {{'w','a','s','s'},{'w','a','s','s'}};
        print2DArray(arr3);
        System.out.println("Ausgabe Random IntArray");
        int[][] arrRandom = createRandom2DIntArray(3,4,5,6);
        print2DArray(arrRandom);
        System.out.println("Ausgabe Random DoubleArray");
        double[][] arrRandom2 = createRandom2DDoubleArray(3,4);
        print2DArray(arrRandom2);
        System.out.println("Ausgabe Counting Array");
        int[][] arrCounting = createCountingArray(3,4);
        print2DArray(arrCounting);
        System.out.println("Ausgabe Empty Array");
        char[][] arrEmpty = createEmpty2DCharArray(3,4);
        print2DArray(arrEmpty);


    }
}
