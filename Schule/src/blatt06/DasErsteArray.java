package blatt06;

import java.util.Scanner;

public class DasErsteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Wollen Sie die Zahlen vorwärts oder rückwärts ausgegeben bekommen (vorwärts: 1/rückwärts: 2)?");
        int vorOderRueck = input.nextInt();



        int start = 10;
        int ende = 999;
        int laenge = ende - start + 1;

        int [] zahlen = new int[laenge];

        for (int i = 0; i < laenge; i++) {
            zahlen[i] = start + i;
        }

        if ( vorOderRueck == 1) {
            for (int i = 0; i < laenge; i++) {
                System.out.println(zahlen[i]);
            }
        }

        else if ( vorOderRueck == 2) {
            for (int i = 999; i >= 10; i--) {
                System.out.println(i);
            }
        }
    }
}
