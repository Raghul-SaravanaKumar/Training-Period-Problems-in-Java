package Ds;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeStack {
    public static void main(String[] args) {
        Stack <Character> stack= new Stack<>();
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        System.out.println("Reversed String: " + reverse.toUpperCase());

        if (input.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
