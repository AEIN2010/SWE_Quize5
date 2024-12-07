package ThirdProblem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    List<String> employees = new ArrayList<>();
    List<Double> salaries = new ArrayList<>();

    public void addEmployee(String name, double salary, String department, String address) {
        employees.add(name);
        salaries.add(salary);
    }

    public void generateSalaryReport() {
        System.out.println("Generating salary report for all employees");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }



}