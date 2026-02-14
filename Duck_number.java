import java.util.Scanner;

public class Duck_number {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the value of a :");
         int a = sc.nextInt();
         String num = Integer.toString(a);
		if (num.contains("0") && num.charAt(0) != '0') {
             System.out.println(num + " is a Duck Number.");	
         } 
		else {
             System.out.println(num + " is not a Duck Number.");
         }

         
     }
    }
