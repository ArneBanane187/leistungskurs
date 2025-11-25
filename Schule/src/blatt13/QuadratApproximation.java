package blatt13;

public class QuadratApproximation {
    //a)
    /**
     * Funktion die einen Flaecheninhalt von beliebigen Seitenlaengen eines Quadrats berechnet
     * @param a berechnet den Flächeninhalt
     * @return
     */
    public static int flaecheQuardrat(int a){
        int flaecheninhalt = (int) Math.pow (a,2);
        return flaecheninhalt;
    }
    //b)

    /**
     * Funktion die, die Seitenlänge aus einem Flächeninhalt eines Quadrates appromativ errechnet.
     * @param a
     * @return
     */
    public static int sucheSeitenlaenge(int a){
        return (int) Math.sqrt(a);
    }


    public static void main(String[]arcs){
        System.out.println(flaecheQuardrat(6));
        System.out.println(sucheSeitenlaenge(36));
    }
}
