package tpc;

public abstract class Employee implements Comparable<Employee> {
    static int genNum = 1;
    private int empNum;
    private String name;
    
    public Employee() {
        this("Not Set");
    }
    
    public Employee(String name) {
        setEmpNum();
        setName(name);
    }

    /**
     * @return the empNum
     */
    public int getEmpNum() {
        return empNum;
    }

    /**
     * @param empNum the empNum to set
     */
    private void setEmpNum() {
        empNum = genNum++;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return getName() + " with Employee Number: " + getEmpNum() + 
                ", earning a fortnight pay of " + String.format("%1.2f", getFortnightPay());
    }
    
    public abstract double getFortnightPay();
    
    public int compareTo(Employee rhs) {
        return this.getName().compareTo(rhs.getName());
    }
}
