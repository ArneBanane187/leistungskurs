package blatt20.aufgabe0;

public class Item {
    private String name;
    private String wirkung;
    private boolean aktiv;

    public Item(String name, String wirkung, boolean aktiv) {
        this.name = name;
        this.wirkung = wirkung;
        this.aktiv = aktiv;
    }

    public void wirkeAn(Charakter charakter){

    }

    public String getName() {
        return name;
    }

    public String getWirkung() {
        return wirkung;
    }

    public void setWirkung(String wirkung) {
        this.wirkung = wirkung;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }
}
