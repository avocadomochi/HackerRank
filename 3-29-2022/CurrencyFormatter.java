import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usForm = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat chinaForm = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceForm = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = usForm.format(payment);
        String india = us.replace("$", "Rs.");
        String china = chinaForm.format(payment);
        String france = franceForm.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}          
