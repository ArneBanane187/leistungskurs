package blatt17;

import schisch_visualizer.SchischVisualizer;

public class Waldentwickelung {
    public static void waldentwickelung (double p, double q, int z){
        p = p / 100;
        q = q / 100;

        SchischVisualizer sv = new SchischVisualizer();

        char[][] wald = blatt14.MultiArrays.createEmpty2DCharArray(100, 100);

        for (int i=0; i< z; i++){
            char[][] waldalt = blatt14.MultiArrays.copy2DCharArray(wald);

            for (int j=0; j< wald.length; j++){
                for (int k=0; k<wald[0].length; k++){
                    if(waldalt[j][k] == ' '){
                        int nachbarnBaum = blatt14.Simulationen.zaehlenVier(wald, j, k, '9', false);
                        if(Math.random() < p + nachbarnBaum * 0.02){
                            wald[j][k] = '9';
                        }
                    } if(waldalt[j][k] == '9'){
                        if (Math.random() < q) {
                            wald[j][k] = '4';
                        }
                    } if(waldalt[j][k] == '4'){
                        wald[j][k] = ' ';
                        if (k >= 1 && waldalt[j][k - 1] == '9'){
                            wald[j][k - 1] = '4';
                        } if(j <= 98 && waldalt[j + 1][k] == '9'){
                            wald[j + 1][k] = '4';
                        } if(k<= 98 && waldalt[j][k + 1] == '9'){
                            wald[j][k + 1] = '4';
                        } if(j>=1 && waldalt[j - 1][k] == '9'){
                            wald[j - 1][k] = '4';
                        }
                    }
                }
            }
            sv.step(wald);

        }

        sv.start();
    }
    public static void main(String[] args) {
        waldentwickelung(0.5, 0.5, 8000);
    }
}
