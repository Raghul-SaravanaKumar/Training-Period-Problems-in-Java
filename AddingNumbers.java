import java.util.Scanner;

public class AddingNumbers {
public static void main(String[] args) {
	int a = 5;
	int b = 10;
	System.out.println(a+b);
	//or
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number c : ");
	int c = sc.nextInt();
	System.out.print("Enter the Number d : ");
	int d = sc.nextInt();
	int e = c+d;
	System.out.println("Sum : " + e);
	
	
}
}
