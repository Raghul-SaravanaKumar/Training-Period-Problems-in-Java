import java.util.*;
public class Graph2 {
    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
       
        for(int i=0;i<v;i++)
            graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(0).add(2);
            graph.get(0).add(3);
            graph.get(1).add(3);
            graph.get(2).add(3);

            for(int i=0;i<v;i++){
                System.out.println(i + " -> "+graph.get(i));
        }
    }
}
