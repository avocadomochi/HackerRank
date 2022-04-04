import java.util.Scanner;
import java.util.regex.*;

public class Regex1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine());
        while(x > 0){
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            x--;
        }
    }
}
