package blatt08;

import java.util.Scanner;

public class Palindrom {
    /**
     * Dreht ein Wort um
     * @param str  das Wort was umgedreht wird.
     * @return
     */
    public static String umdrehen (String str){
        str= str.toLowerCase();
        char[] charr = str.toCharArray();
        for (int i = 0; i < charr.length / 2; i++) {
            char zwischenSpeicher = charr[i];
            charr[i] = charr[charr.length - i - 1];
            charr[charr.length - i - 1] = zwischenSpeicher;
        }
        String s = new String(charr);
        return s;
    }

    /**
     * Überprüft Wörter ob sie Palindrome sind.
     * @param str Das zu überprüfende Wort.
     * @return
     */
    public static boolean isPalindrom (String str) {
        str = str.toLowerCase();
        char [] charr =  str.toCharArray();
        for (int i = 0; i < charr.length / 2; i++) {
            if (charr[i] != charr[charr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nennen Sie ein Wort.");
        String str = input.nextLine();
        System.out.println(isPalindrom(str));


        System.out.println(umdrehen(str));
    }
}
