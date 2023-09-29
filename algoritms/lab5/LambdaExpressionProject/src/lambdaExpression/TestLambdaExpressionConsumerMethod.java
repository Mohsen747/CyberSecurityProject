package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestLambdaExpressionConsumerMethod {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        Consumer<Integer> method = (n) -> { System.out.println(n); };

        System.out.println("Invoke simple method");
        numbers.forEach(method);

        Consumer<Integer> methodToDouble = (n) -> { System.out.println(n * 2); };
        System.out.println("Invoke methodToDouble as further collection processing");
        numbers.forEach(methodToDouble);

        Consumer<Integer> fullmethod = (n) -> { int x = 2; System.out.println(n * 2 + x); }; //Unnamed method
        System.out.println("Invoke fullMethod as named method further collection processing");
        numbers.forEach(fullmethod);

        fullmethod = n -> invokeFullMethod(n);
        System.out.println("Calling functional method accept within named Invoke fullMethod as further collection processing");
        fullmethod.accept(10);
        System.out.println("Invoke fullMethod as further collection processing");
        numbers.forEach(fullmethod);

        Function<Integer, Integer> half = n -> n / 2; //Defining and initializing half function

        System.out.println("Printing ArrayList using Enhanced for Loop");
        for (Integer elm : numbers)
            System.out.println(half.apply(elm));

        System.out.println("Method reference using operator ::");
        numbers.forEach(System.out::println); //Using System.out::println method reference
    }

    public static void invokeFullMethod(int num) {
        int x = 2;
        double z = x + 5;
        System.out.println(num * 2 + x * z);
    }
}
