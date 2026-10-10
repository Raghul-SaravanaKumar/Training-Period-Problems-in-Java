import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int sum = 0;
        int product = 1;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        if (sum == product) {
            System.out.println(num + " is a Spy number.");
        } else {
            System.out.println(num + " is not a Spy number.");
        }
        sc.close();
    }
}
