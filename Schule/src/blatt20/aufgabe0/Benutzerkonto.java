package blatt20.aufgabe0;

public class Benutzerkonto {
    private String benutzername;
    private String password;
    private String email;
    private String geburtsdatum;
    private double gutscheinguthaben;
    String[] gutscheinCode; //TODO: Array für mehrere Gutscheincodes?


    public Benutzerkonto (double gutscheinguthaben, String benutzername, String password, String email, String geburtsdatum) {
        this.benutzername = benutzername;
        this.password = password;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.gutscheinguthaben = 0;



    }

    public void setBenutzername(String benutzername, String password) {
        if(password.equals(this.password)) {
            this.benutzername = benutzername;
        }
    } //TODO: ?

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public String getEmail() {
        return email;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public double getGutscheinguthaben() {
        return gutscheinguthaben;
    }

    public String[] getGutscheinCode() {
        return gutscheinCode;
    }

   public double setGutscheinCode(String gutscheinCode) {
        if(gutscheinCode.equals(this.gutscheinCode)) {
            this.gutscheinguthaben = Math.random();
        }
        return gutscheinguthaben;
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
            return true;
        }
        return false;
    }

    public void gutscheinEinloesen(String gutscheinCode, double gutscheinguthaben) {
        if(gutscheinCode.equals(this.gutscheinCode)) {
            this.gutscheinguthaben = gutscheinguthaben;
        }
    }





}
