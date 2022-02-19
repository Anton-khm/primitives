package Lesson12.Homework;

import Lesson11.Homework.Lesson11;
import Lesson11.Student;

public class StudentTest {

    public static void method1(Student st1, Student st2) {              // один if statement
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade==st2.grade){
            System.out.println("Studenty ravny");
        }
        else {
            System.out.println("Studenty ne ravny");
        }
    }

    public static void method2(Student st1, Student st2) {
// nested if statement

        if (st1.name.equals(st2.name)){         //equals используется при сравнении типа данных String
            if(st1.course == st2.course){
                if(st1.grade == st2.grade){
                    System.out.println("Imena, kurs i ocenki ravny");
                } else {
                    System.out.println("Imena i kurs ravny, ocenki ne ravny");
                }
            } else {
                    System.out.println("Imena ravny, kurs ne raven");
                }
            } else {
            System.out.println("Imena ne ravny");
        }
    }


    public static void main(String[] args) {
        Student s1 = new Student("Leha", 3, 7);
        Student s2 = new Student("Leha", 3, 7);

        method1(s1, s2);
        method2(s1, s2);
    }

}

