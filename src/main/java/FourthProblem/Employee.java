package FourthProblem;

import java.util.ArrayList;
import java.util.List;


class Employee {
    private String name;
    private String role;
    private double baseSalary;
    private String department;

    public Employee(String name, String role, double baseSalary, String department) {
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    static public void updateEmployeeDepartment(String name, String newDepartment, List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.setDepartment(newDepartment);
                System.out.println("Updated department for " + name);
                return;
            }
        }
        System.out.println("Employee not found: " + name);
    }
}