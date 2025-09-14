package blatt04;

import java.util.Scanner;

public class Potzenzierung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie die Basis a (Zahl) ein: ");
        if (!input.hasNextDouble()) {
            System.out.println("Fehler: Ungültige Basis.");
            return;
        }
        double a = input.nextDouble();

        System.out.print("Geben Sie den ganzzahligen Exponenten e ein (z.B. -2, 0, 3): ");
        if (!input.hasNextInt()) {
            System.out.println("Fehler: Exponent muss ganzzahlig sein.");
            return;
        }
        int e = input.nextInt();

        // Fall: a == 0 und e <= 0 ist undefiniert (0^0 oder 0^negativ)
        if (a == 0.0 && e <= 0) {
            System.out.println("Fehler: 0^0 bzw. 0^negativ ist nicht definiert.");
            return;
        }

        double result = 1.0;
        int exponentAbs = Math.abs(e);
        for (int i = 0; i < exponentAbs; i++) {
            result *= a;
        }
        if (e < 0) result = 1.0 / result;

        // Wenn Exponent >=0 und Basis ganzzahlig, kann man auch ganzzahlig ausgeben.
        if (e >= 0 && Math.floor(result) == result) {
            System.out.println("Ergebnis: " + (long) result);
        } else {
            System.out.println("Ergebnis: " + result);

        }
    }
}