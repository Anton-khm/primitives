package Lesson22;

public class Test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.specializaciya = "Hirurg";
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
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