package blatt03;

import java.util.Scanner;

public class PQAllgemein {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quadratische Gleichung der Form: a*x^2 + b*x + c = d");
        System.out.println("Bitte a eingeben:");
        double a = input.nextDouble();
        System.out.println("Bitte b eingeben:");
        double b = input.nextDouble();
        System.out.println("Bitte c eingeben:");
        double c = input.nextDouble();
        System.out.println("Bitte d eingeben:");
        double d = input.nextDouble();

        // Nomieren auf Standardsform: a*x^2 + b*x + (c - d) = 0
        c = c - d;

        if (a == 0){
            // Sonderfall: keine quadratische Gleichung
            if(b != 0){
                double x = -c / b;
                System.out.println("Liniare Lösung: x = " + x);
            } else {
                System.out.println("Ungültige Eingabe: a=0 und b=0 keine eindeutige Lösung.");
            }
        } else {
            double diskriminante = b * b - 4 * a * c;
            if (diskriminante > 0){
                double x1 = (-b + Math.sqrt(diskriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(diskriminante)) / (2 * a);
                System.out.println("Es gibt zwei Lösungen: x1 = " + x1 + ", x2 = " + x2);
            }else if (diskriminante == 0){
                double x = -b / (2 * a);
                System.out.println("Eine dopplte Lösung: x = " + x);
            } else {
                System.out.println("Keine reellen Lösungen (Diskriminante < 0).");
            }
        }
    }
}
