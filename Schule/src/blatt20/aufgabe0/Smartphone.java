package blatt20.aufgabe0;

public class Smartphone {

    private String marke;
    private String modell;
    private int akkustand;
    private int preis;
    private int speicherplatz;
    private double displaygroesse;
    private int helligkeit;
    private int lautstaerke;
    private String betriebssystem;

    public Smartphone(int speicherplatz, int preis, String modell, String marke) {
        this.speicherplatz = speicherplatz;
        this.preis = preis;
        this.modell = modell;
        this.marke = marke;
        this.akkustand = 100;
        this.helligkeit = 100;
        this.lautstaerke = 100;
        this.betriebssystem = betriebssystem;
        this.displaygroesse = displaygroesse;


    }
    public void speicherLeeren(){
        this.speicherplatz = 0;
    }
    public void akkuLaden(){
        this.akkustand = 0;
    }

    public boolean einschalten(){
        if(akkustand >= 1){
            return true;
        }
        return false;
    }

    public boolean istAkkuLeer(){
        if(akkustand == 0){
            return true;
        }
        return false;
    }

    public boolean appInstalieren(){
        if(this.einschalten()){
            return true;
        }
        return false;
    }

    public boolean hatGenungSpeicher(){
        if(this.speicherplatz >= 0){
            return true;
        }
        return false;
    }

    public int getAkkustand() {
        return akkustand;
    }
    public void setAkkustand(int akkustand) {
        this.akkustand = Math.max(akkustand, 0);
        this.akkustand = Math.min(akkustand, 100);
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = Math.max(preis, 0);
    }

    public int getSpeicherplatz() {
        return speicherplatz;
    }
    public void setSpeicherplatz(int speicherplatz) {
        this.speicherplatz = Math.max(speicherplatz, 0);
    }

    void nutzen(int l) {
        setAkkustand(this.akkustand - l);
    }

    void laden(int l) {
        setAkkustand(this.akkustand + l);
    }

    public int getHelligkeit() {
        return helligkeit;
    }

    public void setHelligkeit(int helligkeit) {
        this.helligkeit = Math.max(helligkeit, 100);
        this.helligkeit = Math.min(helligkeit, 10 );
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = Math.max(lautstaerke, 100);
        this.lautstaerke = Math.min(lautstaerke, 0);
    }

    public double getDisplaygroesse() {
        return displaygroesse;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ! (o instanceof  Smartphone)) {
            return false;
        }
        Smartphone a = (Smartphone) o;

        return this.marke.equals(a.marke) && this.modell.equals(a.modell) && this.akkustand == a.akkustand && this.preis == a.preis && this.speicherplatz == a.speicherplatz;


    }
}
