package MultipleQueueProject;

public class MultipleQueueClass {
    public int queueFrontA;  // keeps track of the first element in the first queue
    public int queueRearA;   // keeps track of the last element in the first queue
    public int queueFrontB;  // keeps track of the first element in the second queue
    public int queueRearB;   // keeps track of the last element in the second queue
    public int maxQueueSize;  // specifies the maximum size of the queues 
    public int countA ;     // number of element in the first queues 
    public int countB ;    // number of element in the second queues
    public Integer[][] list; // two dimensional array list to store the elements of the queues

    // constructor to initialize the data members
    public MultipleQueueClass(int size) {
        maxQueueSize = size;
        countA = 0;
        countB = 0;
        queueFrontA = 0;
        queueRearA = -1;
        queueFrontB = 0;
        queueRearB = -1;
        list = new Integer[2][maxQueueSize];
    }

    // method to add an element to one of the two queues
    public void addQueue(Integer num) {
        // if both queues are empty, add the element to the first queue
        if (countA == 0 && countB == 0) {
            queueRearA++;
            list[0][queueRearA] = num;
            countA++;
            System.out.println("The Element named "+list[0][queueRearA]+" is queued in queueA system");
        } else if (countA > countB) { // if the first queue has more elements than the second queue, add the element to the second queue
            queueRearB++;
            list[1][queueRearB] = num;
            countB++;
            System.out.println("The Element named "+list[1][queueRearB]+" is queued in queueB system");
        } else if (countA < countB) { // if the second queue has more elements than the first queue, add the element to the first queue
            queueRearA++;
            list[0][queueRearA] = num;
            countA++;
            System.out.println("The Element named "+list[0][queueRearA]+" is queued in queueA system");
        } else { // if both queues have the same number of elements, add the element to the first queue
            queueRearA++;
            list[0][queueRearA] = num;
            countA++;
            System.out.println("The Element named "+list[0][queueRearA]+" is queued in queueA system");
        }
    }
    
    

    // method to delete an element from one of the two queues
    public Integer deleteQueue() {
        if (countA == 0 && countB == 0) { // if both queues are empty, return null
            return null;
        }
        else if (countA > countB || (countA == countB && queueFrontA <= queueRearB)) { // if the first queue has more elements than the second queue or if both queues have the same number of elements and the first queue's front element is before the second queue's rear element, remove the element from the first queue
            Integer removedElement = list[0][queueFrontA];
            queueFrontA++;
            countA--;
            System.out.println("\n"+ removedElement+" has withdrawn from the queueA");

            return removedElement;
        } else { // if the second queue has more elements than the first queue or if both queues have the same number of elements and the first queue's front element is after the second queue's rear element, remove the element from the second queue
            Integer removedElement = list[1][queueFrontB];
            queueFrontB++;
            countB--;
            System.out.println("\n"+ removedElement+" has withdrawn from the queueB");
            return removedElement;
        }
    }
    public void print() {
        System.out.println("\nThe front of the queue A is :" + list[0][queueFrontA]);
        System.out.println("The back of the queue A is :" + list[0][queueRearA]);
        System.out.println("The number of elements in the queue A is :" + countA);

        System.out.println("\nThe front of the queue B is :" + list[1][queueFrontB]);
        System.out.println("The back of the queue B is :" + list[1][queueRearB]);
        System.out.println("The number of elements in the queue B is :" + countB);
    }
}
