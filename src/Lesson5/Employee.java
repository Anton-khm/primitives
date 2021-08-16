package Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    void raisingSalaryTwice (int salary) {
        System.out.println(salary * 2);
    }
}
    class EmployeeTest {
        public static void main(String[] args) {
            Employee first = new Employee();
            Employee second = new Employee();
            System.out.print("Salary of the first worker: "); first.raisingSalaryTwice(450);
            System.out.print("Salary of the second worker: "); second.raisingSalaryTwice(550);
        }
    }