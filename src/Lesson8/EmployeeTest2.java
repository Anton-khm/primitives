package Lesson8;

import Lesson7.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        //Lesson7.Employee emp1 = new Lesson7.Employee("Petrov");
        Lesson7.Employee emp2 = new Lesson7.Employee(15);
        //Lesson7.Employee emp3 = new Lesson7.Employee(500.0);

        System.out.println(emp2.surname);
        //System.out.println(emp2.id);
        //System.out.println(emp2.salary);

        emp2.ShowSurname();
        emp2.ShowId();
        emp2.ShowSalary();

    }
}
