public class Graph {
    public static void main(String[] args) {
        int v = 4;
        int [][] graph = {
            {0,1,1,0},
            {1,0,0,1},
            {1,0,0,1},
            {0,1,1,0}
        };
        for(int i = 0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
