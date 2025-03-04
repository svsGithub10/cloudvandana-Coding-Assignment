/*

Problem Statement:

3. Object-Oriented Programming - Employee Management System Design a simple Java class Employee with the following attributes:

• id (integer)
• name (string)
• salary (double)

Create a method displayDetails() to print employee details. Write a main method to:

1. Create at least 3 Employee objects.
2. Store them in a list.
3. Display their details.

 */

import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(3, "Charlie", 55000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
