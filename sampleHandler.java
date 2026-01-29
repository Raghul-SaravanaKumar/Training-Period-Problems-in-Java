package legex;
import java.io.*;

class sampleHandler {

    public static void main(String[] args) throws Exception {

        File f = new File("data.txt");
        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());

        FileWriter fw = new FileWriter("data.txt");
        fw.write("Welcome to the data.txt file and i have created a file");
        fw.close();
        System.out.println("Data Stored Successfully");

        FileReader fr = new FileReader("data.txt");
        int ch;

        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
