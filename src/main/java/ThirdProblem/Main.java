package ThirdProblem;

public class Main {

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        SalariesManagement sManager = new SalariesManagement();
        manager.addEmployee("John", 5000, "IT", "123 Main St");
        manager.addEmployee("Alice", 7000, "HR", "456 Maple Ave");
        sManager.calculateSalary("John", manager.employees, manager.salaries);
        manager.salaries = sManager.applySalaryRaise(manager.salaries);
    }
}
