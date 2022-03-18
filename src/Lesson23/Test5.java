package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee3 emp = new Employee3();
        Teacher3 t = new Teacher3();
       // emp.sleep();
      //  t.sleep();
        Employee3 e = new Teacher3();
        e.sleep();
        System.out.println(t.salary);
    }
}

class Eda2{}
class Frukti2 extends Eda2{}

class Employee3 {
    double salary = 100;                        // hidden variable method
    String name = "Kolya";

    public Eda2 eat(){
        System.out.println("Kushaet rabotnik");
        Eda2 e = new Eda2();
        return e;
    }

    static void sleep() {
        System.out.println("Spit rabotnik");
    }  // hidden method
}

class Teacher3 extends Employee3 {
    double salary = 200;                      // hiding variable

    public Frukti2 eat(){
        System.out.println("Kushaet uchitel");
        Frukti2 f = new Frukti2();
        return f;
    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    static void sleep() {
        System.out.println("Spit uchitel");
    }   // hiding method
}
