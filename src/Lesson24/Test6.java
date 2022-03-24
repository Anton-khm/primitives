package Lesson24;

public class Test6 {

    //начиная с Java9 можно писать private method в интерфейсе
}

interface Int1{
    private static void method1(){
        System.out.println("static method");
    }

    void method2();  // access modifier -- public

    //private void method2();  -- так писать нельзя, нужно тело
    //abstract void method2();  --- нужно так писать
    //private abstract void method2();  -- нельзя совмещать и private и abstract

    private void method3(){
        System.out.println("non-static method");
    }

    default void method4(){
        method1();   // вызвали static метод внутри non-static метода
        method3();   // вызвали non-static метод внутри non-static метода
    }

    static void method5(){
        method1();    // вызвали static метод внутри static метода
        //method3();   --вызвать non-static метод внутри static метода нельзя
    }
}


