package collectionExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapCollection {

	public static void main(String[] args) {

		Map<String , Car> carHashMap = new HashMap<>();
		
		Car car1 =  new Car ("K1245" , "Ford" , 35000.0);
		Car car2 =  new Car ("M198754" , "Honda" , 40000.0);
		Car car3 =  new Car ("M198787" , "Hundai" , 20000.0);
		Car car4 =  new Car ("S1288745" , "Nissan" , 35000.0);
		
		//Filling up  HashMap Collection  carHashMap
		carHashMap.put(car1.getVin() , car1);
		carHashMap.put(car2.getVin() , car2);
		carHashMap.put(car3.getVin(), car3);
		carHashMap.put(car4.getVin() , car4);
		
		//Searching according to HashMap key ()Primary Key
		Car foundCar = carHashMap.get(car3.getVin());
		 if(foundCar != null)
		 {
			 System.out.println("Car found: "+ foundCar);
		 }

		 else
		 {
			 System.out.println("Car not found: ");

		 }
		 
		 //Report to display  all  keys
		 Set<String> carKeys = carHashMap.keySet();
		 System.out.println("\nDisplay All Keys of Map Collection using  Enhanced fpr loop \n");
		 
		 for  (String carKey : carKeys)
		 {
			 System.out.println(carKey);

		 }
		 
		 //Report to display  all values
		 Collection<Car> carValues = carHashMap.values();
		 System.out.println("\nDisplay All Values of Map Collection \n");
		 
		 for  (Car carValue : carValues)
		 {
			 System.out.println(carValue);

		 }

	}

}
