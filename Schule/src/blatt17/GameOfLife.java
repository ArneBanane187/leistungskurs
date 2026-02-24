package blatt17;

import schisch_visualizer.SchischVisualizer;

public class GameOfLife {

    static char[][] spielfeld;
    public static void initiSpielfeld(int h, int b) {
        spielfeld = blatt14.MultiArrays.createEmpty2DCharArray(h, b);
    }

    public static void Random (double a){
        blatt14.Simulationen.fuellen(spielfeld, '9', a);
    }

    //Regel 1: Eine tote Zelle mit genau drei lebenden Nachbarn wird in der Folgegeneration neu geboren.

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initiSpielfeld(10, 10);
        sv.step(spielfeld);

        Random(0.9);
        sv.step(spielfeld);



        sv.start();
    }
}
