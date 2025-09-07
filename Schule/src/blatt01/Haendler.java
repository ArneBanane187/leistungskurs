package blatt01;

public class Haendler {
    public static void main(String[] args) {

        double normale_sd = 5; //€
        double mini_sd = 8; //€
        double micro_sd = 12; //€
        int anzahl_normale = 3;
        int anzahl_mini = 4;
        int anzahlt_micro = 1;

        double gesamtpreis = anzahl_normale * normale_sd + anzahl_mini * mini_sd + anzahlt_micro * micro_sd;

        System.out.println("Der Preis für ...");
        System.out.println(anzahl_normale + "normale SD-Karten");
        System.out.println(anzahl_mini + "mini SD-Karten");
        System.out.println(anzahlt_micro + "micro SD-Karten");
        System.out.println(gesamtpreis);

    }


}

// 1. Man braucht minimal 7 Variablen.
// 2. Am besten ist double falls die Preise in den Nachkomma bereich gelangen wenn nicht dann int.
// 3. Wenn man nicht double als Variable benutzt könnte es ein Problem mit den Nachkommastellen geben.

