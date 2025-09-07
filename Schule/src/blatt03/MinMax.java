package blatt03;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte geben Sie drei Zahlen ein: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a < b && a < c){
            System.out.println("a ist die kleinste Zahl");
        if(b < c && b < a){
            System.out.println("b ist die kleinste Zahl");}
        if(c < a && c < b){
            System.out.println("c ist die kleinste Zahl");}


        }


        }







    }
}
