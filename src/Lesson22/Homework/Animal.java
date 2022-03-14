package Lesson22.Homework;

import Lesson10.p1.A;
import Lesson10.p1.p2.p3.C;

class Animal {
    int eyes;

    Animal(){
        System.out.println("I am animal");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    void drink(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail=1;
    int paw=4;

    Pet(){
        System.out.println("I am pet");
        eyes = 2;
    }

    void run(){
        System.out.println("Pet runs");
    }

    void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {

    Dog(String name){
        this.name=name;
        System.out.println("I am dog and my name is: " + name);
    }

    void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    Cat(String name){
        this.name=name;
        System.out.println("I am cat and my name is: " + name);
    }

    void sleep(){
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Zhuzha");
        System.out.println("kollichestvo lap: " + dog1.paw);
        Cat cat1 = new Cat("Barsik");
        cat1.sleep();
    }
}