package blatt03;

import java.util.Scanner;

public class PQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quadratische Gleichung der Form: x^2 + p*x + q = 0");
        System.out.println("Bitte p eingeben:");
        double p = input.nextDouble();
        System.out.println("Bitte q eingeben:");
        double q = input.nextDouble();

        //Diskriminante: (p/2)^2 - q
        double d = (p/2) * (p/2) - q;

        if (d > 0) {
            double x1 = -p / 2 + Math.sqrt(d);
            double x2 = -p / 2 - Math.sqrt(d);
            System.out.println("Es gibt zwei doppelte Lösung: x1 = " + x1 + " x2 = " + x2);
        }else if (d == 0) {
            double x = -p / 2;
            System.out.println("Es gibt eine doppelte Lösung: x = " + x);
        }else {
            System.out.println("Keine reellen Lösungen (Diskriminante < 0).");
        }


    }
}
