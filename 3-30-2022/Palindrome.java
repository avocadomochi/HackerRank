import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = "";
        
        for (int i = 0; i < A.length(); i++) {
            B += String.valueOf(A.charAt(A.length() - 1 - i));
        }
        
        String x = A.equals(B) ? "Yes" : "No" ;
        System.out.println(x);
    
    }
}



