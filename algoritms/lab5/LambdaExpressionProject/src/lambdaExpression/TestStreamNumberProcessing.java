package lambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStreamNumberProcessing {

	public static void main(String[] args) {
		
		List<Double> numbersList = new ArrayList<>();
		
		
		numbersList.add(149.99);
		numbersList.add(25.0);
		numbersList.add(55.99);
		numbersList.add(14.99);
		numbersList.add(69.99);
		numbersList.add(189.99);
		
		System.out.println("Printing numbersList useing reference methode operator : ");
		numbersList.forEach(System.out::println);
		// Count the number of elements which are higher than 60: in this case
		

		int count = 0;
		for (double numEl:numbersList) 
		{
			if (numEl > 60) 
			
				count ++;
		}
		System.out.println("Number of elements greater than 60: " + count);
		
		System.out.println("Useing Stream Processing "+ count);
		System.out.println("Useing filter() Number of Element  "+ count);
		numbersList.stream().filter(e -> e > 60).count();
		
		System.out.println("Using sorted () Number of Elements sorted" );
		numbersList.stream().sorted().forEach(System.out::println);
		 
		// Block 1 compare between tow values
		//int comp =Double.compare (5.0, 5.0);// comp =+1/-1/0 
		//System.out.println(comp);
		System.out.println("Using the max() Max in numbersList is "+
		numbersList.stream().max(Double::compare).get());
		 
		System.out.println("Using Sorted (reverOrder() Number of Elements sorted"); 
		numbersList.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}

