package Ds;

import java.util.PriorityQueue;

class patient implements Comparable<patient> {
    String name;
    int pri;   // lower number = higher priority

    patient(String name, int pri) {
        this.name = name;
        this.pri = pri;
    }


    public int compareTo(patient p) {
        return this.pri - p.pri;
    }
}

public class HospitalEmergencySystem {
    public static void main(String[] args) {

        PriorityQueue<patient> pq = new PriorityQueue<>();

        pq.add(new patient("Raghul ", 3));      
        pq.add(new patient("Paul Solomon", 2));     
        pq.add(new patient("Koshigan", 1));      
        pq.add(new patient("Jayaprem", 1));  
        pq.add(new patient("Bagavathi", 2));     
        pq.add(new patient("Priya", 3));      

        while (!pq.isEmpty()) {
            patient n = pq.poll();
            System.out.println(n.name + "  Priority: " + n.pri);
        }
    }
}