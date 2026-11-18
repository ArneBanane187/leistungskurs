package blatt41.aufgabe01;

public class Nachricht {

    private String protokoll;
    private String nachricht;
    // Default-Konstruktor
    public Nachricht() {
        this.protokoll = "";
        this.nachricht = "";
    }
    // Parameter-Konstruktor
    public Nachricht(String protokoll, String nachricht) {
        this.protokoll = protokoll;
        this.nachricht = nachricht;
    }
    // b) Nachricht vorbereiten
    public String prepareMessage() {
        if (protokoll != null && nachricht != null
                && !protokoll.isEmpty() && !nachricht.isEmpty()) {
            return protokoll + "|" + nachricht;
        }
        return "";
    }
    // c) Überprüfen, ob String das richtige Format besitzt
    public static boolean isValid(String text) {
        if (text == null) {
            return false;
        }
        String[] teile = text.split("\\|", -1);
        return teile.length == 2
                && !teile[0].isEmpty()
                && !teile[1].isEmpty();
    }
    // d) Protokoll zurückgeben
    public String getProtokoll() {
        return protokoll;
    }
    // d) Nachricht zurückgeben
    public String getNachricht() {
        return nachricht;
    }
    // e) Nachricht setzen
    public void setMessage(String text) {
        if (isValid(text)) {
            String[] teile = text.split("\\|", 2);
            this.protokoll = teile[0];
            this.nachricht = teile[1];
        }
    }

    public static void main(String[] args) {

    }
}


