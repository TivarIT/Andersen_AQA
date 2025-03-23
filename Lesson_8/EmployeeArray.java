package Lesson_8;

public class EmployeeArray {
    public static Employee[] createEmployees() {
        return new Employee[]{
                new Employee("Ivan Ivanov", "Engineer", "ivanov@mail.com", "892312312", 50000, 30),
                new Employee("Petr Petrov", "Manager", "petrov@mail.com", "892345678", 60000, 45),
                new Employee("Sergey Sergeev", "Developer", "sergeev@mail.com", "892398765", 70000, 42),
                new Employee("Alexey Alexeev", "Analyst", "alexeev@mail.com", "892312399", 55000, 38),
                new Employee("Dmitry Dmitriev", "Director", "dmitriev@mail.com", "892365432", 90000, 50)
        };
    }
}