package blatt13;

import java.util.Random;

public class Zufall {

    private static Random rand = new Random();

    // a)
    public static double zufall(double b) {
        return rand.nextDouble() * b;
    }

    // b)
    public static int zufallGanz(int b) {
        return rand.nextInt(b + 1);   // +1, da nextInt(exclusive)
    }

    // c)
    public static double zufall(double a, double b) {
        return a + rand.nextDouble() * (b - a);
    }

    // d)
    public static int zufallGanz(int a, int b) {
        return a + rand.nextInt(b - a + 1);
    }

    // e)
    public static int[] zufallArray(int l, int a, int b) {
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = zufallGanz(a, b);
        }
        return arr;
    }

    public static void main(String[]arcs){
        System.out.println(zufall(6));
        System.out.println(zufallGanz(10));
        System.out.println(zufall(3,20));
        System.out.println(zufallGanz(12,42));

        int[] arr = Zufall.zufallArray(5, 1, 9);
        for(int x : arr) {
            System.out.print( "[" + x + "]");
        }
    }

}
