package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class sample9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = sc.nextLine();
        String Regex = "\\s{2,}";
        Pattern pattern = Pattern.compile(Regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            String result = input.replaceAll(Regex, " ");
            System.out.println("Modified string: " + result);
        } else {
            System.out.println("The string does not contain two or more consecutive whitespace characters.");
        }

    }
}
