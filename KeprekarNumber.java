import java.util.Scanner;

public class KeprekarNumber {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = sc.nextInt();

   long square = (long) num * num;
   String strSq = String.valueOf(square);

    int leng = strSq.length();

    String Leftpart = strSq.substring(0, leng / 2);     
    String Rightpart = strSq.substring(leng / 2);    

   int leftnum = (Leftpart.isEmpty()) ? 0 : Integer.parseInt(Leftpart);
   int rightnum = Integer.parseInt(Rightpart);

  if ((leftnum + rightnum) == num) {
        System.out.println(num + " is a Kaprekar number");
  }
  else 
  {
        System.out.println(num + " is not a Kaprekar number");
    }

	}

}
