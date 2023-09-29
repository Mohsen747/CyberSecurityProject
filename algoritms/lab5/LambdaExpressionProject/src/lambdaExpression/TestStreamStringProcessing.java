package lambdaExpression;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreamStringProcessing {
	
	public static void main(String[] args) {
		Set<String> myFruitSet = new HashSet<>();
		
		myFruitSet.add("Pear");
		myFruitSet.add("Apple");
		myFruitSet.add("Strawberry");
		myFruitSet.add("Banana");
		myFruitSet.add("Orange");
		myFruitSet.add("blackberry");
		
		System.out.println("\nPrinting numbersList useing reference methode operator : ");
		myFruitSet.forEach(System.out::println);
		
		System.out.println("\nUsing sorted() myFruitSet Sorted");
		myFruitSet.stream().sorted().forEach(System.out::println);
		
				
		System.out.println("\nUsing sorted() in reverse order");
		myFruitSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("\nUsing sorted() myFruitSet Ignor Case in Reverse Order");
		myFruitSet.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(System.out::println);
		
		System.out.println("\nUsing sorted() myFruitSet with length greater than 5");
		myFruitSet.stream().filter(e -> e.length() > 5)
		.forEach(System.out::println);

		System.out.println("\nUsing AnyMacht() myFruitSet where Predicate Banana\n  "+
		myFruitSet.stream().anyMatch(s -> s.contains("Banana")));
		
		System.out.println("\nUsing AnyMacht() myFruitSet where Predicate Str\n  "+
		myFruitSet.stream().anyMatch(s -> s.startsWith("Str")));
		
		System.out.println("\nUsing map() myFruitSet with Function length\n");
		myFruitSet.stream().map(e -> e.length())
		.forEach(System.out::println);
		
		List<Integer> fruitLenght = myFruitSet.stream().map(e -> e.length())
				.collect(Collectors.toList());
		
		System.out.println("\nUsing map() myFruitSet with Function Upper case\n");
		myFruitSet.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		Predicate<String> c1 = s -> s.contains("Banana") 
				|| s.startsWith("St");
		
		System.out.println("\nUsing anyMatch() myFruitSet with Multiple Predicate\n");
		System.out.println(myFruitSet.stream().anyMatch(c1));

	}
}

