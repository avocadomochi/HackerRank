import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i = 0; i < a.length(); i++) {
            if (b.isEmpty() && i != a.length()) return false;
            b = b.replaceFirst(String.valueOf(a.charAt(i)), "");
        }
        return b.isEmpty();
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
