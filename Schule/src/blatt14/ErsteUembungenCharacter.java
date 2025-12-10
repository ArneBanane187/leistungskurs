package blatt14;

import schisch_visualizer.SchischVisualizer;

public class ErsteUembungenCharacter {

    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        sv.setVisible(true);

        char[][] arr = MultiArrays.createEmpty2DCharArray(11, 14);
        sv.step(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = '1';
            sv.step(arr);
        }

        for (int i = 0; i < arr[0].length; i++) {
            arr[arr.length - 1][i] = '1';
            sv.step(arr);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i][arr[0].length - 1] = '1';
            sv.step(arr);
        }

        for (int i = arr[0].length - 1; i >= 0; i--) {
            arr[0][i] = '1';
            sv.step(arr);
        }

        for (int i = 0; i<= 11; i++){
            arr[2][i] = '1';
            sv.step(arr);
        }
        for (int i = 0; i<= 11; i++){
            arr[arr.length - 3][i] = '1';
            sv.step(arr);
        }

        arr[3][11] = '1';
        sv.step(arr);
        arr[4][11] = '1';
        sv.step(arr);
        arr[7][11] = '1';
        sv.step(arr);
        arr[6][11] = '1';
        sv.step(arr);

        for (int i = 4; i<= 6; i++){
            arr[i][3] = '1';
            sv.step(arr);
        }

        for (int i = 4; i<= 6; i++){
            arr[i][5] = '1';
            sv.step(arr);
        }
        arr[5][12] = 'P';
        sv.step(arr);

        sv.start();


    }

}
