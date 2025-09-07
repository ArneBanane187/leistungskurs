package blatt03;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        //Eingabe von drei Zahlen
        System.out.println("Bitte geben Sie eine Zahlen ein: ");
        int a = input.nextInt();

        System.out.println("Bitte geben Sie eine Zahlen ein: ");
        int b = input.nextInt();

        System.out.println("Bitte geben Sie eine Zahlen ein: ");
        int c = input.nextInt();

        // Bestimmung der größten und kleinsten Zahl
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        // Ausgabe
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);



    }
}
