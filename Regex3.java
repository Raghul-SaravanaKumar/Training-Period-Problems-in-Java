package Regex;
import java.util.*;
import java.util.regex.Pattern;

public class sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = sc.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&]).{8,}$";


        if(Pattern.matches(regex, input)){
            System.out.println("Strong Password");
        }

        else{
            System.out.println("Weak Password");
        }
    }
}





