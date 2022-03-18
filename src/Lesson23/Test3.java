package Lesson23;


public class Test3 {
    public static void main(String[] args) {
        Employee2 e = new Teacher2();
        e.eat();                        // вызывается метод из класса Teacher2 а не из класса Employee2
    }
}

class Eda{}
class Frukti extends Eda{}

class Employee2 {
    double salary;
    String name;
    int age;
    int experience;

  public Eda eat(){
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

//    void eat() {                                    // overriding method
//        System.out.println("Kushaet rabotnik");
//    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher2 extends Employee2 {
    public Frukti eat(){
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

//    void eat() {                                         // overriding method
//        System.out.println("Kushaet uchitel");
//    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class A{
Employee objectCreation(){
        return new Employee();
    }
}

class B extends A{
    Teacher objectCreation(){        // Teacher является саб-классом Employee
        System.out.println("ok");
        return new Teacher();
    }
}