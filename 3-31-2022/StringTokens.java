import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        String x = s.replaceAll("[^A-Za-z0-9]", " ");
        
        while(x.contains("  ")) {
            x = x.replaceAll("  ", " ");
        }
        while (x.startsWith(" ")) {
            x = x.substring(1);
        }
        while (x.endsWith(" ")) {
            x = x.substring(0, x.length() - 1);
        }
        
        if(x.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        String[] y = x.split(" ");
        System.out.println(y.length);
        
        for(int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}

