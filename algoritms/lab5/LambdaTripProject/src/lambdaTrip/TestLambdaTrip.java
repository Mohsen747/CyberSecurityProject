package lambdaTrip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;

public class TestLambdaTrip {

    public static void main(String[] args) {
        HashSet<Trip> tripSet = new HashSet<>(); // create HashSet to store Trip records

        try (BufferedReader br = new BufferedReader(new FileReader("trip.in"))) { // read from file
            String line;
            while ((line = br.readLine()) != null) { // read line by line
                String[] record = line.split("\t"); // split the line by tab delimiter

                // create a new Trip object using the fields from the record
                Trip trip = new Trip(Integer.parseInt(record[0]), record[1], record[2], Double.parseDouble(record[3]),
                        Integer.parseInt(record[4]), Double.parseDouble(record[5]), Double.parseDouble(record[6]));

                tripSet.add(trip); // add Trip object to HashSet
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input file: " + e.getMessage());
        }

        // print size of HashSet
        System.out.println("\nThe Employee Trip information you entered are: " + tripSet.size() + "\n");

        // print all elements of the HashSet using a Lambda expression and the toString() method
        System.out.println("\nThe Employee Trip information using Lambda Expression: ");
        tripSet.forEach(trip -> System.out.println(trip.toString()));

        // print all elements of the HashSet using a Lambda expression and the printCostTrip() method
        System.out.println("\nInvoking printCostTrip method using Lambda Expression: ");
        tripSet.forEach(TestLambdaTrip::lambda_printCostTrip);

        // print all elements of the HashSet using method reference operator :: invoking printCostTrip() instance method of the class Trip
        System.out.println("\nInvoking printCostTrip method using :: operator within foreach: ");
        tripSet.forEach(Trip::printCostTrip);

        // apply the trip discount functional interface on all elements of the tripSet HashSet and display the new cost of the trip after discount
        System.out.println("\nTrip information after applying the discount: ");
        tripSet.forEach(trip -> {
            double cost = trip.calculateCostTrip();
            double discountedCost = trip.tripDiscount.apply(cost);
            
            System.out.println("Cost Trip After Discount For " + trip.getEmpId() + " " + trip.getEmpName() + " is: " + String.format("%.2f", discountedCost) + "$");
              });
        
        // apply the trip advance fee functional interface on all elements of tripSet HashSet and display the total trip advance for each employee
        System.out.println("\nApplying tripAdvanceFee Function to Trip set using andthen method : ");
        tripSet.forEach(trip -> {
            double totalAdvance = trip.tripAdvanceFee.apply(trip.calculateCostTrip());
            System.out.println("Cost Trip Advance Fee For " + trip.getEmpId() + " " + trip.getEmpName() + " is: " + String.format("%.2f", totalAdvance) + "$");
        });
        
        // Number of Employees in the HashSet whose Total Trip Cost > 400$
        long count = tripSet.stream().filter(trip -> trip.calculateCostTrip() > 400).count();
        System.out.println("\nThe number of employees whose total trip cost is greater than 400$ is: " + count);
        
        // Employees in the HashSet sorted by Emp_id.
        System.out.println("\nEmployees sorted by emp_id:");
        tripSet.stream().sorted((t1, t2) -> Integer.compare(t1.getEmpId(), t2.getEmpId())).forEach(System.out::println);
// Employees in the HashSet sorted by CalculateCostTrip.
        System.out.println("\nEmployees sorted by calculateCostTrip:");
        tripSet.stream().sorted((t1, t2) -> Double.compare(t1.calculateCostTrip(), t2.calculateCostTrip())).forEach(System.out::println);
        
        // Max Cost Trip of Employee in the HashSet.
        Trip maxCostTrip = tripSet.stream().max((t1, t2) -> Double.compare(t1.calculateCostTrip(), t2.calculateCostTrip())).orElse(null);
        if(maxCostTrip != null) {
            System.out.println("\nMax Cost Trip of Employee:");
            System.out.println(maxCostTrip.toString());
        }
    
 // Use the min() method to get the minimum cost of trip between all employees
    System.out.println("\nThe minimum cost of trip between all employees is \n" +
            tripSet.stream().min(Comparator.comparing(Trip::calculateCostTrip)).get());;
    
    //Display if Employee Trip info matching emp_name "Eduard"
    System.out.println("\nUsing anyMatch() in HashSet where Predicate Eduard: " +
    tripSet.stream().anyMatch(s -> s.getEmpName().contains("Eduard"))) ;
    
  //Display all Employee Trip info all matching emp_name "Paul"
    System.out.println("\nUsing filter all matching emp_name Paul");
    tripSet.stream().filter(s -> s.getEmpName().contains("Paul")).forEach(trip -> System.out.println(trip));
}
    private static void lambda_printCostTrip(Trip trip) {
        trip.printCostTrip();
    }

}
