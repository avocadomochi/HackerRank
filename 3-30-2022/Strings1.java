import java.io.*;
import java.util.*;

public class Strings1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int x = A.length() + B.length();
        String y = A.compareTo(B) > 0 ? "Yes" : "No";
        String aCap = String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1);
        String bCap = String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(aCap + " " + bCap);
    }
}
