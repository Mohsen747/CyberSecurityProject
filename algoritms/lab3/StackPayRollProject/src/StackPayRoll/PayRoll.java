package StackPayRoll;

public class PayRoll {
    private int employee_id;
    private String employee_name;
    private String employee_ssn;
    private double employee_work_hours;
    private double employee_hour_rate;

    public PayRoll() {
        this.employee_id = 0;
        this.employee_name = "";
        this.employee_ssn = "";
        this.employee_work_hours = 0;
        this.employee_hour_rate = 0;
    }

    public PayRoll(int employee_id, String employee_name, String employee_ssn, double employee_work_hours, double employee_hour_rate) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_ssn = employee_ssn;
        this.employee_work_hours = employee_work_hours;
        this.employee_hour_rate = employee_hour_rate;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setEmployeeSSN(String employee_ssn) {
        this.employee_ssn = employee_ssn;
    }

    public void setEmployeeWorkHours(double employee_work_hours) {
        this.employee_work_hours = employee_work_hours;
    }

    public void setEmployeeHourRate(double employee_hour_rate) {
        this.employee_hour_rate = employee_hour_rate;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public String getEmployeeSSN() {
        return employee_ssn;
    }

    public double getEmployeeWorkHours() {
        return employee_work_hours;
    }

    public double getEmployeeHourRate() {
        return employee_hour_rate;
    }

    public String toString() {
        return "Employee ID: " + employee_id + "\n" +
                "Employee Name: " + employee_name + "\n" +
                "Employee SSN: " + employee_ssn + "\n" +
                "Employee Work Hours: " + employee_work_hours + "\n" +
                "Employee Hour Rate: " + employee_hour_rate + "\n" +
                "Employee Net Amount Pay: " + CalculateNetAmountPay() + "\n";
    }

    public double CalculateNetAmountPay() {
        double Total_Income = employee_work_hours * employee_hour_rate;
        double Prv_Tax = Total_Income * 0.09;
        double Fed_Tax = Total_Income * 0.07;
        double QP_Ins = Total_Income * 0.0055;
        double E_ins = Total_Income * 0.014;
        double Qpp = Total_Income * 0.045;
        double Union_d = Total_Income * 0.0165;
        double Deductions = Prv_Tax + Fed_Tax + QP_Ins + E_ins + Qpp + Union_d;
        double Net_Amount = Total_Income - Deductions;
        return Net_Amount;
    }
}
