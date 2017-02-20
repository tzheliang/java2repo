package tpc;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private String name;
    private ArrayList<Employee> employees;
    
    public Company(String name, ArrayList<Employee> employees) {
        setName(name);
        setEmployees(employees);
    }
    
    public Company(String name) {
        this(name, new ArrayList<Employee>());
    }
    
    public boolean add(Employee emp) {
        return getEmployees().add(emp);
    }
    
    public Employee search(int empNum) {
        for (Employee anEmp: getEmployees()) {
            if (anEmp.getEmpNum() == empNum) {
                return anEmp;
            }
        }
        return null;
    }
    
    public String allEmployees() {
        String details = "";
        for (Employee anEmp: getEmployees()) {
            details += anEmp + "\n";
        }
        
        return details;
    }
    
    public int numberOfEmployees() {
        return getEmployees().size();
    }
    
    public int numberOfFullTimeEmployees() {
        int counter = 0;
        for (Employee anEmp: getEmployees()) {
            if (anEmp instanceof FullTimeEmployee) {
                counter++;
            }
        }
        return counter;
    }
    
    public int numberOfPartTimeEmployees() {
    int counter = 0;
    for (Employee anEmp: getEmployees()) {
        if (anEmp instanceof PartTimeEmployee) {
            counter++;
        }
    }
    return counter;
    }
    
    public double totalFortnightPay() {
        double total = 0.0;
        for (Employee anEmp: getEmployees()) {
            total += anEmp.getFortnightPay();
        }
        return total;
    }
    
    public double totalMonthlySalary() {
        double total = 0.0;
        for (Employee anEmp : getEmployees()) {
            if (anEmp instanceof FullTimeEmployee) {
                total += ((FullTimeEmployee) anEmp).getMonthlySalary();
            }
        }
        return total;
    }
    
    public String sortedEmployees(String criteria) {
        ArrayList<Employee> newList = new ArrayList<Employee>(getEmployees());       
        if (criteria.equalsIgnoreCase("name")) {
            Collections.sort(newList);
        } else {
            Collections.sort(newList, new CS());
        }
        
        String sorted = "";
        for (Employee anEmp: newList) {
            sorted += anEmp + "\n";
        }
        
        return sorted;
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

    /**
     * @return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
