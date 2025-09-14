package blatt04;

import java.util.Random;
import java.util.Scanner;


public class Topfschlagen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int topfx = random.nextInt(0, 5);
        int topfy = random.nextInt(0, 5);

        int startx = 3;
        int starty = 3;

        int altPlayerx = startx;
        int altPlayery = starty;

        int playerx = startx;
        int playery = starty;

        while (true) {
            altPlayerx = playerx;
            altPlayery = playery;
            if(topfx == playerx && topfy == playery) {
                System.out.println("Sie haben den Topf gefunden.");
                break;

            }
            System.out.println("Wo wollen sie hin? (w, a, s, d)");
            char steuerung = input.next().charAt(0);
            if (steuerung == 'w'){
                playery += 1;
            }else if (steuerung == 's'){
                playery -= 1;
            }else if (steuerung == 'd'){
                playerx += 1;
            }else if (steuerung == 'a'){
                playerx -= 1;
            }
        }
        if (playerx == -1) {
            System.out.println("Hier ist der Suchbereich zu ende!");
            playerx += 1;
        } else if (playerx == 6) {
            System.out.println("Hier ist der Suchbereich zu ende!");
            playerx -= 1;
        }else if (playery == -1){
            System.out.println("Hier ist der Suchbereich zu ende!");
            playery += 1;
        }else if (playery == 6){
            System.out.println("Hier ist der Suchbereich zu ende!");
            playery -= 1;
        }


    }
}
