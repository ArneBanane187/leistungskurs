package blatt06;

import java.util.Scanner;

public class OperrationMitArrays1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] auftrag =  new int[] {9000, 23000, 41000, 6000, 13000, 22000, 38000, 16000, 7000, 14000, 12000, 5000, 17000};

        int summe = 0;

        for (int i = 0; i < auftrag.length; i++) {
            System.out.println(auftrag[i] + " €");
            summe += auftrag[i];
        }

        for (int i = 0; i < auftrag.length; i++) {
            if (auftrag[i] >= 15000) {
                System.out.println((i + 1) + ": " + auftrag[i]);

            }
        }

        //Seite2


    }
}
