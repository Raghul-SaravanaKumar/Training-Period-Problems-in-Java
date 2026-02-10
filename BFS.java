import java.util.*;
public class BFS{
    static void bfs(int start,ArrayList<ArrayList<Integer>>graph,int v){
        boolean[] visited=new boolean[v];
        Queue<Integer>q=new LinkedList<>();
         visited[start]=true;
        q.add(start);
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int neighbor:graph.get(node)){
                if(!visited[neighbor]){
                    q.add(neighbor);
                    visited[neighbor]=true;
                }
            }
        }
    }
public static void main(String[]args){
    int v=5;
    ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
    
    for(int i=0;i<v;i++)
        graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(0).add(3);
        graph.get(0).add(4);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);

        bfs(0,graph,v);
}
}
