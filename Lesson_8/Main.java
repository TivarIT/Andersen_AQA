package Lesson_8;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = EmployeeArray.createEmployees();

        System.out.println("All Employees:");
        for (Employee employee : employees) {
            employee.printInfo();
        }

        System.out.println("\nEmployees older than 40:");
        EmployeeFilter.printEmployeesAboveAge(employees, 40);
    }
}
