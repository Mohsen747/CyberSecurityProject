package ProjectThreeLinkedList;

import java.util.Scanner;

public class TestThreeLinkedList {
    
    public static Scanner console = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        int num = 0;
        
        // Forward manner
        LinkedListNode headNode1 = null, newNode, currentNode1 = null;
        
        System.out.println("Please enter values until -999");
        
        while (num != -999) {
            System.out.print("Number: ");
            num = console.nextInt();
            if (num != -999) {
                newNode = new LinkedListNode();
                newNode.info = num;
                newNode.link = null;
                
                if (headNode1 == null) {
                    headNode1 = newNode;
                    currentNode1 = headNode1;
                } else {
                    currentNode1.link = newNode;
                    currentNode1 = newNode;
                }
            }
        }
        
        // Backward manner
        LinkedListNode headNode2 = null, newNode2, currentNode2;
        
        // Traverse the first list to create the second list in backward manner
        currentNode1 = headNode1;
        while (currentNode1 != null) {
            newNode2 = new LinkedListNode();
            newNode2.info = currentNode1.info * 2;
            newNode2.link = headNode2;
            headNode2 = newNode2;
            currentNode1 = currentNode1.link;
        }
        
        System.out.println("\nDisplaying the components of the First and Second linked list stored from user input in FORWARD and BACKWARD manner:\n"); // Traversing the LinkedList
        
        currentNode1 = headNode1;
        currentNode2 = headNode2;
        
        while (currentNode1 != null && currentNode2 != null) {
            System.out.println("Value in the first linked list: " + currentNode1.info + ", " + "Value in the second linked list: " + currentNode2.info);
            currentNode1 = currentNode1.link;
            currentNode2 = currentNode2.link;
        }
        
        System.out.println("\nDisplaying the components of the linked list stored from user input in FORWARD MANNER:\n"); // Traversing the LinkedList
        
        currentNode1 = headNode1;
        while (currentNode1 != null) {
            System.out.println("Value in the first linked list: " + currentNode1.info);
            currentNode1 = currentNode1.link;
        }
        
        System.out.println("\nDisplaying the components of the linked list stored from user input in BACKWARD MANNER:\n");
        
        // Traversing the second LinkedList
        currentNode2 = headNode2;
        while (currentNode2 != null) {
            System.out.println("Value: " + currentNode2.info);
            currentNode2 = currentNode2.link;
        }
        
        // Forward manner with difference between values in the first and second linked list
        LinkedListNode headNode3 = null, newNode3, currentNode3 = null;
        
        currentNode1 = headNode1;
        currentNode2 = headNode2;
        
        while (currentNode1 != null && currentNode2 != null) {
            newNode3 = new LinkedListNode();
            newNode3.info = currentNode1.info - currentNode2.info;
            newNode3.link = null;
            
            if (headNode3 == null) {
                headNode3 = newNode3;
                currentNode3 = headNode3;
            } else {
                currentNode3.link = newNode3;
                currentNode3 = newNode3;
            }
            currentNode1 = currentNode1.link;
            currentNode2 = currentNode2.link;
        }
        
     // Traversing the third linked list in forward manner
        System.out.println("\nDisplaying the components of the Third linked list built in FORWARD manner with values equal to the difference between values in the first and second linked list:\n");
        
        currentNode3 = headNode3;

        while (currentNode3 != null) {
            System.out.println("Value in the third linked list: " + currentNode3.info);
            currentNode3 = currentNode3.link;
        }

        // Traversing the third linked list in backward manner
        System.out.println("\nDisplaying the components of the Third linked list built in BACKWARD manner with values equal to the difference between values in the first and second linked list:\n");

        currentNode3 = headNode3;
        LinkedListNode prevNode3 = null;
        while (currentNode3 != null) {
            LinkedListNode nextNode = currentNode3.link;
            currentNode3.link = prevNode3;
            prevNode3 = currentNode3;
            currentNode3 = nextNode;
        }
        headNode3 = prevNode3;

        currentNode3 = headNode3;
        while (currentNode3 != null) {
            System.out.println("Value in the third linked list: " + currentNode3.info);
            currentNode3 = currentNode3.link;
        }
    }
}
