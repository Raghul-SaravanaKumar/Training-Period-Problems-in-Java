import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while (true) {

            int n = sc.nextInt();

            if (n < 0)
                break;

            max = Math.max(max, n);
        }

        System.out.println(max);
    }
}
