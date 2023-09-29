package collectiontripproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TestHashSetCollectionTrip {
    public static void main(String[] args) throws FileNotFoundException {
        // create a HashSet to store the records
    	HashSet<Trip> tripRecords = new HashSet<>();
    	HashSet<String> employeeNames = new HashSet<>(); // to store the names of employees


        // read the records from the file and add them to the HashSet
        File file = new File("Trip.in");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] fields = line.split("\t");
            Integer emp_id = Integer.parseInt(fields[0]);
            String emp_name = fields[1];
            String emp_address = fields[2];
            double emp_gasprice = Double.parseDouble(fields[3]);
            int emp_distance = Integer.parseInt(fields[4]);
            double emp_costhotel = Double.parseDouble(fields[5]);
            double emp_costfood = Double.parseDouble(fields[6]);
            
         // check whether the employee name already exists
            if (employeeNames.contains(emp_name)) {
                System.out.println("Error: Duplicate employee name detected. Trip information not added.");
            } else {
                // add the new trip to the HashSet and the employee name to the HashSet of names
                Trip trip = new Trip(emp_id, emp_name, emp_address, emp_gasprice, emp_distance, emp_costhotel, emp_costfood);
                tripRecords.add(trip);
                employeeNames.add(emp_name);
            }
        }
        scanner.close();

        // display the number of elements in the HashSet
        System.out.println("The Employee Trip information you entered are: " + tripRecords.size());

    
        
        // create a LinkedHashSet to maintain input file order
        LinkedHashSet<Trip> linkedHashSet = new LinkedHashSet<>(tripRecords);

        
        
        // print all elements of the HashSet
        for (Trip trip : tripRecords) {
        	System.out.println(trip.toString());
        }

        // print all elements of the HashSet using an Iterator
        System.out.println("\nUsing Iterator interface, the Employee Trip information are:\n");
        Iterator<Trip> iterator = tripRecords.iterator();
        while (iterator.hasNext()) {
            Trip trip = iterator.next();
            System.out.println(trip.toString());
            }

        // add a new client
        Trip newClient = new Trip(2,"Amine Khan", "Paris France", 1.11, 50, 75.00, 50.00);
        tripRecords.add(newClient);

     // print all elements of the HashSet after adding the new client
        System.out.println("\nAfter adding a new client, the Employee Trip information are:\n");
        for (Trip trip : tripRecords) {
      	System.out.println(trip.toString());
        }
        

        // print all elements of the TreeSet with respect to emp_id
        TreeSet<Trip> sortedById = new TreeSet<>(Comparator.comparingInt(Trip::getEmp_id));
        sortedById.addAll(tripRecords);
        System.out.println("\nAfter sorting by emp_id, the Employee Trip information are:\n");
        for (Trip trip : sortedById) {
        	System.out.println(trip.toString());
        	}

        // print all elements of the TreeSet with respect to Total Cost
        TreeSet<Trip> sortedByTotalCost = new TreeSet<>(Comparator.comparingDouble(Trip::calculateCostTrip));
        sortedByTotalCost.addAll(tripRecords);
        System.out.println("\nAfter sorting by Total Cost, the Employee Trip information are:\n");
        for (Trip trip : sortedByTotalCost) {
        	System.out.println(trip.toString());
        }
     // print all elements of the LinkedHashSet to maintain input file order
        System.out.println("\nThe Trip Employee information added to the LinkedHashSet (Notice it keeps the order found in the input file):\n");
        for (Trip trip : linkedHashSet) {
        	System.out.println(trip.toString());
        }
    }
}