package blatt20_aufgabe1;

import java.util.Random;

/**
 * Repräsentiert eine Kaffeemaschine, die zustandsbasiert arbeitet.
 * Erlaubt das Verwalten von Bohnen, Wasser, Kaffeesatz und den Reinigungszustand.
 * * @author Dein Name
 * @version 1.0
 */
public class Kaffeemaschine {

    // a) Klassenvariablen (Attribute) [cite: 461]
    double bohnen;      // in Gramm, max. 350g
    double wasser;      // in ml, max. 800ml
    double dreck;       // in Prozent (0 bis 100)
    double kaffeesatz;  // in Gramm, max. 600g

    // b) Prozeduren zur Verwaltung der Behälter [cite: 462]

    /**
     * Füllt Kaffeebohnen auf. Der Behälter fasst maximal 350g.
     * @param menge Menge der Bohnen in Gramm, die hinzugefügt werden sollen.
     */
    public void bohnenAuffuellen(double menge) {
        if (this.bohnen + menge <= 350) {
            this.bohnen += menge;
        } else {
            this.bohnen = 350; // Wenn zu viel, fülle nur bis zum Maximum [cite: 448, 449]
        }
    }

    /** Leert den Bohnenbehälter komplett. */
    public void bohnenLeeren() {
        this.bohnen = 0; // [cite: 450]
    }

    /**
     * Füllt Wasser auf. Der Behälter fasst maximal 800ml.
     * @param menge Menge des Wassers in ml.
     */
    public void wasserAuffuellen(double menge) {
        if (this.wasser + menge <= 800) {
            this.wasser += menge;
        } else {
            this.wasser = 800; // [cite: 451]
        }
    }

    /** Leert den Wasserbehälter komplett. */
    public void wasserLeeren() {
        this.wasser = 0; // [cite: 451]
    }

    /** Reinigt den Wasserbehälter (setzt Dreck auf 0%), wenn dieser leer ist. */
    public void wasserReinigen() {
        if (this.wasser == 0) {
            this.dreck = 0; // [cite: 452]
            System.out.println("Wasserbehälter wurde erfolgreich gereinigt.");
        } else {
            System.out.println("Fehler: Der Wasserbehälter muss zum Reinigen komplett leer sein!");
        }
    }

    /** Leert den Kaffeesatzbehälter komplett. */
    public void kaffeesatzLeeren() {
        this.kaffeesatz = 0; // [cite: 462]
    }

    // c) Prozedur kaffeeZiehen [cite: 463]

    /**
     * Bereitet einen Kaffee zu, sofern alle Bedingungen erfüllt sind.
     * @param intensitaet Gewünschte Intensität zwischen 1 und 10 [cite: 453]
     * @param menge Gewünschte Menge in ml zwischen 10 und 200 [cite: 453]
     */
    public void kaffeeZiehen(int intensitaet, double menge) {
        // 1. Parameter prüfen
        if (intensitaet < 1 || intensitaet > 10) {
            System.out.println("Fehler: Intensität muss zwischen 1 und 10 liegen.");
            return;
        }
        if (menge < 10 || menge > 200) {
            System.out.println("Fehler: Die Menge muss zwischen 10 und 200 ml liegen.");
            return;
        }

        // 2. Benötigte Bohnen berechnen: 0.5g pro Intensitätspunkt je 10ml [cite: 454, 455]
        double benoetigteBohnen = (intensitaet * 0.5) * (menge / 10.0);

        // 3. Füllstände prüfen
        if (this.bohnen < benoetigteBohnen) {
            System.out.println("Fehler: Nicht genug Bohnen für diesen Kaffee!");
            return;
        }
        if (this.wasser < menge) {
            System.out.println("Fehler: Nicht genug Wasser!");
            return;
        }
        if (this.kaffeesatz + benoetigteBohnen > 600) {
            System.out.println("Fehler: Kaffeesatzbehälter voll! Bitte vorher leeren."); // [cite: 460]
            return;
        }

        // 4. Verschmutzungsgrad prüfen [cite: 457, 458]
        if (this.dreck >= 90) {
            System.out.println("Fehler: Maschine zu dreckig (>= 90%)! Es kann kein Kaffee mehr gezogen werden.");
            return;
        }

        Random rand = new Random();
        int chance = rand.nextInt(100); // Erzeugt Zufallszahl zwischen 0 und 99

        if (this.dreck >= 75) {
            if (chance < 50) { // 50% Fehlerwahrscheinlichkeit
                System.out.println("Fehlermeldung: Kaffeezubereitung abgebrochen (Verschmutzung zu hoch).");
                this.dreck += 1; // Auch ein Fehlversuch ist ein Prozess [cite: 456]
                return;
            }
        } else if (this.dreck > 50) {
            if (chance < 25) { // 25% Fehlerwahrscheinlichkeit
                System.out.println("Fehlermeldung: Kaffeezubereitung abgebrochen (Maschine verschmutzt).");
                this.dreck += 1;
                return;
            }
        }

        // 5. Kaffee erfolgreich zubereiten: Zustände anpassen
        this.bohnen -= benoetigteBohnen;
        this.wasser -= menge;
        this.kaffeesatz += benoetigteBohnen; // [cite: 459]
        this.dreck += 1; // [cite: 456]

        System.out.println("Erfolg: Kaffee zubereitet! (" + menge + " ml, Intensität: " + intensitaet + ")");
    }
}