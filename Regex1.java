package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class sample {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digit: ");
    String input = sc.nextLine();

    boolean result = Pattern.matches("\\d+", imput);

    if(result){
        System.out.println("Contains only the digit");
    }
    else
        System.out.println("Contains other charaters too");
   } 
}
