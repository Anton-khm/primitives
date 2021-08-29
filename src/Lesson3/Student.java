package Lesson3;

public class Student {
    int ticketNumber;
    String firstName;
    String lastName;
    int studyYear;
    double avgMath;
    double avgEco;
    double avgEnglish;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.avgMath = 7;
        student1.avgEco = 8;
        student1.avgEnglish = 9;

        student2.avgMath = 8;
        student2.avgEco = 10;
        student2.avgEnglish = 8;
        double avgStudent2 = (student2.avgMath + student2.avgEco + student2.avgEnglish) / 3;

        student3.avgMath = 9;
        student3.avgEco = 8;
        student3.avgEnglish = 9;
        double avgStudent3 = (student3.avgMath + student3.avgEco + student3.avgEnglish) / 3;

        System.out.println("Ср арифм первого студента: " + ((student1.avgMath + student1.avgEco + student1.avgEnglish) / 3));
        System.out.println("Ср арифм второго студента: " + avgStudent2);
        System.out.println("Ср арифм третьего студента: " + avgStudent3);
    }
}

