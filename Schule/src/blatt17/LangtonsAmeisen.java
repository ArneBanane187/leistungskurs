package blatt17;

import blatt14.MultiArrays;
import schisch_visualizer.SchischVisualizer;

public class LangtonsAmeisen {
    public static void feld(int z, double w){
        w = w / 100;

        SchischVisualizer sv = new SchischVisualizer();

        char[][] spielfeld = MultiArrays.createEmpty2DCharArray(100,100);
        char[][] spielfeldAlt = blatt14.MultiArrays.copy2DCharArray(spielfeld);
        blatt14.Simulationen.fuellen(spielfeld,'1',w);



        for(int j=0;j<z;j++){
            for(int k=0;k<spielfeld.length;k++){
                for(int l=0;l<spielfeld[1].length;l++){
                    spielfeldAlt[49][49] = 'v';

                    if(spielfeldAlt[k][l] == ' '){

                    }
                }
            }
            sv.step(spielfeld);
        }
        sv.start();
    }




    public static void main(String[] args) {
        feld(10, 15);


    }
}
