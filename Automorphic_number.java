import java.util.Scanner;

public class Automorphic_number {
	
  public static void main(String[] args) {
	  
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :  ");
	int num = sc.nextInt();
	
	int square = num * num;
	int digits = String.valueOf(num).length();
	int value = square % (int) Math.pow(10, digits);
	
	if (num == value) {
		System.out.println(num + " is a Automorphic number");
	}
	else {
		System.err.println(num + " is a not a Automorphic number");
	}
	sc.close();
}
}
