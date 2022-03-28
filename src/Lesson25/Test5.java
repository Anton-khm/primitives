package Lesson25;

public class Test5 {

}

class Test10{
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}
class Test30 extends Test20{
    int a = 15;
    void abc(){
    //  super.abc();               // вызвать метод абс из класса Тест20
      System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);   //downcasting. Поверь что переменная t это переменная типа Test10
        // На экран выводится 5.
        ((Test10)t).abc();  // в независимости от того что указано в скобках: Test10, Test20, Test30, все равно java
        // видит что t ссылается на объект Test30.
        ((Test20)t).abc();
    }
}