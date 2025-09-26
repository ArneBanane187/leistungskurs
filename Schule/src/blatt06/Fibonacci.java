package blatt06;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Aufgabe a)
        System.out.println("Bitte legen Sie eine Länge an.");
        int n = sc.nextInt();

        int [] fibo = new int [n];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];

        }
        System.out.println("Fibonacci-Folge: ");
        for (int i = 0; i < n; i++) {
            System.out.println(fibo[i] + " ");
        }

        //Aufgabe b)
        int vorletzteZahl = fibo[fibo.length - 2];
        int letzteZahl = fibo[fibo.length - 1];
        double q = letzteZahl / (double) vorletzteZahl;

        System.out.println("Der Quotient der letzten beiden Zahlen ist: " + q);

    }
}

//Aufgabe c)
//Der Quotient der letzten beiden Fibonacci Zahlen nähert sich dem Golden Schnit.(Habe dafür Simpliclub Goldener Schnitt und ChatGPT gefragt)