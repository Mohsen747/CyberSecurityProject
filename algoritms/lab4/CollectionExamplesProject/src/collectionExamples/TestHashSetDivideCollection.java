package collectionExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetDivideCollection {

	public static void main(String[] args) throws FileNotFoundException {
		//Reading from  input file and
		//storing into HashSet Collection
		Set<Divide> divideInfileSet = new HashSet<>();
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		
		while(inFile.hasNextLine())
		{
			Divide inFileDivide  =  new Divide();
			
			inFileDivide.setX(inFile.nextInt());
			inFileDivide.setY(inFile.nextInt());
			
			divideInfileSet.add(inFileDivide);

		}
		inFile.close();
		
		System.out.println("Printing HashSet divideInfileSet element using enhanced for loop\n");
		
		for (Divide elem  : divideInfileSet)
		{
			System.out.println(elem);

		}
		
	}

}
