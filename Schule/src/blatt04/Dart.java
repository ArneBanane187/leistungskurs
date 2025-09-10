package blatt04;

import java.util.Scanner;

public class Dart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Erzeuge Scanner

        int punkte = 501; //Variable "punkte" mit 501 initialisiert -->Startwert


        while (true){
            System.out.println("Gebe deine Punktzahl ein (0-180)");
            int wurf = scanner.nextInt();

            if (wurf > 180){
                System.out.println("Wie viel aura haben Sie wenn du mehr als 180 Punkte hast?");
                continue;
            }
            if (punkte == 0){
                System.out.println("Sie haben gewonnen.");
                break;
            } else if ( punkte < 0){
                punkte += wurf;
                System.out.println("Ihr Wurf hat 0 Punkte überschritten. Ihre Punktzahl:" + punkte );
            }
            System.out.println("Punktzahl" + punkte);
        }



    }
}
