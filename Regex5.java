  package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class sample5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the input string:");
    String input = sc.nextLine().toLowerCase();

    String regex1 = ".*[aeiou].*";
    boolean matches = input.matches(regex1);

    if (matches) {
        System.out.println("The input string contains a vowel.");
    } else {
        System.out.println("The input string does not contains a vowel.");
    }
    String regex2 = "[aeiou]";
    Pattern pattern = Pattern.compile(regex2);
    Matcher matcher = pattern.matcher(input);

    int count = 0;
    while (matcher.find()) {
        count++;
    }
    System.out.println("Number of vowels contain in the given input String: " + count);
}
}
