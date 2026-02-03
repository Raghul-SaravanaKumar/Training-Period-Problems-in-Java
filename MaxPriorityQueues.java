package Ds;

import java.util.*;
import java.util.PriorityQueue;
import java.util.Collections;

public class MaxPriorityQueues {
    public static void main(String[] args) {
        // Correct way to initialize a max priority queue:
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Queue: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }
        
        // pq.add(40);
        // pq.add(10);
        // pq.add(20);
        // pq.add(30);
        // pq.add(55);

        System.out.println("Elements dequeued in descending order (max to min):");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        
        sc.close();
    }
}
