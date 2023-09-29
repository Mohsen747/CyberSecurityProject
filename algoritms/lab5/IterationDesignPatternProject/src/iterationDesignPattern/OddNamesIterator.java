package iterationDesignPattern;

public class OddNamesIterator extends NameIterator{
	
	public boolean hasNext() 
	{
		if (index < names.length)
			return true;
		return false;
		
	}
	public Object next()
	{
		if (this.hasNext() && index%2==1)
			return names[index++];
		else
			index++;
		
		return null;
	}
	

}
