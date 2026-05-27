package blatt30_Aufgabe02;

public abstract class Node {

    private int wert;
    private Node left;
    private Node right;

    public Node(int wert) {
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node[] FindInOrderNeighbour(){

        Node[] vorgaenger = null;
        Node[] nachfolger = null;


    }
}
