package blatt02;

import java.util.Scanner;

public class AmiiboKostenRechner {
    public static void main(String[] args) {
        double amiibo_figur = 15;
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Figuren wollen sie kaufen?");
        int anz = input.nextInt(); //TODO: Programm hat einen Fehler.
        System.out.printf("Ihr Einkauf kostet %.2f €", amiibo_figur * anz);


    }
}
