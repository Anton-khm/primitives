package Lesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname3) {
       surname = surname3;
    }

    private Employee(double salary4) {
        salary = salary4;
    }

    public void ShowId (){
        System.out.println(id);
    }

    public void ShowSurname (){
        System.out.println(surname);
    }

    public void ShowSalary (){
        System.out.println(salary);
    }
}

class EmployeeTest1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petrov");
        System.out.println(emp1.surname);
        Employee emp2 = new Employee(15);
        System.out.println(emp2.id);
        /*Employee emp3 = new Employee(500.0);
        System.out.println(emp3.salary);*/

        emp1.ShowSurname();
        emp1.ShowSalary();
        emp1.ShowId();

        emp2.ShowSalary();
        emp2.ShowId();
        emp2.ShowSurname();
    }
 }