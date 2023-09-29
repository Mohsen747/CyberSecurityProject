package LinkedList1;

public class TestLinkedList1 {
    public static void main(String[] args) {
        // Construct the linked list
        LinkedListNode headNode, newNode, tempNode;
        headNode = new LinkedListNode();
        headNode.info = 24;
        headNode.link = null;

        newNode = new LinkedListNode();
        newNode.info = 56;
        newNode.link = null;
        headNode.link = newNode;

        newNode = new LinkedListNode();
        newNode.info = 285;
        newNode.link = null;
        headNode.link.link = newNode;

        newNode = new LinkedListNode();
        newNode.info = 3;
        newNode.link = null;
        headNode.link.link.link = newNode;

        newNode = new LinkedListNode();
        newNode.info = 9;
        newNode.link = null;
        headNode.link.link.link.link = newNode;

        newNode = new LinkedListNode();
        newNode.info = 77;
        newNode.link = null;
        headNode.link.link.link.link.link = newNode;

        // Display the components of the linked list
        System.out.println("Displaying the components of the linked list:");
        System.out.println("Value 1 : " + headNode.info); //Print info of  the first node
		System.out.println("Value 2 : " + headNode.link.info); //Print info of  the Second node
		System.out.println("Value 3 : " + headNode.link.link.info);//Print info of  the third node
		System.out.println("Value 4 : " + headNode.link.link.link.info);//Print info of  the forth node
		System.out.println("Value 5 : " + headNode.link.link.link.link.info);//Print info of  the fifth node
        }
    
}

