package blatt13;

public class Umgebung {

    public static int findeExponent (double b, double e){
        if(0 < b && b < 1){
            int exonent = 1;
            double p = b;
            while(p > e){
                exonent++;
                p = Math.pow(p ,exonent);
            }
            return exonent;
        }
        return -1;
    }
    public static void main(String[]arcs){
        System.out.println(findeExponent(0.5,0.001));
    }

}
