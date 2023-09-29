package LinkedStack;

public class LinkedStackClass {
	
	LinkedListNode stackTop;

	public LinkedStackClass() {
		stackTop = null;
	}
	
	//Push element onto the top of the stack
	public void push(int num) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.info = num;
        newNode.link = stackTop;
        stackTop = newNode;
	}
	
	//Pop the element from the top of the stack
    public void pop() {
        if (stackTop == null) {
        	System.out.println("Stack is empty");
        }
        else {
	        int value = stackTop.info;
	        stackTop = stackTop.link;
        }
    }
    
    //Peek the top element of the stack
    public void peek() {
        if (stackTop == null) {
        	System.out.println("Stack is empty");
        }
        else {
	        int peekValue = stackTop.info;
	    	System.out.println("Top Value is: " + peekValue);
        }
    }
	
	//Print the values of the stack
	public void print() {
		LinkedListNode current = stackTop;
		System.out.println("\nLinkedStack Values:\n");
		while(current != null) {
			System.out.println("Value: " + current.info);
			current = current.link;
		}
	}
}

