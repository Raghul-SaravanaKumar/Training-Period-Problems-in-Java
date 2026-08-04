import java.io.*;
public class checkzero2 {
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your mobile number: ");
        String s = br.readLine();

        int s1 = s.indexOf('0');
        if(s1 >= 1){
            System.out.println("The mobile number contains zero.");
        } else {
            System.out.println("The mobile number does not contain zero.");
        }
    }
}
