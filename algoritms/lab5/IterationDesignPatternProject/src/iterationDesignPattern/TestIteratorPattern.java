package iterationDesignPattern;

public class TestIteratorPattern {

	public static void main(String[] args) {
		
		System.out.println("Traversal of Collection WITHOUT using Iterator pattern  ");
		NameIterator myNameIterator = new NameIterator();
		//myNameIterator.names = new String [] {"a","b"}
		for (int index=0; index < myNameIterator.names.length;index++)
		{
			System.out.println("Name: "+ myNameIterator.names[index]);
		}
		
		
		
		
		//It will work for ever collection
		NameRepository myNameRepository = new NameRepository();
		System.out.println("Traversal of Collection");
		
		for(Iterator iter = myNameRepository.getIterator(); iter.hasNext();)
		{
			System.out.println("Name: "+ (String) iter.next());
		}
		
		
		System.out.println(" Odd Traversal of Collection Using Iterator");
		
		for(Iterator iter = myNameRepository.getOddIterator(); iter.hasNext();)
		{
			System.out.println("Name: "+ (String) iter.next());
		}
	}
}
