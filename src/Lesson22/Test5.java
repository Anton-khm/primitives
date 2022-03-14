package Lesson22;

public class Test5 {
}

class Human3{
    String name;
    String surname;

    Human3 (String name, String surname){     // 3) на первой строке конструктор вызывает конструктор Object, тот ничего не делает
                                // 4) возвращает управление этому конструктору. Этот конструктор назначает переменным значения.
                // 5) возвращает управление конструктору Student3
        this.name = name;
        this.surname = surname;
    }

}
class Student3 extends Human3{
    int course;

    Student3(String name, String surname, int course){

        super(name, surname);   // 2) вызывается супер конструктор Human3 с параметрами name,surname
        this.course=course;     // 6) переменной назначается значение
    }

    public static void main(String[] args) {
        Student3 s = new Student3("Kolya", "Ivanov", 3);   // 1) при вызове конструктора Student3
        System.out.println(s.course);   // 7) выводится name, surname, course
    }
}
