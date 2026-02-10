import java.util.*;
public class DFS {
        static void dfs(int start,ArrayList<ArrayList<Integer>>graph,int v,boolean[] visited){
            System.out.print(start+" ");
            visited[start]=true;
            for(int i:graph.get(start)){
                if(!visited[i]){
                    dfs(i,graph,v,visited);
                }
            }
        }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
       
        for(int i=0;i<v;i++)
            graph.add(new ArrayList<>());

            graph.get(0).add(1);
            graph.get(0).add(2);
            graph.get(0).add(3);
            graph.get(1).add(3);
            graph.get(2).add(3);

            boolean[] visited=new boolean[v];
            dfs(0,graph,v,visited);
    }
}
