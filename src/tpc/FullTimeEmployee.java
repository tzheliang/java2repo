package tpc;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    public FullTimeEmployee() {
        this("Not Set", 1.0);
    }
    
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        setMonthlySalary(monthlySalary);
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    public double getFortnightPay() {
        return getMonthlySalary() / 2;
    }
    
}
