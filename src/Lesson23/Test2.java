package Lesson23;

public class Test2 {
    public Object abc(){return new Doctor();}   // любой доктор это обджект
// public Object abc(){return new int[] {2,7,4,0};}   // массив это обджект

    public static void main(String[] args) {

        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();   // доктор -- это обязательно работник, читаем справа налево
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
    //    emp1.lechit();  // в таких случаях компилятор смотрит на тип данных референс переменной (Employee). У клсса Employee нету
        // метода lechit, поэтому ошибка компиляции.


        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

    //    Driver dr1 = new Employee();  Работник -- это не обязательно водитель, так писать нельзя.
    }
}

class Employee {
    double salary;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {        // доктор наследует от класса employee все атрибуты и может обращаться
    // к ним как буто они написаны в его теле
    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {
    String nazvanieMachini;

    void vodit() {
        System.out.println("Vodit");
    }
}
