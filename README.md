# Single Responsibility Principle (SRP)

The **Single Responsibility Principle (SRP)** is one of the core SOLID principles in object-oriented programming. It states that a class should have **only one reason to change**, meaning it should have only **one responsibility** or **one job**.

## Why is SRP Important?

- **Simplicity**: Classes that focus on a single responsibility are easier to understand.
- **Maintainability**: If a class has only one job, changes to that job don’t affect unrelated areas of the code.
- **Reusability**: A class that does one thing well can be reused in different contexts.
- **Testability**: Single responsibility classes are easier to test since they only deal with one concern.

---

## Real-World Analogy

Imagine a restaurant:
- The **chef** is responsible for cooking.
- The **cashier** is responsible for handling payments.

If one person tries to do both jobs, it can lead to confusion and inefficiency. Similarly, in programming, a class should focus on one specific task. If a class tries to do too much, it becomes harder to manage and modify.

---

## Example Without SRP (Violating SRP)

In this example, the `Employee` class is responsible for both managing employee data **and** printing it, which violates SRP.

```java
public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // This method is responsible for both managing data and printing it
    public void printEmployeeDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        employee.printEmployeeDetails();
    }
}
