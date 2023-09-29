package LinkedList1;

import java.util.Scanner;

public class TestLinkedList2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			LinkedListNode headNode = null, currentNode = null;

			// Read input integers from the console until the user enters -999
			System.out.println("Enter the data for processing ending with -999");
			int value = input.nextInt();
			while (value != -999) {
			    // Create a new node and set its value
			    LinkedListNode newNode = new LinkedListNode();
			    newNode.info = value;
			    newNode.link = null;

			    // Add the new node to the end of the linked list
			    if (headNode == null) {
			        headNode = newNode;
			        currentNode = newNode;
			    } else {
			        currentNode.link = newNode;
			        currentNode = newNode;
			    }

			    System.out.println("Number: " + value);
			    value = input.nextInt();
			}

			// Display the components of the linked list
			System.out.println("Displaying the components of the linked list stored from user input:");
			LinkedListNode tempNode = headNode;
			while (tempNode != null) {
			    System.out.println("Value: " + tempNode.info);
			    tempNode = tempNode.link;
			}
		}
    }
}
