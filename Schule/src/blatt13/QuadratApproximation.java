package blatt13;

public class QuadratApproximation {
    /**
     * Funktion die einen Flaecheninhalt von beliebigen Seitenlaengen eines Quadrats berechnet
     * @param a berechnet den Flächeninhalt
     * @return
     */
    public static int flaecheQuardrat(int a){
        int flaecheninhalt = (int) Math.pow (a,2);
        return flaecheninhalt;
    }

    public static int sucheSeitenlaenge(int a){


    }

    public static void main(String[]arcs){
        System.out.println(flaecheQuardrat(6));
    }
}
