package genericPoint;

public class TestGenericPoint {

	public static void main(String[] args) {

		// Instantiate an Object from Generic Class.
		Point<String> strPoint = new Point<>("Anna", "Banana");
		System.out.println(strPoint);

		// Instantiate an Object from Generic Class.
		Point<Number> pie = new Point<>(3.14, 2.71);
		System.out.println(pie);

		Integer[] x = { 2, 4, 9, 10 };
		String[] strName = { "Su", "khan", "RobertSon", "Lee" };

		strPoint.printArray2(strName);
		strPoint.printArray2(x);

		strPoint.printArray1(strName);
		strPoint.printArray1(x);
	}


	}


