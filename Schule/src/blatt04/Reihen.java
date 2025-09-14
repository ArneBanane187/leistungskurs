package blatt04;

import java.util.Scanner;

public class Reihen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchten Sie je Reihe ausgegeben bekommen?");

        int zahlen = input.nextInt();

        //Reihe 1: 1, 2, 3, ...
        System.out.println("Reihe 1: ");
        for (int i = 1; i <= zahlen; i++) {
            System.out.print(i + (i < zahlen ? " " : ""));
        }
        System.out.println("\n");

        //Reihe 2: 2, 4, 6, ...
        System.out.println("Reihe 2:");
        for (int i = 1; i <= zahlen; i++) {
            System.out.print((2 * i) + (i < zahlen ? " " : ""));
        }
        System.out.println("\n");

        // Reihe 3: 1, 4, 9, ... (i*i)
        System.out.println("Reihe 3:");
        for (int i = 1; i <= zahlen; i++) {
            System.out.print((i * i) + (i < zahlen ? " " : ""));
        }
        System.out.println("\n");

        // Reihe 4: 1, -1, 2, -2, 3, -3, 4, ...
        System.out.println("Reihe 4:");
        for (int i = 1; i <= zahlen; i++) {
            int value = (i + 1) / 2; // Betragsfolge: 1,1,2,2,3,3,...
            if (i % 2 == 0) value = -value; // gerade Position -> negativ
            System.out.print(value + (i < zahlen ? " " : ""));
        }
        System.out.println();








    }



}
