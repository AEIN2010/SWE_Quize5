package FourthProblem;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {

    protected List<Employee> employees = new ArrayList<>();

    public void processPayroll(String payDate, String department, String location, String zip) {
        System.out.println("Processing payroll for " + department + " department.");

        for (Employee employee : employees) {
            switch (employee.getRole()) {
                case "Manager":
                    System.out.println("Paying Manager: " + employee.getName() + " Salary: $" + (employee.getBaseSalary() + 1000));
                    break;
                case "Developer":
                    System.out.println("Paying Developer: " + employee.getName() + " Salary: $" + employee.getBaseSalary());
                    break;
                case "Intern":
                    System.out.println("Paying Intern: " + employee.getName() + " Salary: $" + (employee.getBaseSalary() - 500));
                    break;
                default:
                    System.out.println("Role not recognized for " + employee.getName());
            }
        }

        System.out.println("Payroll processed for location: " + location + ", ZIP: " + zip + " on " + payDate);
    }

    // This method adds an employee to the system
    public List<Employee> addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
        return employees;
    }



}