package iterationDesignPattern;

public class NameRepository {
	
	
	public Iterator getIterator() {
		
		return new NameIterator();
	} 
	
public Iterator getOddIterator() {
		
		return new OddNamesIterator();
	} 

}
