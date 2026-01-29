package legex;
import java.util.*;
import java.util.regex.*;
public class sample8{
    public static boolean matches(String input, String regex) {
        return Pattern.matches(regex, input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the input: ");
        String input = sc.nextLine();

        String regex = "[A-Z]{5}\\d{4}[A-Z]{1}";
        // OR "[A-Z]{5}[0-9]{4}[A-Z]{1}";

        
        if(matches(input,regex)){
            System.out.println("The input string is a correct format of PAN card");
        }
        else{
            System.out.println("The input string is not a correct format of PAN card");
         
        }
    }
}