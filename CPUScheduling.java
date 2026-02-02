package Ds;

public class CPUScheduling {
   public static void main(String[] args) {
     int [] process = {1,2,3,4};
    int front = 0;

    System.out.println("CPU Scheduling Simulation Started");    
    for(int i=0; i<7; i++){
        System.out.println("Executing Process: " + process[front]);
        front = (front + 1) % process.length;
    }
    System.out.println("CPU Scheduling Simulation Ended");
   }
}
