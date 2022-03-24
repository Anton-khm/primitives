package Lesson24;

import Lesson10.p4.D;

public class Test3 { // только один класс может быть паблик в пакете
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
     //   System.out.println(h.salary);  не находит такую переменную в интерфейсе
        h.pomosch();
        h.tushitPojar();
     //   h.eat();  не находит такой метод в интерфейсе
        s.swim();
    }
}

class Employee{
    double salary = 100;
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

class Driver extends Employee implements Help_able, Swim_able{
    String nazvanieMashini;
    void vodit() { System.out.println("Vodit"); }
    public void pomosch(){
        System.out.println("Voditel okazyvaet pomosch");
    }
    public void tushitPojar(){
        System.out.println("Voditel tushit pojar");
    }
    public void swim(){
        System.out.println("Voditel mojet plavat");
    }
}

class Teacher extends Employee implements Help_able{
    int kolichestvoUchenikov;
    void uchit() { System.out.println("Uchit"); }
    public void pomosch(){
        System.out.println("Uchitel okazyvaet pomosch");
    }
    public void tushitPojar(){
        System.out.println("Uchitel tushit pojar");
    }
}

interface Help_able{    // интерфейс может содержать только абстрактные методы, т.е. без тел {}
    void pomosch();
    void tushitPojar();
    public final static int a = 10;   // интерфейс содержит в себе только константы
}

interface Swim_able{
    void swim();
}