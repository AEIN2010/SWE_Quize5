package ThirdProblem;

import java.util.List;

public class SalariesManagement {

    public void calculateSalary(String name, List<String> employees, List<Double> salaries) {
        int index = employees.indexOf(name);
        if (index >= 0) {
            double salary = salaries.get(index);
            System.out.println("Salary for " + name + ": " + salary);
        }
    }


    public List<Double> applySalaryRaise(List<Double> salaries) {
        for (int i = 0; i < salaries.size(); i++) {
            salaries.set(i, salaries.get(i) * 1.1);
        }
        return salaries;
    }

}
