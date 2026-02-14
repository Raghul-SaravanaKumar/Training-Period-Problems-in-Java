import java.util.Scanner;

public class Largest_of_three_numbers {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of a : ");
       int a = sc.nextInt();
       System.out.print("Enter the value of b : ");
       int b = sc.nextInt();
       System.out.print("Enter the value of c : ");
       int c = sc.nextInt();
       sc.close();
       
       if(a>b && a>c) {
    	   System.out.println(a + " is a Largest number");
       }
       else if(b>a && b>c) {
    	   System.out.println(b + " is a Largest number");
       }
       else {
    	   System.out.println(c + " is a Largest number");
       }
       
	}

}
