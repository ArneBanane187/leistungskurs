package blatt03;

import java.util.Scanner;

public class SpringImKreis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Eingabe der Kordinaten
        System.out.println("Bitte geben Sie die x-Kordinate ein: ");
        double x = input.nextDouble();

        System.out.println("Bitte geben Sie die y-Kordinate ein: ");
        double y = input.nextDouble();

        //Berechnung Abstand zum Ursprung
        double abstand = Math.sqrt(x*x + y*y);

        //a) Prüfung innerhalb des Einheitskreises (Radius 1)
        if (abstand < 1) {
            System.out.println("Der Punkt liegt innerhalb des Einheitskreises.");
        }else if (abstand == 1) {
            System.out.println("Der Punkt liegt genau auf dem Rand des Einheitskreises.");
        }else {
            System.out.println("Der Punkt liegt außerhalb des Einheitskreises.");
        }

        //c) Erweiterung: beliebiger Radius
        System.out.println("Bitte geben Sie den Radius eines Kreises ein: ");
        double radius = input.nextDouble();

        if (abstand < radius) {
            System.out.println("Der Punkt liegt innerhalb des Kreises mit Radius " + radius + ".");
        } else if (abstand == radius) {
            System.out.println("Der Punkt liegt genau auf dem Rand des Kraises mit Radius " + radius + ".");
        }else {
            System.out.println("Der Punkt liegt außerhalb des Kreises mit Radius " + radius + ".");
        }
    }
}
