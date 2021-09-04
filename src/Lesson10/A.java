package Lesson10;

import Lesson9.*;   //импортировать все классы из пэкеджа лэссон9
import Lesson9.Car;    // импортировать один класс
import java.lang.*;  // позволяет писать такие слова как String, System без указания класса
import static Lesson9.Car.a;  //импортировать статичную переменную
import static Lesson9.Car.*; //импортировать все статичные переменные класса

public class A {
    public static void main(String[] args) {                                   //static метод, потому что: программа только запускается,
        // никаких объектов класса
        // не создано
        // поэтому мы должны использовать метод который может срабатывать без существования классов
        Lesson9.Car c1 = new Lesson9.Car("black", "V6");
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c);
        System.out.println(a);
        System.out.println(count);
    }
}

class B{
    Student st3 = new Student();
}