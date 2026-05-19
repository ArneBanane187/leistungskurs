package blatt29;

public abstract class Wesen {

    private int staerke;
    private int kondition;
    private int mVerteidigung;
    private int hp;
    private int maxHp;
    private int level;
    private int xp;
    private int geschwindigkeit;
    private int glueck;

    public Wesen(int staerke, int kondition, int mVerteidigung, int hp, int maxHp, int level, int xp, int geschwindigkeit, int glueck) {
        this.staerke = 5;
        this.kondition = 5;
        this.mVerteidigung = 5;
        this.hp = this.maxHp;
        this.maxHp = 100;
        this.level = 1;
        this.xp = 0;
        this.geschwindigkeit = 5;
        this.glueck = 5;
    }


}