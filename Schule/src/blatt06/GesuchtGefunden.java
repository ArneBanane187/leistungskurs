package blatt06;

public class GesuchtGefunden {

    public static void main(String[] args) {
        double[] arr = new double[] {3.45, 7, 14, -66, 5.4, 33.33, 99.1, 42.3, 3.14, -3.14, 13.56, 7.8031, -54.35, 6.120, 6.435, -2.30001, 0.00005, -65.78, -29.57, 92, -83, 3174.56, -1469.349, -5.086, 27.135, 348.5, 52.3568, -47.320051, 8372.579, -593.2, 0.25874, -7.1952, 3587.6, -201.3, -65.92, 12, 5, 13.7, -30, 16.5, 10071, 1700.34, -50.05, 81.3576, -42};

        //Aufgabe a)
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Das größte Element ist: " + max);

        //Aufgabe b)
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("Das kleinste Element ist: " + min);

        //Aufgabe c)
        double sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Die Summe aller Elemente ist: " + sum);

        //Aufgabe d)
        double mindiff = arr[0];
        for (int i = 0; i < arr.length; i++) {
            double diff = arr[i] - mindiff;
            if (diff > mindiff) {
                mindiff = diff;
            }
        }
        System.out.println("Die kleinste Paardifferenz ist: " + mindiff);


    }


}
