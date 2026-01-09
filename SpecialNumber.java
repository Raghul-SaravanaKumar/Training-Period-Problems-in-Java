import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int last = 0;
        int first = 0;
        for(int i = m ; i<=n;i++){
             last = i%10;
             first = i/10;
            
            int sum = last + first;
            int product = last * first;
            
            if(sum + product == i){
                System.out.println(i);
            }
            // m++;
            last = 0;
            first = 0;
        }
    }
}
