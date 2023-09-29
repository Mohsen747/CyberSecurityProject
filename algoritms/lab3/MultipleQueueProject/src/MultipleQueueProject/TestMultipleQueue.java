package MultipleQueueProject;

public class TestMultipleQueue {
    public static void main(String[] args) {
        MultipleQueueClass queue = new MultipleQueueClass(5);

        queue.addQueue(6);  // should be added to queue A
        

        queue.addQueue(17); // should be added to queue B
        

        queue.addQueue(5);  // should be added to queue A
        

        queue.addQueue(20); // should be added to queue B
        

        queue.addQueue(15); // should be added to queue A
        

        queue.print();

        queue.deleteQueue(); // should remove 6 from queue A
        
       
        queue.print();
       
        queue.addQueue(30); // should be added to queue A
        queue.print();
        queue.deleteQueue(); // should remove 5 from queue A
       
        queue.print();
    }
}
