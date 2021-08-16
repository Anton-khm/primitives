package Lesson6;

public class Employee {

    Employee(int id2, String surname2, int age2) {
        surname = surname2;
        age = age2;
        id = id2;
    }

    Employee(String surname3, int age3) {
        this (0, surname3, age3);
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "IVANOV", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("PETROV", 30);
        System.out.println(emp2.surname);
    }
}
