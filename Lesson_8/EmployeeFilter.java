package Lesson_8;

public class EmployeeFilter {
    public static void printEmployeesAboveAge(Employee[] employees, int age) {
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                employee.printInfo();
            }
        }
    }
}
