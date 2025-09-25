package blatt06;

import java.util.Scanner;

public class Wertetabelle {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie Ihren Grad ein: ");
        int grad = input.nextInt();

        System.out.println("Geben Sie Ihre Koeffizienten ein: ");
        double[] coeff = new double[grad+1];

        for (int i = 0; i < coeff.length; i++) {
            System.out.println("Koeffizient " + i);
            coeff[i] =  input.nextDouble();
        }




        //Beispiel x = 1

        int x = 1;
        double y = 0;
        for (int i = 0; i < coeff.length; i++) {
            y = y + (coeff[i] * Math.pow(x,i));
        }
        System.out.println("Für x = " + x + " ist y = " + y);






    }
}
