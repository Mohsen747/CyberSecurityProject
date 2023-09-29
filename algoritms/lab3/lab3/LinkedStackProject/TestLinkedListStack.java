package LinkedStack;

public class TestLinkedListStack {
	
	public static void main(String[] args) {
		LinkedListClass myList = new LinkedListClass();
		LinkedStackClass myStack = new LinkedStackClass();
		
		myList.add(10);
		myList.add(15);
		myList.add(20);
		myList.add(25);
		
		myList.print();
		
		myStack.push(70);
		myStack.push(60);
		myStack.push(50);
		myStack.push(40);
		
		myStack.print();

		myStack.pop();

		myStack.print();
		myStack.print();

		myStack.peek();
		myStack.print();
	}
}
