package Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {   // когда в параметр метода подставляется референс тип данных,
        // в параметры этого метода подставляются копии этих референсов.
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName (Student s1){
        s1.name = "Vasiliy";             // с помощью референса мы можем изменять элементы объекта(с помощью копий)
    }  // с помощью копий мы можем изменять имя(name), но мы не можем менять референсы на объекты

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}
