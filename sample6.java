package legex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("Enter the input string:");
    String input = sc.nextLine().toLowerCase();
    //METHOD 1
    String regex = "\\D";
    
    String result = input.replaceAll(regex, "");
    System.out.println("The digits present in the given input string are: " + result);
    //METHOD 2
    Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        System.out.print("Digits in the given string are: ");

        while (matcher.find()) {
            System.out.print(matcher.group());
        }
}
}