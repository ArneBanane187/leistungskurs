package blatt01;

public class TypKonversion {
    public static void main(String[] args) {

        int a = 14;
        double b = -21.25;

        int c = (int) b;
        double d = (double) a;

        System.out.println(c);
        System.out.println(d);

        char e = 'a';
        int f = 65;

        int g = (int) e;
        char h = (char) f;

        System.out.println(g);
        System.out.println(h);

       // boolean t = true;
       // h = (char) t;



    }
}
//b) b macht aus der Kommazahl -21.25 eine ganze Zahl -21. A macht aus einer ganzen Zahl 14 eine Kommazahl 14.0. Ohne int gäbe es einen Fehler ohne double würde es trotzdem funktionieren.
//c) Int speichert nur ganze Zahlen. Während double auch ganze Zahlen speichert, kann es auch Kommazahlen speichern.
//d) Char ist ein Zeichen, das als Zahl im Unicode gespeichert ist. Int ist eine Zahl. Man kann einen Char in eine Zahl umwandeln und eine Zahl in einen Char umwandeln.
//e) Boolean kann man in Java nicht in einen Char umwandeln. Deshalb gibt der Kompiler einen Fehler.