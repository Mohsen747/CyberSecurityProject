package iterationDesignPattern;

public class NameIterator implements Iterator{
	
	public String names[] = {"Robert","Khan","Lee","Jessica"};
	int index; 
	
	
	public boolean hasNext() 
	{
		if (index < names.length)
			return true;
		return false;
		
	}
	
	public Object next()
	{
		if (this.hasNext())
		return names[index++];
		
		return null;
	}

}
