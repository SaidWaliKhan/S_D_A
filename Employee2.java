



// Example with SRP (Correct Implementation)

public class Employee2 {
    private String name;
    private int salary;

    public Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

class EmployeePrinter {
    public void printDetails(Employee2 employee) {
        System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
    }
}

class Main {
    public static void main(String[] args) {
        Employee2 employee = new Employee2("Muneeb", 50000);

        EmployeePrinter printer = new EmployeePrinter();
        printer.printDetails(employee);
    }
}
