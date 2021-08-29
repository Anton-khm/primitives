package Lesson5.Homework;

public class Student {

    Student (int studentId1, String firstName1, String lastName1, int course1, double avgMark1){
        studentId = studentId1;
        firstName = firstName1;
        lastName = lastName1;
        course = course1;
        avgMark = avgMark1;
    }

    Student (int studentId2, String firstName2, String lastName2, int course2){
        this(studentId2,firstName2,lastName2,course2,0.0);
    }

    Student (){
    }

    int studentId;
    String firstName;
    String lastName;
    int course;
    double avgMark;

}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 15;
        st1.firstName = "Anton";
        st1.lastName = "Petrov";
        st1.course = 3;
        st1.avgMark = 8.6;

        Student st2 = new Student(15, "Anton", "Petrov",3);
        st2.avgMark = 8.9;

        Student st3 = new Student(18,"Alex","Grizzman",4,8.8);
    }
}

