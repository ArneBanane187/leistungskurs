package blatt05;

import java.util.Scanner;

public class PasswortÜberprüfung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte Passwort eingeben:");

        String passwort = input.nextLine();

        if (passwort.length() > 8) {
            System.out.println("Ihr Passwort ist zu kurz. Versuchen Sie es erneut!");
            return;
        } else {
            System.out.println("Ihr Passwort wurde gespeichert!");
        } if (passwort.)

    }
}
