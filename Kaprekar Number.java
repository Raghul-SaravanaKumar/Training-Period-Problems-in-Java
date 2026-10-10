import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int square = num * num;
        String sqStr = String.valueOf(square);
        int len = sqStr.length();
        
        // Split the square into two halves
        int mid = len / 2;
        String leftStr = sqStr.substring(0, mid);
        String rightStr = sqStr.substring(mid);
        
        // Convert parts back to integers (handle empty left string for single digit squares)
        int left = leftStr.isEmpty() ? 0 : Integer.parseInt(leftStr);
        int right = Integer.parseInt(rightStr);
        
        if (left + right == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
        sc.close();
    }
}
