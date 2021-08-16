package Lesson5;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    // ocenki po 10 ballnoi schkale
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
}

class StudentTest {

    double srArifmOcenka(Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.foreignLanguageAverageGrade) / 3;
        System.out.println("Student: " + st.name + " " + st.surname + " " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Alex";
        st1.surname = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 7.5;
        st1.economicsAverageGrade = 8.1;
        st1.foreignLanguageAverageGrade = 9.0;

        StudentTest sTest = new StudentTest();
        sTest.srArifmOcenka(st1);
    }
}
