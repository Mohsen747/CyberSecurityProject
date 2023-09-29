package lambdaTrip;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashSet<Trip> trips = new HashSet<>();

        // add trips to the HashSet

        // filter trips whose total cost is greater than 400
        long numEmployeesWithTotalCostGreaterThan400 = trips.stream()
                .filter(trip -> trip.calculateCostTrip() > 400)
                .count();

        System.out.println("Number of employees with total trip cost greater than 400$: " + numEmployeesWithTotalCostGreaterThan400);

        // sort employees by emp_id
        trips.stream()
                .sorted((t1, t2) -> t1.getEmpId().compareTo(t2.getEmpId()))
                .forEach(System.out::println);

        // sort employees by calculateCostTrip
        trips.stream()
                .sorted((t1, t2) -> Double.compare(t1.calculateCostTrip(), t2.calculateCostTrip()))
                .forEach(System.out::println);

        // find employee with max cost trip
        Trip maxCostTrip = trips.stream()
                .max((t1, t2) -> Double.compare(t1.calculateCostTrip(), t2.calculateCostTrip()))
                .orElse(null);
        System.out.println("Max cost trip of employee: " + maxCostTrip);

        // find employee with min cost trip
        Trip minCostTrip = trips.stream()
                .min((t1, t2) -> Double.compare(t1.calculateCostTrip(), t2.calculateCostTrip()))
                .orElse(null);
        System.out.println("Min cost trip of employee: " + minCostTrip);

        // check if any employee trip info matches emp_name "Eduard"
        boolean isEduardPresent = trips.stream()
                .anyMatch(trip -> trip.getEmpName().equals("Eduard"));
        System.out.println("Is employee trip info matching emp_name 'Eduard' present: " + isEduardPresent);

        // find all employee trip info matching emp_name "Paul"
        trips.stream()
                .filter(trip -> trip.getEmpName().equals("Paul"))
                .forEach(System.out::println);
    }
}
