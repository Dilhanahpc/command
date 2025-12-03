import ds.Queue;

public class Queuetest {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.peek();
        queue.print();
        queue.clear();
        queue.size();


    }
}
