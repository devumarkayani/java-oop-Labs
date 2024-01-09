import java.util.ArrayList;
import java.util.List;

class Employee {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees in " + deptName + " department:");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmpId() + ", Name: " + employee.getEmpName());
        }
    }
}

public class aggregation{
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "Shan waston ");
        Employee emp2 = new Employee(2, "Jane Doe");

        Department itDepartment = new Department("Information Technology Department");
        itDepartment.addEmployee(emp1);
        itDepartment.addEmployee(emp2);

        
        itDepartment.displayEmployees();
    }
}
