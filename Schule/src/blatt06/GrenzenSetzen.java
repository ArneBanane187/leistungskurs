package blatt06;

import java.util.Scanner;

public class GrenzenSetzen {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Setzten Sie eine Untergrenze.");
        int u =  input.nextInt();
        System.out.println("Setzten Sie eine Obergrenze.");
        int o =  input.nextInt();

        int [] liste = new int[o - u + 1];
        for (int i = 0; i < liste.length; i++) {
            liste[i] = u + i;
        }

        System.out.println("Zahlen von" + u + "bis" + o + ":");
        for (int zahlen : liste) {
            System.out.println(zahlen);
        }



    }
}
