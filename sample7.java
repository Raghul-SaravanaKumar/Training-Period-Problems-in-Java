package legex;
import java.util.Scanner;
public class sample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string:");
        String input = sc.nextLine();

        String regex = "\\+\\d{1,3}[- ]\\d{10}.*";
        //"[+91]+ [0-9]{10}"
        boolean matches = input.matches(regex);
        if (matches) {
            System.out.println("The input string contains a valid phone number with Indian country code.");
        } else {
            System.out.println("The input string does not contain a valid phone number with Indian country code.");
        }
    }
}
 