package blatt02;

import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {


        double normale_sd = 5; //€
        double mini_sd = 8; //€
        double micro_sd = 12; //€

        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele normale SD-Karten haben Sie?");
        int anzahl_normale = input.nextInt();
        System.out.println("Wie viele mini SD-Karten haben Sie?");
        int anzahl_mini = input.nextInt();
        System.out.println("Wie viele micro SD-Karten haben Sie?");
        int anzahlt_micro = input.nextInt();


        double gesamtpreis = anzahl_normale * normale_sd + anzahl_mini * mini_sd + anzahlt_micro * micro_sd;

        System.out.println("Der Preis für ...");
        System.out.println(anzahl_normale + " normale SD-Karten");
        System.out.println(anzahl_mini + " mini SD-Karten");
        System.out.println(anzahlt_micro + " micro SD-Karten");
        System.out.println(gesamtpreis);
    }
}
