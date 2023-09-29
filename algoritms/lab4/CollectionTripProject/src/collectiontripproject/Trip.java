package collectiontripproject;

public class Trip {
    private Integer emp_id;
    private String emp_name;
    private String emp_address;
    private double emp_gasprice;
    private int emp_distance;
    private double emp_costhotel;
    private double emp_costfood;

    public Trip(Integer emp_id, String emp_name, String emp_address, double emp_gasprice, int emp_distance, double emp_costhotel, double emp_costfood) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.emp_gasprice = emp_gasprice;
        this.emp_distance = emp_distance;
        this.emp_costhotel = emp_costhotel;
        this.emp_costfood = emp_costfood;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public double getEmp_gasprice() {
        return emp_gasprice;
    }

    public void setEmp_gasprice(double emp_gasprice) {
        this.emp_gasprice = emp_gasprice;
    }

    public int getEmp_distance() {
        return emp_distance;
    }

    public void setEmp_distance(int emp_distance) {
        this.emp_distance = emp_distance;
    }

    public double getEmp_costhotel() {
        return emp_costhotel;
    }

    public void setEmp_costhotel(double emp_costhotel) {
        this.emp_costhotel = emp_costhotel;
    }

    public double getEmp_costfood() {
        return emp_costfood;
    }

    public void setEmp_costfood(double emp_costfood) {
        this.emp_costfood = emp_costfood;
    }

    public double calculateCostTrip() {
        return (emp_distance * emp_gasprice) + emp_costhotel + emp_costfood;
    }

	@Override
	public String toString() {
		return "Trip [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address + ", emp_gasprice="
				+ emp_gasprice + ", emp_distance=" + emp_distance + ", emp_costhotel=" + emp_costhotel
				+ ", emp_costfood=" + emp_costfood + "]";
	}
}
