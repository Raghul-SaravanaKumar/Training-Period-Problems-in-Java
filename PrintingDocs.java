import java.util.*;
import java.util.Queue;
public class PrintingDocs {
    public static void main(String[] args) {
        Queue <String> printer = new LinkedList<>();
        printer.add("Doc1.pdf");
        printer.add("Result.ocr");
        printer.add("Marks.ods");
        while(!printer.isEmpty()){
            System.out.println("Printing " + printer.poll());
        }
    }
}
