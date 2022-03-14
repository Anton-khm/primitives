package Lesson22;

public class Test4 {

}

class Human2 {
    Human2(){}          // дефолтный конструктор, ничего не делает. вызывается неявно
                        // вызывается конструктор суперкласса выше, так до тех пор пока не дойдет до Object

//    Human2 (String n){
//        this(n, null);
//    }
//
//    Human2 (String name, String surname){
//        this.name = name;           // к элементу name текущего объекта присвоить параметр name
//        this.surname = surname;
//    }

    String name;
    String surname;
}

class Student2 extends Human2 {

    Student2() {             // вызывается конструктор суперкласса -- Human2
        super();
    }

    public static void main(String[] args) {
        Student2 s = new Student2();         // вызывается конструктор Student2
    }
}