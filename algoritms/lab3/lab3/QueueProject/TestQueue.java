package Queue;

public class TestQueue {
    public static void main(String[] args) {
        QueueClass myQueue = new QueueClass(10);
        myQueue.enqueue(6);
        myQueue.print();

        myQueue.enqueue(12);
        myQueue.print();

        myQueue.enqueue(18);
        myQueue.print();

        myQueue.dequeue();
        myQueue.print();

        myQueue.enqueue(24);
        myQueue.print();

        myQueue.enqueue(30);
        myQueue.print();

        myQueue.enqueue(36);
        myQueue.print();

        myQueue.dequeue();
        myQueue.print();

        myQueue.enqueue(42);
        myQueue.print();
    }
}