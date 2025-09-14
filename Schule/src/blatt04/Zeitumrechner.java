package blatt04;

import java.util.Scanner;

public class Zeitumrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gebe eine positive Zahl an Sekunden ein: ");

        if (!input.hasNextLong()) {
            System.out.println("Fehler: Bitte eine ganze Zahl eingeben.");
            return;
        }

        long sekunden = input.nextLong();
        if (sekunden < 0) {
            System.out.println("Fehler: Bitte eine positive Zahl eingeben.");
            return;
        }

        long tage = 0, stunden = 0, minuten = 0;

        // Tage berechnen
        while (sekunden >= 86400) {  // 86400 Sekunden = 1 Tag
            sekunden -= 86400;
            tage++;
        }

        // Stunden berechnen
        while (sekunden >= 3600) {   // 3600 Sekunden = 1 Stunde
            sekunden -= 3600;
            stunden++;
        }

        // Minuten berechnen
        while (sekunden >= 60) {     // 60 Sekunden = 1 Minute
            sekunden -= 60;
            minuten++;
        }

        // Rest sind Sekunden
        System.out.printf("%d Tage, %d Stunden, %d Minuten, %d Sekunden%n",
                tage, stunden, minuten, sekunden);

    }
}
// b)
//   103 Tage: Schleife läuft 103-mal (jede Iteration zieht 86400 ab).
//   12 Stunden: Schleife läuft 12-mal (jede Iteration zieht 3600 ab).
//   11 Minuten: Schleife läuft 11-mal (jede Iteration zieht 60 ab).
//   Rest= 43, keine Iteration mehr

// Gesamtzahl der Iteration: 126 Durchgänge.

// c)
//  Ja das geht. Der Rechner benötig nur 6 Durchgänge um es zu berechnen.