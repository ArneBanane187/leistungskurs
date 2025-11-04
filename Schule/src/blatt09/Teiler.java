package blatt09;

public class Teiler {

    /**
     * Funktion die überprüft ob eine natürliche Zahl durch eine aandere natürliche Zahl teil bar ist.
     * @param a Variable für die Zahl
     * @param b Variable für den Teiler
     * @return
     */
    public static boolean istTeiler (int a, int b) {
        if (a <= 0 || b <= 0) {
            return false;
        }

        return (a % b == 0);
    }

    /**
     * Methode die alle Teiler einer gegebenen natürlichen Zahl ausgibt
     * @param a
     */
    public static void alleTeiler (int a) {
        System.out.println("alle teiler " + a);
        for( int i = 1; i <= a; i++) {
            if (istTeiler(i, i)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Funktion die die Anzahl der Teiler einer natürlichen Zahl ausgib
     * @param a
     * @return
     */
    public static int anzahlTeiler (int a) {
        System.out.println("Anzahl der Teiler " + a);
        int anzahl = 0;
        for( int i = 1; i <= a; i++) {
            if (istTeiler(i, i)) {
                ;anzahl++;
            }
        }
        return a;
    }

    public static int[] teiler (int a) {
        int anzahl = anzahlTeiler(a);
        int[] teiler = new int[anzahl];

        int i = 0;
        for(int j = 0; j <= a; j++) {
            if (istTeiler(a, j)) {
                teiler[i] = j;
                i++;


            }
        }
        return teiler;
    }

    public static void main(String[] args) {

        int a = 12;
        int b = 3;
        System.out.println(istTeiler(12, 3));
        alleTeiler(a);
        System.out.println();
        anzahlTeiler(a);
        System.out.println();
        teiler(12);



    }
}
