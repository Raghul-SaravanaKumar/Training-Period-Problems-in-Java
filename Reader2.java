package regex;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("data1.txt"));

        String line1;
        String line2;

        while ((line1 = br.readLine()) != null && (line2 = br1.readLine()) != null) {
            System.out.println(line1);
            System.out.println(line2);
        }
        br.close();
        br1.close();
    }
}
