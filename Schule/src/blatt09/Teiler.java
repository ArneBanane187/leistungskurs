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

    public static void alleTeiler (int a) {

    }

    public static void main(String[] args) {

        int a = 12;
        int b = 3;
        System.out.println(istTeiler(12, 3));



    }
}
