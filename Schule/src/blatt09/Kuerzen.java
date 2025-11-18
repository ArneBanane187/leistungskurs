package blatt09;

public class Kuerzen {

    public static int istKuerzbar (int a, int b) {
       if (a % b == 0) {
           return a;
       } else {
           return b;
       }

    }

    public static void main(String[] args) {
        System.out.println(istKuerzbar(12,18));
        int c = istKuerzbar(12,18);
        System.out.println(c);


     
    }


}
