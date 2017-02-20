package tpc;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee() {
        this("Not Set", 1.0, 1);
    }
    
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the hoursWorked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getFortnightPay() {
        return getHourlyRate() * getHoursWorked();
    }
    
}
