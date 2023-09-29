package lambdaHashMapFaculty;

public class Faculty {
	
    private int f_id;
    private String f_Lname;
    private String f_Fname;
    private double f_Salary;
    private double f_BonusRate;
    private double f_TaxRate = 0.075;
    private double p_TaxRate = 0.06;

    public Faculty(int id, String lname, String fname, double salary, double bonusRate) {
        this.f_id = id;
        this.f_Lname = lname;
        this.f_Fname = fname;
        this.f_Salary = salary;
        this.f_BonusRate = bonusRate;
    }

    public double doCalcBonus() {
        return this.f_Salary * this.f_BonusRate;
    }

    public double doCalcBonusTax() {
        double bonus = doCalcBonus();
        return bonus * (f_TaxRate + p_TaxRate);
    }

    // getters and setters for data attributes
    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getF_Lname() {
        return f_Lname;
    }

    public void setF_Lname(String f_Lname) {
        this.f_Lname = f_Lname;
    }

    public String getF_Fname() {
        return f_Fname;
    }

    public void setF_Fname(String f_Fname) {
        this.f_Fname = f_Fname;
    }

    public double getF_Salary() {
        return f_Salary;
    }

    public void setF_Salary(double f_Salary) {
        this.f_Salary = f_Salary;
    }

    public double getF_BonusRate() {
        return f_BonusRate;
    }

    public void setF_BonusRate(double f_BonusRate) {
        this.f_BonusRate = f_BonusRate;
    }

    public double getF_TaxRate() {
        return f_TaxRate;
    }

    public void setF_TaxRate(double f_TaxRate) {
        this.f_TaxRate = f_TaxRate;
    }

    public double getP_TaxRate() {
        return p_TaxRate;
    }

    public void setP_TaxRate(double p_TaxRate) {
        this.p_TaxRate = p_TaxRate;
    }

    @Override
	public String toString() {
		return "Faculty [f_id=" + f_id + ", f_Lname=" + f_Lname + ", f_Fname=" + f_Fname + ", f_Salary=" + f_Salary
				+ ", f_BonusRate=" + f_BonusRate + ", f_TaxRate=" + f_TaxRate + ", p_TaxRate=" + p_TaxRate + "]";
	}
    public double getSalary() {
        return f_Salary;
    }

}
