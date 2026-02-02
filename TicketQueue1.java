package ds;
public class TicketQueue1{
    int [] queue=new int[5];
    int front =0 ,rear=-1;


    void enqueue(int person){
        if(rear==queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        queue[++rear]=person;
        System.err.println(""+person+"joined  the queue");
    }
    void dequeue(){
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(""+queue[front++]+"bought the tickets");
    }
    public static void main(String[] args) {
        TicketQueue q=new TicketQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}