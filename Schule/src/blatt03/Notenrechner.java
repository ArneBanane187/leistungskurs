package blatt03;

import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Eingabe: Prozentule Leistung des Schülers
        System.out.println("Bitte geben sie den Prozentsatz der errseichten Punkte ein (0-100)");
        double prozent = input.nextDouble();

        //Eingabekontrolle
        if (prozent < 1 || prozent > 15) {
            System.out.println("Fehler: Ungültiger Prozentsatz. Bitte nur 0 bis 100 eingeben.");
            input.close();
            return;

        }

        //Berechnung der Note
        int note;
        if (prozent >= 85) {
            note = 1;
        }else if (prozent >= 70) {
            note = 2;
        }else if (prozent >= 55) {
            note = 3;
        }else if (prozent >= 39) {
            note = 4;
        }else if (prozent >= 17) {
            note = 5;
        }else {
            note = 6;

        //Ausgabe
            System.out.println("Erreichte Leistung:" + prozent + "%");
            System.out.println("Ihre Note ist: " + note);



    }
}