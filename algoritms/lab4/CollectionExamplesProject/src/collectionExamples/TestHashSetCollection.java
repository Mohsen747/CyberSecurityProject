package collectionExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSetCollection {

	public static void main(String[] args) {
		//From  JCF
				Set<String> mySet = new HashSet<>();

				mySet.add("Pear"); // HashCode  ("pear")= 105
				mySet.add("Apple");
				mySet.add("Strawberry");
				mySet.add("Banana");	
				
				//Print HashSet mySet using Enhanced for loop
				System.out.println("Printing HashSet elements using Enhanced for loop\n ");

				for (String elem : mySet)
				{
					System.out.println(elem + " ");
					
				}
			

				//Printing elements of linkedHashSet mySet2 using  Enhanced for loop
				Set<String> mySet2 = new LinkedHashSet<>();

				mySet2.add("Pear"); // HashCode  ("pear")= 105
				mySet2.add("Apple");
				mySet2.add("Strawberry");
				mySet2.add("Banana");
				
				System.out.println("\nPrinting LinkedHashSet mySet2 elements using Enhanced for loop\n ");

				for (String elem : mySet2)
				{
					System.out.println(elem + " ");
					
				}


	}

}
