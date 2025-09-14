package blatt04;

import java.util.Scanner;

public class Rechenuebung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein: ");
        if (!input.hasNextDouble()) { System.out.println("Fehler: Ungültige Zahl."); return; }
        double x = input.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        if (!input.hasNextDouble()) { System.out.println("Fehler: Ungültige Zahl."); return; }
        double y = input.nextDouble();

        double produkt = x * y;

        // Spielraum für Fließkommazahlen:
        final double EPS = 1e-9;

        while (true) {
            System.out.printf("Gebe die Lösung von %.1f * %.1f ein.%n", x, y);
            if (!input.hasNextDouble()) {
                System.out.println("Bitte eine Zahl eingeben.");
                input.next(); // Eingabe verwerfen
                continue;
            }
            double antwort = input.nextDouble();
            if (Math.abs(antwort - produkt) <= EPS) {
                System.out.println("Gut! Die Lösung ist " + produkt + "!");
                break;
            } else {
                System.out.println("Falsch. Versuche es noch einmal.");
            }
        }
    }
}
