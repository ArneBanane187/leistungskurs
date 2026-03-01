package blatt17;

import schisch_visualizer.SchischVisualizer;

public class LangtonsAmeisen {
    public static void feld(int z, double w){
        w = w / 100;

        SchischVisualizer sv = new SchischVisualizer();

        char[][] spielfeld = blatt14.MultiArrays.createEmpty2DCharArray(100,100);

        for(int j=0;j<z;j++){
            char[][] spielfeldNeu = blatt14.MultiArrays.copy2DCharArray(spielfeld);

            for(int k=0;k<spielfeld.length;k++){
                for(int l=0;l<spielfeld[1].length;l++){

                    if(spielfeld[k][l]==' '){
                        if(Math.random()< w){
                            spielfeldNeu[k][l]='1';
                        }
                    }
                }
            }
            sv.step(spielfeldNeu);
        }
        sv.start();
    }


    public static void main(String[] args) {
        feld(10, 0.4);


    }
}
