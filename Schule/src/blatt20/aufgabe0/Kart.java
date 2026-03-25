package blatt20.aufgabe0;

public class Kart {
    private String modellName;
    private double maxGeschwindigkeit;
    private double beschleunigung;

    private Kart charakter;

    public Kart(String modellName, double maxGeschwindigkeit, double beschleunigung) {
        this.modellName = modellName;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.beschleunigung = beschleunigung;
    }

    public void beschleunigen(){

    }
    public void bremsen(){

    }
    public void drifte(){

    }

    public String getModellName() {
        return modellName;
    }

    public void setModellName(String modellName) {
        this.modellName = modellName;
    }

    public double getMaxGeschwindigkeit() {
        return maxGeschwindigkeit;
    }

    public void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
        this.maxGeschwindigkeit = maxGeschwindigkeit;
    }

    public double getBeschleunigung() {
        return beschleunigung;
    }

    public void setBeschleunigung(double beschleunigung) {
        this.beschleunigung = beschleunigung;
    }
}
