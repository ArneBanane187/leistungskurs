package blatt25;

public class Couch extends Sitzmoeglichkeit {

    private int anzahlSitzplatzMin;
    private int anzahlSitzplatzMax;

    public Couch(int anzahlSitzplatz, int anzahlBesetzt, int anzahlSitzplatzMin, int anzahlSitzplatzMax) {
        super(anzahlSitzplatz, anzahlBesetzt);
        this.anzahlSitzplatzMin = anzahlSitzplatzMin;
        this.anzahlSitzplatzMax = anzahlSitzplatzMax;
    }

    public int getAnzahlSitzplatzMin() {
        return anzahlSitzplatzMin;
    }

    public int getAnzahlSitzplatzMax() {
        return anzahlSitzplatzMax;
    }

    public void couch(){
        if(this.anzahlSitzplatzMin >= 2 ){
            System.out.println("Das ist eine Couch!");
        }
    }

    public void eckCouch(){
        if(this.getAnzahlBesetzt() <= 3){
            System.out.println("Das ist eine Eckcouch!");
        }
    }
}
