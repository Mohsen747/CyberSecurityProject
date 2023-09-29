package departmentstackmidterm;

public class Department {
    private int d_id;
    private String d_name;
    private String d_address;

    public Department(int d_id, String d_name, String d_address) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_address = d_address;
    }

    public Department(String data) {
        String[] fields = data.split("\\s+");
        this.d_id = Integer.parseInt(fields[0]);
        this.d_name = fields[1];
        this.d_address = fields[2];
    }

    public int getD_id() {
        return d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public String getD_address() {
        return d_address;
    }

    @Override
    public String toString() {
        return d_id + "//" + d_name + "//" + d_address;
    }
}
