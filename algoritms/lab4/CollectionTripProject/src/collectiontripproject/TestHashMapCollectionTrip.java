package collectiontripproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestHashMapCollectionTrip {

    public static void main(String[] args) {
        Map<Integer, Trip> tripMap = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("trip.in"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                Integer emp_id = Integer.parseInt(parts[0]);
                String emp_name = parts[1];
                String emp_address = parts[2];
                double emp_gasprice = Double.parseDouble(parts[3]);
                int emp_distance = Integer.parseInt(parts[4]);
                double emp_costhotel = Double.parseDouble(parts[5]);
                double emp_costfood = Double.parseDouble(parts[6]);
                Trip trip = new Trip(emp_id, emp_name, emp_address, emp_gasprice, emp_distance, emp_costhotel, emp_costfood);
                tripMap.put(emp_id, trip);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        
        System.out.println("The Trip Employee you entered in the Map are: " + tripMap.size());
        
        // Search for emp_id = 4
        Integer searchId = 4;
        System.out.println("\nSearching for the Trip with emp_id = " + searchId + "\n");
        Trip trip = tripMap.get(searchId);
        if (trip != null) {
        	System.out.println(trip.toString());
        	
        } else {
            System.out.println("Trip not found");
        }
        
        // Iterate through keys of HashMap
        System.out.println("\nHere are the keys:");
        for (Integer key : tripMap.keySet()) {
            System.out.println(key);
        }
        
        // Iterate through records stored in collection
        System.out.println("\nHere are the records of Trip Information in the Map:\n");
        for (Trip t : tripMap.values()) {
        	System.out.println(t.toString());
        }
    }
}
