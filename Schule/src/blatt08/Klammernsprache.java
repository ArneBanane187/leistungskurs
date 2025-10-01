package blatt08;

public class Klammernsprache {
    /**
     * Überprüft die Klammersprache ob jede öffnende Klammer auch einene schließende klammer als Partner hat
     * @param str Klammerwort
     * @return Ausgabe als Boolean
     */
    public static boolean istKlammersprache (String str) {
        char[] charr = str.toCharArray();
        int ergebnis = 0;
        for (int i = 0; i < charr.length; i++) {
            if (ergebnis < 0) {
                return false;
            }
            if (charr[i] == '(') {
                ergebnis++;
            } else if (charr[i] == ')') {
                ergebnis--;
            }
        }
        return ergebnis == 0;
    }
    public static void main(String[] args) {
        System.out.println(istKlammersprache("()()()"));
    }
}
