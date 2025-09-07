package blatt03;

import java.util.Scanner;

public class Haendler {
    public static void main(String[] args) {

        // Preise pro Stück
        double preisNormale = 5.0;
        double preisMini = 8.0;
        double preisMicro = 12.0;

        final int MAX_BESTELLUNG = 50;    // maximale Stückzahl pro Sorte
        final double RABATT_PROZENT = 15.0; // Rabatt in %

        Scanner input = new Scanner(System.in);

        // Eingabe mit Plausibilitätsprüfung
        System.out.print("Wie viele normale SD-Karten möchten Sie bestellen? ");
        int anzahlNormale = input.nextInt();
        if (anzahlNormale < 0) {
            System.out.println("Fehler: Negative Eingabe ist nicht erlaubt!");
            input.close();
            System.exit(0);
        }
        if (anzahlNormale > MAX_BESTELLUNG) {
            System.out.println("Maximal 50 erlaubt – Ihre Bestellung wird auf 50 gesetzt.");
            anzahlNormale = MAX_BESTELLUNG;
        }

        System.out.print("Wie viele mini SD-Karten möchten Sie bestellen? ");
        int anzahlMini = input.nextInt();
        if (anzahlMini < 0) {
            System.out.println("Fehler: Negative Eingabe ist nicht erlaubt!");
            input.close();
            System.exit(0);
        }
        if (anzahlMini > MAX_BESTELLUNG) {
            System.out.println("Maximal 50 erlaubt – Ihre Bestellung wird auf 50 gesetzt.");
            anzahlMini = MAX_BESTELLUNG;
        }

        System.out.print("Wie viele micro SD-Karten möchten Sie bestellen? ");
        int anzahlMicro = input.nextInt();
        if (anzahlMicro < 0) {
            System.out.println("Fehler: Negative Eingabe ist nicht erlaubt!");
            input.close();
            System.exit(0);
        }
        if (anzahlMicro > MAX_BESTELLUNG) {
            System.out.println("Maximal 50 erlaubt – Ihre Bestellung wird auf 50 gesetzt.");
            anzahlMicro = MAX_BESTELLUNG;
        }

        // Berechnung des Gesamtpreises
        double gesamtpreis = anzahlNormale * preisNormale +
                anzahlMini * preisMini +
                anzahlMicro * preisMicro;

        // Gesamtanzahl aller Karten
        int gesamtAnzahl = anzahlNormale + anzahlMini + anzahlMicro;

        // Rabattprüfung
        if (gesamtAnzahl >= 15) {
            double rabatt = gesamtpreis * (RABATT_PROZENT / 100.0);
            double endpreis = gesamtpreis - rabatt;

            System.out.println("\n--- Bestellübersicht ---");
            System.out.println(anzahlNormale + " normale SD-Karten");
            System.out.println(anzahlMini + " mini SD-Karten");
            System.out.println(anzahlMicro + " micro SD-Karten");

            System.out.printf("Normaler Preis: %.2f EUR%n", gesamtpreis);
            System.out.printf("Rabatt (%.0f%%): %.2f EUR%n", RABATT_PROZENT, rabatt);
            System.out.printf("Endpreis: %.2f EUR%n", endpreis);
        } else {
            System.out.println("\n--- Bestellübersicht ---");
            System.out.println(anzahlNormale + " normale SD-Karten");
            System.out.println(anzahlMini + " mini SD-Karten");
            System.out.println(anzahlMicro + " micro SD-Karten");

            System.out.printf("Gesamtpreis: %.2f EUR%n", gesamtpreis);
        }

        input.close();
    }
}
