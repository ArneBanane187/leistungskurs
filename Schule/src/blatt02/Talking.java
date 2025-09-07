package blatt02;

import java.util.Scanner;

public class Talking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Der Scanner wird benannt und eingeschaltet.
        System.out.println("Wie heißt du"); //Eine Frage wird an den Nutzer gestellt.
        String name = input.nextLine(); //Input von Nutzer mithilfe von Scanner.
        System.out.println("Hallo" + name + "!"); // Antwort vom Programm.
    }
}
