import java.io.*;
import java.util.*;

public class Solution {
        static int fab(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return fab(n-1) + fab(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println(fab(month-1));

    }
}
