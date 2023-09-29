package lambdaTrip;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Trip {
    // Private data members of the Trip class
    private Integer emp_id; // employee ID
    private String emp_name; // employee name
    private String emp_address; // employee address
    private double emp_gasprice; // cost of gas per unit distance
    private int emp_distance; // distance travelled
    private double emp_costhotel; // cost of hotel stay
    private double emp_costfood; // cost of food
     Function<Double, Double> tripDiscount; // discount function for the trip
     Function<Double, Double> tripAdvanceFee; // advance fee function for the trip
     Consumer<Double> totaltripCostMethod; // consumer function for the total trip cost
    
         
    
    // Constructor to initialize the Trip object with the given data attributes
    public Trip(Integer emp_id, String emp_name, String emp_address, double emp_gasprice, int emp_distance,
                double emp_costhotel, double emp_costfood) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_gasprice = emp_gasprice;
        this.emp_distance = emp_distance;
        this.emp_costhotel = emp_costhotel;
        this.emp_costfood = emp_costfood;
        this.tripDiscount = cost -> cost * 0.9; // set the discount function to a lambda expression
        this.tripAdvanceFee = cost -> cost * 0.3; // set the advance fee function to a lambda expression
        this.tripDiscount = this.tripDiscount.andThen(this.tripAdvanceFee); // apply the advance fee after the discount
        this.totaltripCostMethod = cost -> {
            double totalCost = this.calculateCostTrip();
            System.out.println("Total trip cost: " + totalCost);
        };
    
    }
    

    // Getter and Setter methods for the private data members of the Trip class
    public Integer getEmpId() {
        return emp_id;
    }

    public void setEmpId(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmpName() {
        return emp_name;
    }

    public void setEmpName(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmpAddress() {
        return emp_address;
    }

    public void setEmpAddress(String emp_address) {
        this.emp_address = emp_address;
    }

    public double getEmpGasPrice() {
        return emp_gasprice;
    }

    public void setEmpGasPrice(double emp_gasprice) {
        this.emp_gasprice = emp_gasprice;
    }

    public int getEmpDistance() {
        return emp_distance;
    }

    public void setEmpDistance(int emp_distance) {
        this.emp_distance = emp_distance;
    }

    public double getEmpCostHotel() {
        return emp_costhotel;
    }

    public void setEmpCostHotel(double emp_costhotel) {
        this.emp_costhotel = emp_costhotel;
    }

    public double getEmpCostFood() {
        return emp_costfood;
    }

    public void setEmpCostFood(double emp_costfood) {
        this.emp_costfood = emp_costfood;
    }
    

    // Getter method for the trip discount
    public Function<Double, Double> getTripDiscount1() {
        return tripDiscount;
    }

    // Method to calculate the total cost of the trip based on the given data attributes and the trip discount function
    public double calculateCostTrip() {
        double totalCost = (emp_distance * emp_gasprice) + emp_costhotel + emp_costfood;
        return tripDiscount.apply(totalCost);
    }

    // Method to print the class data attributes in a specific format, along with the calculated cost of the trip
    public void printCostTrip() {
        System.out.println("Emp Id= " + emp_id + ", Emp Name= " + emp_name + ", Emp Add= " + emp_address +
        		", gas_price= " + emp_gasprice + ", distance= " + emp_distance + ", cost_hotel= " + emp_costhotel +
        		", cost_food= " + emp_costfood + ", Total Cost Trip= " + calculateCostTrip());
    }
 // Method to return the class data attributes as a string
    @Override
    public String toString() {
        return "Emp Id= " + emp_id + ", Emp Name= " + emp_name + ", Emp Add= " + emp_address +
                ", gas_price= " + emp_gasprice + ", distance= " + emp_distance + ", cost_hotel= " + emp_costhotel +
                ", cost_food= " + emp_costfood;
    }

    // Method to calculate the total cost of the trip after applying the discount
    public double calculateCostTripWithDiscount() {
        double cost = calculateCostTrip();
        return tripDiscount.apply(cost);
    }

 // Getter and Setter for the tripAdvanceFee field
    public Function<Double, Double> getTripAdvanceFee() {
        return tripAdvanceFee;
    }
    
    

    public void setTripAdvanceFee(Function<Double, Double> tripAdvanceFee) {
        this.tripAdvanceFee = tripDiscount.andThen(cost -> cost * 0.3 + tripAdvanceFee.apply(cost));
    }

    
    public Consumer<Double> getTotaltripCostMethod() {
        return totaltripCostMethod;
    }

    public void setTotaltripCostMethod(Consumer<Double>totaltripCostMethod) {
    	this.totaltripCostMethod = totaltripCostMethod;
    }
    

}
