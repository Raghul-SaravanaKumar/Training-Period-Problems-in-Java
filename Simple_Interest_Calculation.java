import java.util.Scanner;

public class Simple_Interest_Calculation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Finding the Simple Interest ");
	System.out.print("Enter the Profit P : ");
	int P = sc.nextInt();
	System.out.print("Enter the Rate R : ");
	int R = sc.nextInt();
	System.out.print("Enter the Time T : ");
	int T = sc.nextInt();
	System.out.println("The Entered inputs are :");
	System.out.println("P - "+P);
	System.out.println("R - "+R);
	System.out.println("T - "+T);
	float SI = (P*R*T)/100f	;
	System.out.println("The Simple Interest (SI) of the Given Values is "+SI);
	sc.close();
}
}
