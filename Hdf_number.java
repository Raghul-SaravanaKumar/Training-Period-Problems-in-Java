import java.util.Scanner;

public class Hdf_number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = sc.nextInt();
    System.out.print("Enter second number: ");
    int b = sc.nextInt();
    sc.close();

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
/*
    System.out.println(" HCF is : " + a);
    int y = 20;
	
    if(b==true) {
  	  System.out.println("hi");
    }
    else if(!b) {
  	  System.out.println("hello");
    }
    */
}
}
