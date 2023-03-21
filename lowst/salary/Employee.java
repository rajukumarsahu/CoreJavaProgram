package lowst.salary;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25, 25000));
        employees.add(new Employee("Jane", 30, 30000));
        employees.add(new Employee("Mary", 28, 28000));
        employees.add(new Employee("Bob", 35, 20000));
        employees.add(new Employee("Alex", 29, 29000));

        // Find the lowest salary
        double lowestSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(Double.POSITIVE_INFINITY);
        System.out.println("Lowest salary of emp::-"+lowestSalary);

        // Filter the employees with the lowest salary
        List<Employee> lowestSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() == lowestSalary)
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        // Print out the employees with the lowest salary
        System.out.println("Employees with the lowest salary:");
        lowestSalaryEmployees.forEach(System.out::println);
    }
}
