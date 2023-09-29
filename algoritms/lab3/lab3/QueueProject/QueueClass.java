package Queue;


public class QueueClass {
    private int queueFront;
    private int queueRear;
    private int maxQueueSize;
    private int count;
    private Integer[] list;

    public QueueClass(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        this.queueFront = 0;
        this.queueRear = maxQueueSize - 1;
        this.count = 0;
        this.list = new Integer[maxQueueSize];
    }

    public void enqueue(Integer num) {
        queueRear = (queueRear + 1) % maxQueueSize;
        list[queueRear] = num;
        count++;
    }

    public Integer dequeue() {
        Integer removedElement = list[queueFront];
        list[queueFront] = null;
        queueFront = (queueFront + 1) % maxQueueSize;
        count--;
        return removedElement;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maxQueueSize;
    }

    public void print() {
        System.out.println("The number of elements in the queue is: " + count);
        System.out.println("The index of the queue front is: " + queueFront + ", The queue front value is " + list[queueFront]);
        System.out.println("The index of the queue rear is: " + queueRear + ", The queue rear value is " + list[queueRear]);
    }
}
