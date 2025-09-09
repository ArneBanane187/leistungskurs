package blatt04;

import java.util.Random;
import java.util.Scanner;

public class ETF {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Für wie viele Jahre wollen Sie das ETF sehen?");
        int jahr = input.nextInt();
        int monat = 0;

        System.out.println("Wie viel ist ihr Sparbetrag?");
        double sparbetrag = input.nextDouble(); //€
        double gesamtbetrag = 0; //€
        double anteilEFT = 3578.89; //€
        double anteil = 0; //%


        while (jahr < 5) {
            jahr ++;
            monat = 0;
            while (monat < 12) {

                monat++;
                double zinssatz = random.nextDouble(0.06, 0.12);
                gesamtbetrag += sparbetrag;
                gesamtbetrag += gesamtbetrag * zinssatz;
                anteil = gesamtbetrag / anteilEFT;

                System.out.println("Jahr: " + jahr);
                System.out.println("Monat: " + monat);
                System.out.printf("Sparbetrag: %.2f € %n", sparbetrag);
                System.out.printf("Gesamtbetrag: %.2f € %n", gesamtbetrag);
                System.out.printf("Anteil: %.5f %%%n", anteil);
                System.out.printf("Zinssatz: %.2f %n%n", zinssatz);

            }
        }
    }
}
