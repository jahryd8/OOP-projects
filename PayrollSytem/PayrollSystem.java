package PayrollSytem;

import java.util.ArrayList;

public class PayrollSystem {
    // Attributes
    private ArrayList<Employee> employeeList;

    // Primary Constructor
    public PayrollSystem() {
        this.employeeList = new ArrayList<>();
    }

    //  Accessor (Getter)
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    //  Mutator (Add Employee)
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    //  Display Method
    public void displayPayroll() {
        for (Employee emp : employeeList) {
            emp.display();  // Assuming Employee has a display() method
            double overtimeHours = Math.max(0, emp.getHoursWorked() - 40);
            double overtimePay = 0;
            
            if (emp.getCategory().equals("PT")) {
                overtimePay = overtimeHours * 200;
            } else if (emp.getCategory().equals("FT")) {
                overtimePay = overtimeHours * 500;
            }

            double totalPay = overtimePay; // Assume base pay is handled elsewhere or overtime only
            System.out.println("Overtime Pay: $" + overtimePay);
            System.out.println("Total Pay: $" + totalPay);
            System.out.println("-----------------------------");
        }
    }
}
