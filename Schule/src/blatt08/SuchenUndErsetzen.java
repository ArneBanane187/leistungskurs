package blatt08;

public class SuchenUndErsetzen {

    public static String ersetzen (String str) {
        str = str.toLowerCase();
        char[] charr = str.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] == 'a')
                charr[i] = 'b';
        }
        String s = new String(charr);
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Jedes a ");
    }
}
