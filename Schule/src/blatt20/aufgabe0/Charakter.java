package blatt20.aufgabe0;

public class Charakter {
    private Charaktername name;
    private String gewichtsklasse;
    private String spezialitem;

    private Charakter kart;
    private Charakter item;

    public Charakter(Charaktername name, String gewichtsklasse, String spezialitem) {
        this.name = name;
        this.gewichtsklasse = gewichtsklasse;
        this.spezialitem = spezialitem;




    }
    public void lenkeKart(Kart kart){

    }
    public void halteItem(Item item){

    }

    public void wirftItem(Item item){

    }

    public Charaktername getName() {
        return name;
    }

    public String getGewichtsklasse() {
        return gewichtsklasse;
    }

    public String getSpezialitem() {
        return spezialitem;
    }
}
