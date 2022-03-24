package Lesson24;
import java.util.ArrayList;
public class Test5 {

}

interface I1{
    default void abc(){
        System.out.println("eto method abc");
    }
    static void def(){                      // static метод не наследуется из интерфейса классом
        System.out.println("static method 1");
    }
}

interface I2{
    static void def(){                      // static метод не наследуется из интерфейса классом
        System.out.println("static method 2");
    }
}

abstract class O{}

 class R extends O implements I1{
    static I2 method1(I2 i){return new D2();}
     public static void main(String[] args) {
        I2 i = new D2();        // D2 имплементирует интерфейс I2
        method1(i);
     }
 }

 class D2 implements I2{}

//-----------------------------------------------------
  //  Все методы в интерфейсе имеют access modifier – public по умолчанию.
//interface I1{
//    void abc();
//    default void def(){                 // default в интерфейсе это не access modifier, это просто слово
//                                        // дефолтный метод интерфейса можно не оверрайдить в классе, в отличие
//                                        // от абстрактного метода
//                                        // должен иметь тело {}
//        System.out.println("eto method def");
//    }
//}

//class Z2 implements I1{
//    public void abc(){
//        System.out.println("eto method abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 z = new Z2();
//        z.abc();
//        z.def();
//    }
//}

//-----------------------------------------------------
//interface I1{
//    default void abc(){
//        System.out.println("eto method abc");
//    }
//    static void def(){
//        System.out.println("static method");
//    }
//}
//
//interface I2 extends I1{
//    void abc();             // дефолтный метод становится абстрактным.
//    // Классы, которые будут имплементировать I2, будут оверрайдить abc.
//}
//
//abstract class R implements I1{
//    abstract public void abc();                                     // без оверрайда abc
//    //public void abc(){System.out.println("eto method abc!!!")};   // override abc
//}

//-----------------------------------------------------
//interface I1{
//    default void abc(){
//        System.out.println("eto method abc");
//    }
//    static void def(){                      // static метод не наследуется из интерфейса классом
//        System.out.println("static method 1");
//    }
//}
//
//interface I2{
//    static void def(){                      // static метод не наследуется из интерфейса классом
//        System.out.println("static method 2");
//    }
//}
//
// class R implements I1, I2{
//     public static void main(String[] args) {
//        I1.def();   // можно обращаться к статик методу с помощью названия интерфейса
//         I2.def();
//     }
//}

//-----------------------------------------------------