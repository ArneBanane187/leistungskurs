package blatt25;

public class Sitzmoeglichkeit {

    private int anzahlSitzplatz;
    private int anzahlBesetzt;

    public Sitzmoeglichkeit(int anzahlSitzplatz, int anzahlBesetzt) {
        this.anzahlSitzplatz = 5;
        this.anzahlBesetzt = 0;
    }

    public int getAnzahlSitzplatz() {
        return anzahlSitzplatz;
    }

    public int getAnzahlBesetzt() {
        return anzahlBesetzt;
    }

    public void hinsetzten(){
        if (this.anzahlBesetzt < this.anzahlSitzplatz) {
            this.anzahlBesetzt += 1;
        }
    }
    public void aufstehen(){
        if (this.anzahlBesetzt == this.anzahlSitzplatz) {
            this.anzahlBesetzt -= 1;
        }
    }

}
