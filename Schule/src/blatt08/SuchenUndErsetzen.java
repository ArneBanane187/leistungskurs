package blatt08;

import java.util.Scanner;

public class SuchenUndErsetzen {

    public static String ersetzen (String str) {
        str = str.toLowerCase();
        char[] charr = str.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] == 'a')
                charr[i] = 'b';
        }
        String s = new String(charr);
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie den Buchstaben ein welcher einen anderen ersetzt.");
        char a = input.next().charAt(0);
        System.out.println("Geben sie den Buchstaben ein der ersetzt werden soll.");
        char b = input.next().charAt(0);

        System.out.println(ersetzen());

    }
}
