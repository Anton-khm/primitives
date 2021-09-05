package Lesson11;

import Lesson10.p4.p5.E;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;     // переменная объекта присваивается параметру конструктора
        this.salary = salary;
    }

    public double uvelichitel(double a){
        a = a *2;
        return a;
    }

    public double zp2(){
        return salary * 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);  // подставляем значение зарплаты в метод, а не саму переменную salary
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}