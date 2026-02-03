import java.util.PriorityQueue;


public class MinPriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(55);
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+ " ");
        }

    }
}
