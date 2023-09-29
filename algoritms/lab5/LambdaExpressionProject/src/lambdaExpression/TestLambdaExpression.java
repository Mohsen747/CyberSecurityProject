package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class TestLambdaExpression {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		
		
		
		System.out.println("Priniting ArrayList using Enhanced for Loop");
		for (Integer elm:numbers)
			System.out.println(elm);
		
		System.out.println("Priniting ArrayList using Lambda Expression");
		numbers.forEach((n)->{System.out.println(n);});
	}


}

