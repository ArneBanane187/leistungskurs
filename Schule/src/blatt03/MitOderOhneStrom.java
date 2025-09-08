package blatt03;

import java.util.Scanner;

public class MitOderOhneStrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte wählen Sie ein Gatter (AND, OR, XOR, NOT): ");
        String gatter = input.nextLine().toUpperCase();

        boolean eingang1 = false;
        boolean eingang2 = false;

        // Eingang für NOT-Gatter: nur ein Eingang
        if (gatter.equals("Not")) {
            System.out.println("Befindet sich auf dem Eingnag Strom? (true/false): ");
            eingang1 = input.nextBoolean();
            boolean ergebnis = !eingang1;
            System.out.println("Ergebnis: NOT" + eingang1 + " = " + ergebnis);
        } else {
            // Eingang für Gatter mit 2 Eingängen
            System.out.println("Befindet sich auf dem ersten Eingnagn Strom? (true/false): ");
            eingang1 = input.nextBoolean();
            System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false): ");
            eingang2 = input.nextBoolean();

            boolean ergebnis = false;

            switch (gatter) {
                case "AND":
                    System.out.println("Das AND-Gatter: 2 Eingänge, 1 Ausgang.");
                    ergebnis = eingang1 && eingang2;
                    System.out.println(eingang1 + " AND" + eingang2 + " = " + ergebnis);
                    break;
                case "OR":
                    System.out.println("Das OR-Gatter: 2 Eingänge, 1 Ausgang.");
                    ergebnis = eingang1 || eingang2;
                    System.out.println(eingang1 + " OR" + eingang2 + " = " + ergebnis);
                    break;
                case "XOR":
                    System.out.println("Das XOR-Gatter: 2 Eingänge, 1 Ausgang.");
                    ergebnis = eingang1 ^ eingang2;
                    System.out.println(eingang1 + " XOR" + eingang2 + " = " + ergebnis);
                    break;
                default:
                    System.out.println("Ungültiges Gatter gewählt!");
            }
        }


    }
}
