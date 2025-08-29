package blatt01;

public class Zinssatz {
    public static void main(String[] args) {

        double kapital_alt = 1220.0; //€
        double zinssatz = 2.25; //%

        double zinsen = (kapital_alt * zinssatz) / 100;
        double kapital = kapital_alt * zinssatz;

        System.out.println("Kapital: " + kapital);
        System.out.println("Zinsen" + zinsen);








    }
}
