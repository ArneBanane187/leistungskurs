package blatt06;

import java.util.Scanner;

public class NotenlisteArry {
    public static void main(String[] args) {

        int [] noten = new int[10];

        noten[0] = 2;
        noten[1] = 2;
        noten[2] = 3;
        noten[3] = 1;
        noten[4] = 2;
        noten[5] = 4;
        noten[6] = 2;
        noten[7] = 1;
        noten[8] = 3;
        noten[9] = 5;

        for (int i = 0; i<noten.length; i++){
            System.out.println("Note von Index" + i + ": " + noten[i]);
        }

    }
}
