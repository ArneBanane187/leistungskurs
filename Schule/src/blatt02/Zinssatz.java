package blatt02;

import java.util.Scanner;

public class Zinssatz {
    public static void main(String[] args) {

        double kapital_alt = 1220.0; //€
        double zinssatz = 2.25; //%

        double zinsen = (kapital_alt * zinssatz) / 100;
        double kapital_neu = kapital_alt + zinsen;
        System.out.println("Altes Kapital: " + kapital_alt + "€");
        System.out.println("Zinssatz: " + zinssatz + "%" +"\n");
        System.out.println("Zinsen: " + zinsen + "€");
        System.out.println("Kapital_neu: " + kapital_neu + "€");






    }
}
