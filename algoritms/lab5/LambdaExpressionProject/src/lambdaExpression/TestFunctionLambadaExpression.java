package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionLambadaExpression {

	public static void main(String[] args) {
		
		//half is a method that returns double 
		Function<Integer, Double> half = n -> {
			return n/2.0;
		};
		
		double ans = half.apply(10);
		System.out.println("half of ans is: "+ans);
		
		Function<Integer, Double> half2 = half.andThen(b->b*3);
		System.out.println("Testing andThen Method Interface: "+half2.apply(10));
		
		List<Integer> numbersList = new ArrayList<>();
		
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(8);
		numbersList.add(1);
		
		System.out.println("Applying half to ArrayList:");
		numbersList.forEach(n-> useHalf(n, half));
		
		System.out.println("Applying half2 to ArrayList:");
		numbersList.forEach(n-> useHalf(n, half2));
	}

	private static void useHalf(int num, Function<Integer, Double> halfMethodpar) 
	{
		
	double halfRes = halfMethodpar.apply(num);	
	System.out.println(halfRes);	
	}

}
