package blatt29;

public abstract class Wesen {

    private int staerke;
    private int kondition;
    private int mStaerke;
    private int mVerteidigung;
    private int heilpunkte;
    private int spezialpunkte;
    private int geschwindigkeit;
    private int glueck;


    public Wesen(int staerke, int kondition, int mStaerke, int mVerteidigung, int heilpunkte, int spezialpunkte, int geschwindigkeit, int glueck) {
        this.staerke = staerke;
        this.kondition = kondition;
        this.mStaerke = mStaerke;
        this.mVerteidigung = mVerteidigung;
        this.heilpunkte = heilpunkte;
        this.spezialpunkte = spezialpunkte;
        this.geschwindigkeit = geschwindigkeit;
        this.glueck = glueck;
    }


    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getKondition() {
        return kondition;
    }

    public void setKondition(int kondition) {
        this.kondition = kondition;
    }

    public int getmStaerke() {
        return mStaerke;
    }

    public void setmStaerke(int mStaerke) {
        this.mStaerke = mStaerke;
    }

    public int getmVerteidigung() {
        return mVerteidigung;
    }

    public void setmVerteidigung(int mVerteidigung) {
        this.mVerteidigung = mVerteidigung;
    }

    public int getHeilpunkte() {
        return heilpunkte;
    }

    public void setHeilpunkte(int heilpunkte) {
        this.heilpunkte = heilpunkte;
    }

    public int getSpezialpunkte() {
        return spezialpunkte;
    }

    public void setSpezialpunkte(int spezialpunkte) {
        this.spezialpunkte = spezialpunkte;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getGlueck() {
        return glueck;
    }

    public void setGlueck(int glueck) {
        this.glueck = glueck;
    }


}