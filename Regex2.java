package Regex;
import java.util.*;
import java.util.regex.Pattern;
public class sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
         
        String input = sc.nextLine();

        String regex = "([a-zA-Z0-9._]+@[a-zA-Z]+\\.com)";

        if(Pattern.matches(regex, input)){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }

    }
}
