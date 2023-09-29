package collectionExamples;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetCollection {

	public static void main(String[] args) {
		Set<String> mySet = new TreeSet<>();

		mySet.add("Pear"); // HashCode  ("pear")= 105
		mySet.add("Apple");
		mySet.add("Pear");
		mySet.add("Strawberry");
		mySet.add("Banana");	
		
		//Print HashSet mySet using Enhanced for loop
		System.out.println("Printing HashSet elements using Enhanced for loop\n ");

		for (String elem : mySet)
		{
			System.out.println(elem + " ");
			
		}
	}

}
