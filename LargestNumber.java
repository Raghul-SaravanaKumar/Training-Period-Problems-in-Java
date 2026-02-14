import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
System.out.print("Enter the Number a : ");
int a = sc.nextInt();
System.out.print("Enter the Number b : ");
int b = sc.nextInt();
if(a<b) {
	System.out.println("Largest Number : "+a);
}
else {
	System.out.println("Largest Number : "+b);
}	
	}

}
