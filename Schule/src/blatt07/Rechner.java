package blatt07;

public class Rechner {

    public static void operation (int a, int b){
        System.out.println("Summe " + a + " + " + b + " = " + (a + b));
        System.out.println("Summe " + a + " - " + b + " = " + (a - b));
        System.out.println("Summe " + a + " * " + b + " = " + (a * b));
        System.out.println("Summe " + a + " / " + b + " = " + (a / b));




    }

    /**
     * Diese Methode addiert zwei Zahlen
      * @param a erste Zahl
     * @param b zweite Zahl
     */
    public static in add (int a, int b) {
        System.out.println(a + b);
    }

    /**
     * Diese Methode subtrahiert zwei Zahlen
     * @param a erste Zahl
     * @param b zweite Zahl
     * @return Ergbnis
     */
    public static int sub (int a, int b) {
        int differenz = a - b;
        return differenz;

    }

    /**
     * Diese Methode ultipliziert zwei Zahlen
     * @param a erste zahl
     * @param b zweite zahl
     */
    public static int mult (int a, int b) {
        int produkt = a * b;
        return produkt;
    }

    /**
     * Diese Methode dividiert zwei Zahlen
     * @param a erste Zahl
     * @param b zweite Zahle
     */
    public static int div (int a, int b) {
        int quotient = a * b;
        return quotient;
    }





    public static void main(String[] args) {
        operation(1, 2);
        add(1,2);
        sub(1,2);
        mult(1,2);
        div(1,2);
    }
}
