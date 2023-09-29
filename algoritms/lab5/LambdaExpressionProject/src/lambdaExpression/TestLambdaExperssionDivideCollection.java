package lambdaExpression;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestLambdaExperssionDivideCollection {
	
	public static void main(String[] args) {
		// Read from input file divide.in
		
		// filling up HashSet data structure divideInFileSet
		
		Set<Divide> divideInFileSet = new HashSet<>();
		divideInFileSet.add(new Divide(10, 2));
		divideInFileSet.add(new Divide(15, 3));
		divideInFileSet.add(new Divide(20, 4));
		
		// print Divide HashSet collection using Lambda Expression 
		System.out.println("\nPrinting Divide HashSet collection using Lambda Expression:");
		divideInFileSet.forEach(n -> System.out.println(n.doDivide()));
		
		// print Divide HashSet collection using method reference operator ::
		System.out.println("\nPrinting Divide HashSet collection using method reference operator ::");
		divideInFileSet.forEach(Divide::doDivide);
		
		// Define variable divMethod of type Consumer that performs x/y
		Consumer<Divide> divMethod = n -> System.out.println(n.getX() / n.getY());
		
		// testing divMethod using accept
		System.out.println("\nTesting divMethod using accept:");
		divideInFileSet.forEach(divMethod);
		
		// Define variable divMethod2 of type Consumer using  operator ::
		Consumer<Divide> divMethod2 = Divide::doDivide;
		
		// Define variable divMethod3 of type Function that returns (n*3)/(n-2)
		System.out.println("\nApplying divMethod2 to every data structure divideInFileSet:");
		divideInFileSet.forEach(divMethod2);
		
		//Function<Integer, Double> divideMethod3 = n -> {return ((n.getX()*3.0)/ (n.getY()-2);};
		Function<Divide, Double> divMethod3 = n -> ((n.getX() * 3.0) / (n.getY() - 2));

		// apply it to every data structure divideInFileSet where n = (field1+fild2)
		//divideInF	
		System.out.println("\nApplying divMethod3 to every data structure divideInFileSet where n = (field1+fild2):");
		divideInFileSet.forEach(n -> System.out.println(divMethod3.apply(n)));
	}
}
	
