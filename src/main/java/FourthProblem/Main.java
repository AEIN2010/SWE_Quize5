package FourthProblem;

public class Main {

    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.addEmployee(new Employee("Alice", "Manager", 5000, "HR"));
        payrollSystem.addEmployee(new Employee("Bob", "Developer", 4000, "IT"));

        payrollSystem.processPayroll("2024-12-07", "IT", "New York", "10001");
        Employee.updateEmployeeDepartment("Alice", "Finance", payrollSystem.employees);
    }
}
