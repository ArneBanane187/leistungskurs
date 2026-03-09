package blatt19;

public class ggT {
    public static int ggt(int m, int n){
        if(m == n ){
            return m;
        } if (m > n){
            return ggt(m - n,n);
        } else {
            return ggt(m, n - m);
        }
    }

    public static void main(String[] args) {
        System.out.println(ggt(4,5));
    }
}
