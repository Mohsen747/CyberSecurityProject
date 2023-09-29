package LinkedStack;

public class LinkedListClass {
	
	
	private LinkedListNode first;
	
	private LinkedListNode last;
	
	//Concrete methods
	public LinkedListClass() 
	{
		first = null;
		last = null;
	}
	
	//add element to  the end  of  the list
	public void add(int num) 
	{
		
		
		LinkedListNode newNode = new LinkedListNode();
		newNode.info = num;
		newNode.link = null;
		
		if(first == null)
		{
			first = newNode;
			last = first;
		}
		else
		{
			last.link = newNode;
			last = newNode; 
		}

		
	}

	public void print()
	{
		LinkedListNode  current  = first;
 		while( current !=  null)
		{
			System.out.println("Value : " + current.info);
			
			current  = current.link;
			
		}
	}

}
