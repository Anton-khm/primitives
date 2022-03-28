package Lesson25;

import Lesson10.p4.D;

public class Test3 {
    public static void main(String[] args) {

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();  // Upcasting; снизу вверх
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        Employee [] array = {emp1, emp2, emp3, emp4 };
        for (Employee e:array){
            if(e instanceof Driver) {
                System.out.println(((Driver) e).nazvanieMachini);  // если Driver то делаю кастинг, вывожу переменную,
                // вызываю метод.
                ((Driver) e).vodit();
            }
        }
        Help_able h = new Doctor();
        h.help();
        System.out.println(((Doctor)h).specializaciya);
//        Doctor d1 = (Doctor)emp1;   // Downcasting, сверху вниз. Говорим компилятору поверить что emp1 это Doctor.
//        System.out.println(d1.specializaciya);
        System.out.println(((Doctor)emp1).specializaciya);  // Downcasting. Говорим компилятору поверить что emp1 это Doctor.
    }
}

class Employee extends java.lang.Object{
    double salary=100;
    String name="Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee implements Help_able{        // доктор наследует от класса employee все атрибуты и может обращаться
    // к ним как буто они написаны в его теле
    String specializaciya = "xirurg";
    public void help(){
        System.out.println("Doctor okazivaet pomosch");
    }
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
    String nazvanieMachini="Mercedes";

    void vodit() {
        System.out.println("Vodit");
    }
}

interface Help_able{
    void help();
}