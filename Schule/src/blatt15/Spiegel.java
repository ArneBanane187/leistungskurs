package blatt15;

import blatt14.Simulationen;
import blatt14.MultiArrays;
import schisch_visualizer.SchischVisualizer;


public class Spiegel {
    public static char[][] spielfeld (int width, int height) {
        char[][] charr = MultiArrays.createEmpty2DCharArray(width, height);


        for (int i = 0; i < charr.length; i++) {
            charr[i][0] = '8';
        }
        for (int i = 0; i < charr.length; i++) {
            charr[i][charr[0].length - 1] = '8';
        }
        for (int i = 0; i < charr[0].length; i++) {
            charr[0][i] = '8';
        }
        for (int i = 0; i < charr[0].length; i++) {
            charr[charr.length - 1][i] = '8';
        }

        return charr;
    }

    public static void zufallSpiegel(char[][] charr, int ws, ) {
        for (int i = 0; i < charr.length; i++) {
            for (int j = 0; j < charr[0].length; j++) {
                Simulationen.fuellen(, ws);
            }
        }

    }





    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();

        char[][] charr = spielfeld(40, 40);
        sv.step(charr);

        sv.start();

    }
}
