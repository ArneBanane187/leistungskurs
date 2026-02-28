package blatt17;

import schisch_visualizer.SchischVisualizer;

public class GameOfLife {

    static char[][] spielfeld;
    public static void initiSpielfeld(int h, int b) {
        spielfeld = blatt14.MultiArrays.createEmpty2DCharArray(h, b);
    }
    //a)
    public static void random (double a){
        blatt14.Simulationen.fuellen(spielfeld, '9', a);
    }

    //b)
    public static void weiter(int w) {
        int zeilen = spielfeld.length;
        int spalten = spielfeld[0].length;


        char[][] naechstesFeld = new char[spielfeld.length][spielfeld[0].length];

        for (int z = 0; z < zeilen; z++) {
            for (int s = 0; s < spalten; s++) {

                // 1. Nachbarn zählen (mit unserer Methode von vorhin)
                int nachbarn = countLebendeNachbarzellen(z, s, spielfeld);

                // 2. Regeln anwenden
                if (spielfeld[z][s] == 'g') {
                    // Zelle lebt aktuell
                    if (nachbarn == 2 || nachbarn == 3) {
                        naechstesFeld[z][s] = 'g'; // Überlebt (Regel 3)
                    } else {
                        naechstesFeld[z][s] = 'r'; // Stirbt (Regel 2 & 4)
                    }
                } else {
                    // Zelle ist aktuell tot
                    if (nachbarn == 3) {
                        naechstesFeld[z][s] = 'g'; // Neugeburt (Regel 1)
                    } else {
                        naechstesFeld[z][s] = 'r'; // Bleibt tot
                    }
                }
            }
        }

        // 3. Das bestehende Spielfeld mit den neuen Werten aktualisieren
        for (int z = 0; z < zeilen; z++) {
            for (int s = 0; s < spalten; s++) {
                spielfeld[z][s] = naechstesFeld[z][s];
            }
        }
    }


    //Regeln der Zellen

    public static void calculateNextGeneration(int z, int s, char[][] spielfeld){
        char[][] nextSpielfeld = new char[spielfeld.length][spielfeld[0].length];

        for(int i = 0; i < spielfeld.length; i++){
            for(int j = 0; j < spielfeld[0].length; j++){

                int lebendeNachbarzelle = countLebendeNachbarzellen(z, s, spielfeld);

                boolean lebt = (spielfeld[i][j] == '9');
                //Regel 1
                if(!lebt && lebendeNachbarzelle == 3){
                    nextSpielfeld[i][j] = '9';
                //Regel 2
                } else if(lebt && lebendeNachbarzelle < 2 || lebt && lebendeNachbarzelle > 3){
                    nextSpielfeld[i][j] = '0';
                //Regel 3
                } else if(lebt && lebendeNachbarzelle == 3 || lebt && lebendeNachbarzelle == 2){
                    nextSpielfeld[i][j] = '9';
                //Regel 4
                } else {
                    nextSpielfeld[i][j] = '0';
                }
            }
        }
    }



    public static int countLebendeNachbarzellen(int z, int s, char[][] spielfeld){
        int count = 0;
        for(int i = 0; i < spielfeld.length; i++){
            for(int j = 0; j < spielfeld[0].length; j++){
                if(spielfeld[i][j] == '9'){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        SchischVisualizer sv = new SchischVisualizer();
        initiSpielfeld(10, 10);
        sv.step(spielfeld);

        random(0.4);
        sv.step(spielfeld);

        calculateNextGeneration(10, 10, spielfeld);
        sv.step(spielfeld);

        weiter(10);
        sv.step(spielfeld);




        sv.start();
    }
}
