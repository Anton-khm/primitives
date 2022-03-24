package Lesson24;

public class Test1 {

}

class A{
    String s = "privet";
    void abc(){
        System.out.println("???");
    }
}

class B extends A{
    String s = "poka";
    void abc(){
        System.out.println("!!!");
    }
}

class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.abc();                    // вызывается перезаписанный метод из класса В
        System.out.println(c.s);        // вызывается измененная переменная из класса В
    }
}
