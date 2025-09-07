package blatt02;

import java.util.Scanner;

public class Zinssatz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nennen Sie ihr altes Kapital?");
        double kapital_alt = input.nextDouble();
        System.out.println("Nennen Sie den Zinssatz in Prozent?");
        double zinssatz = input.nextDouble();

        double zinsen = (kapital_alt * zinssatz) / 100;
        double kapital_neu = kapital_alt + zinsen;
        System.out.println("Altes Kapital: " + kapital_alt + "€");
        System.out.println("Zinssatz: " + zinssatz + "%" +"\n");
        System.out.println("Zinsen: " + zinsen + "€");
        System.out.println("Kapital_neu: " + kapital_neu + "€");






    }
}
