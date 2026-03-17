package blatt20.aufgabe0;

public class Benutzerkonto {
    private String benutzername;
    private String password;
    private String email;
    private String geburtsdatum;
    private double gutscheinguthaben;
    String gutscheinCode = "Jaaa";


    public Benutzerkonto (double gutscheinguthaben, String benutzername, String password, String email, String geburtsdatum) {
        this.benutzername = benutzername;
        this.password = password;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.gutscheinguthaben = 0;

    }

    public boolean anmelden(String password) {
        if(this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public boolean passwordAendern(String passwordAlt, String passwordNeu) {
        if(anmelden(passwordAlt)) {
            this.password = passwordNeu;

        }
        return false;
    }

    public void gutscheinEinloesen(String gutscheinCode, double gutscheinguthaben) {
        if(gutscheinCode.equals(this.gutscheinCode)) {
            this.gutscheinguthaben = gutscheinguthaben;
        }
    }

}
