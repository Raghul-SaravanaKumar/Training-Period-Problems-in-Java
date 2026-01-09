import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n>=10){
           int sum = 0;
            
            while(n>0){
                sum = sum + (n%10);
                n = n/10;
            }
            n = sum;
        }
        System.out.println(n);
        sc.close();
    }
}
