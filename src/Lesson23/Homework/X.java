package Lesson23.Homework;

import Lesson23.Homework2.*;

public class X {
//    protected void abc(){
//        System.out.println("X");
//    }
    public X(){
        System.out.println("X");
    }
    public X(int i){
        System.out.println("X" + i);
    }
    private boolean abc(){return false;}

    public static void main(String[] args) {
        X x = new Y(18);                // При создании объекта
        // Y срабатывает конструктор его суперкласса, выводится на экран “Х”.
        // Затем выводится на экран “Y” и объект считается созданным.
        System.out.println(x.abc());
    }
}
