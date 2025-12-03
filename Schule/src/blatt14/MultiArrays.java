package blatt14;

import java.sql.SQLOutput;

public class MultiArrays {
    //a)
    public static void print2DArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //b)
    public static void print2DArray(double[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void print2DArray(char[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //c)
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
    //public static int [][] createCountingArray(int a,int b){


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


    }
}
