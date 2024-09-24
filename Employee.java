



// Example without SRP (Violating SRP)
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

 
    public static void main(String[] args) {
        Employee employee = new Employee("Momin", 50000);
        employee.printEmployeeDetails();
    }

}