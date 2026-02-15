import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 
         System.out.print("Enter the value of a : ");
         int a = sc.nextInt(); 

       if(isPrime(a)) {
    	   System.out.println(a + " is a Prime number");
       }
       else
       {
    	   System.out.println(a + " is Not a Prime number");
       }
        
	}
	public static boolean isPrime(int n) {
		if(n<2) {
		return false;
		}
for(int i = 2;i<=Math.sqrt(n);i++) {

	if(n % i==0) {
		
return false;

}
	}
return true;
	
}
}
