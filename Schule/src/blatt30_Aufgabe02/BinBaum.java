package blatt30_Aufgabe02;

public class BinBaum  {

    private Node root;


    public BinBaum() {
        root = null;

    }
    public BinBaum(Node root) {
        this.root = root;
    }


    public Node search(int wert) {
        Node current = root;
        while (current != null) {
            if (current.getWert() == wert) {
                return current;
            }
            if (current.getWert() > wert) {
                current = current.getLeft();

            } else {
                current = current.getRight();
            }
        }
        return null;
    }

    public void add(int wert) {

        Node newNode = new Node(root.getWert());

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        while (current != null) {
            if (current.getWert() == wert) {
                return;
            }
            if (current.getWert() > wert) {

                if(current.getLeft() == null) {
                    current.setLeft(newNode);
                    return;
                }
                current = current.getLeft();

            }  else {
                if(current.getRight() == null) {
                    current.setRight(newNode);
                    return;
                }
                current = current.getRight();
            }
        }
    }

}
